package com.practice

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.col
import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}

object SqlOperation {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("Sql Operations")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("WARN")


//1. Load CSV files into DataFrames with schema inference.
    val schemaDepartment = StructType(Array(
      StructField("dept_id", IntegerType, true),
      StructField("department", StringType, true),
      StructField("location", StringType, true)
    ))

    val schemaEmployee = StructType(Array(
      StructField("emp_id", IntegerType, true),
      StructField("name", StringType, true),
      StructField("age", IntegerType, true),
      StructField("department", StringType, true),
      StructField("salary", IntegerType, true)
    ))

    val departments = spark.read
      .option("header", "true")
      .schema(schemaDepartment)
      .csv("src/main/resources/departments.csv")

    val employees = spark.read
      .option("header", "true")
      .schema(schemaEmployee)
      .csv("src/main/resources/employees.csv")

    employees.createOrReplaceTempView("employees")
    departments.createOrReplaceTempView("departments")


//2. Select specific columns from employees.
    val employee_list = spark.sql("SELECT * FROM employees")
    val department_list = spark.sql("SELECT * FROM departments")
//    employee_list.show()
//    department_list.show()


//3. Filter employees where salary > 60,000.
    val employee_salary = spark.sql("SELECT * FROM employees WHERE salary > 60000")
//    employee_salary.show()


//4. Group employees by department and calculate average salary.
    val department_average_salary = spark.sql(
      """
        |SELECT d.department,
        |       AVG(e.salary) AS avg_salary
        |FROM departments AS d
        |JOIN employees AS e
        |  ON e.department = d.department
        |GROUP BY d.department
        |ORDER BY avg_salary DESC
  """.stripMargin)
//    department_average_salary.show()


//5. Find the highest paid employee in each department.
    val employeeWithHighSalary = spark.sql(
      """
        |WITH high_salary AS (
        |  SELECT emp_id,
        |         name,
        |         department,
        |         salary,
        |         DENSE_RANK() OVER(PARTITION BY department ORDER BY salary DESC) AS rnk
        |  FROM employees
        |)
        |SELECT name, department, salary
        |FROM high_salary
        |WHERE rnk = 1
  """.stripMargin
    )
//    employeeWithHighSalary.show()


//6. Add a new column to employees showing salary category (High if >70k, else Medium/Low).
    val EmployeeLists = spark.sql(
      """
        |SELECT *,
        |       CASE
        |         WHEN salary >= 70000 THEN 'HIGH'
        |         WHEN salary > 40000 AND salary < 70000 THEN 'Medium'
        |         ELSE 'Low'
        |       END AS salary_category
        |FROM employees
  """.stripMargin)
//    EmployeeLists.show()


// 7. Sort Employees by salary in descending
    val sortedEmployees = employees.select(col("*"))
      .sort(col("salary"))
      .orderBy(col("salary").desc)
//    sortedEmployees.show()


// 8. Join department with employee to get location
    val employeeLocations = employees.join(departments, "department")
      .select("emp_id","name", "department", "location")
//    employeeLocations.show()

  }
}
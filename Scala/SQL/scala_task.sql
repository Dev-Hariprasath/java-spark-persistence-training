CREATE SCHEMA SCALA;
USE SCALA;

CREATE TABLE EMPLOYEES (
empID INT PRIMARY KEY,
empName VARCHAR(50),
salary INT NOT NULL,
deptName VARCHAR(50)
);

INSERT INTO EMPLOYEES (empID, empName, salary, deptName) VALUES
(1, 'HARI', 10000, 'Dev'),
(2, 'PRASATH', 20000, 'Dev'),
(3, 'MARAN', 25000, 'Dev'),
(4, 'JEEVA', 60000, 'IT'),
(5, 'ARUL', 80000, 'IT'),
(6, 'ARUN', 27000, 'IT');

SELECT * FROM EMPLOYEES;


-- Rank Employeess By Salary
SELECT 
empId, 
empName, 
Salary, 
deptName, 
ROW_NUMBER() OVER(ORDER BY salary DESC) AS rank_dept
FROM Employees;


-- Rank Employeess By Salary Partition By Department Name
SELECT 
empId, 
empName, 
Salary, 
deptName, 
ROW_NUMBER() OVER(PARTITION BY deptName ORDER BY salary DESC) AS rank_dept
FROM Employees;


-- Running Salary
SELECT 
empId, 
empName, 
Salary, 
deptName, 
SUM(salary) OVER(ORDER BY salary DESC) AS running_salary
FROM Employees;


-- compare the salary of employee with previous and next one
SELECT 
empId, 
empName, 
Salary, 
LAG(salary) OVER(ORDER BY salary) AS previous_salary,
LEAD(salary) OVER(ORDER BY salary) AS next_salary
FROM Employees;

INSERT INTO EMPLOYEES (empID, empName, salary, deptName) VALUES 
(7, 'ARUN', 27000, 'IT');


-- Rank employee by there salary partition by dept
SELECT 
empId, 
empName, 
Salary, 
RANK() OVER(PARTITION BY deptName ORDER BY salary) AS salary_rank
FROM Employees;


-- Rank Without Partition 
SELECT 
empId, 
empName, 
Salary, 
RANK() OVER(ORDER BY salary) AS salary_rank
FROM Employees;

UPDATE EMPLOYEES SET empName = 'Rogan' WHERE empID = 7;


-- Dense Rank for the Employees salary Partition By department Name
SELECT 
empId, 
empName, 
Salary, 
deptName,
DENSE_RANK() OVER(PARTITION BY deptName ORDER BY salary) AS salary_rank
FROM Employees;


-- Dense Rank for the Employees Partition By 
SELECT 
empId, 
empName, 
Salary, 
deptName,
DENSE_RANK() OVER(PARTITION BY deptName ORDER BY salary) AS salary_rank
FROM Employees;


-- NTILE
SELECT 
empId, 
empName, 
Salary, 
deptName,
NTILE(3) OVER(ORDER BY salary) salary_quartile
FROM Employees;

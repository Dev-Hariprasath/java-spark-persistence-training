USE cte;

CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    salary DECIMAL(10, 2)
);
 
 
INSERT INTO employees (name, department, salary) VALUES
('John Doe', 'Sales', 55000.00),
('Jane Smith', 'Sales', 60000.00),
('Jim Brown', 'Sales', 65000.00),
('Jake White', 'Engineering', 75000.00),
('Jill Green', 'Engineering', 80000.00),
('Jenny Black', 'Engineering', 85000.00),
('James Gray', 'Marketing', 50000.00),
('Janet Blue', 'Marketing', 52000.00),
('Joan Pink', 'Marketing', 54000.00);


WITH department_salaries AS (
SELECT department,
SUM(Salary) AS total_salary,
AVG(Salary) AS average_salary
FROM employees
GROUP BY department
)
SELECT department, total_salary, average_salary
FROM department_salaries
WHERE average_salary > 60000;


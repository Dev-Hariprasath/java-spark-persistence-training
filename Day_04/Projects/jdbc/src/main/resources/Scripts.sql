-- Create Table
CREATE TABLE EMPLOYEE (
    id INT PRIMARY KEY,
    empName VARCHAR(255) NOT NULL,
    Dept VARCHAR(255) NOT NULL,
    Des VARCHAR(255) NOT NULL,
    Salary INT CHECK (salary > 0)
);


--Index
CREATE INDEX idx_dept ON EMPLOYEE(Dept);
CREATE INDEX idx_designation ON EMPLOYEE(Des);


--Insert Value
INSERT INTO EMPLOYEE (id, empName, Dept, Des, Salary) VALUES
(1, 'Alice',    'HR',        'Manager',     60000),
(2, 'Bob',      'Finance',   'Analyst',     55000),
(3, 'Charlie',  'IT',        'Developer',   70000),
(4, 'David',    'IT',        'Tester',      50000),
(5, 'Eva',      'HR',        'Recruiter',   52000),
(6, 'Frank',    'Sales',     'Executive',   48000),
(7, 'Grace',    'Marketing', 'Coordinator', 51000),
(8, 'Helen',    'Finance',   'Manager',     65000),
(9, 'Ian',      'IT',        'Support',     47000),
(10,'Julia',    'Sales',     'Manager',     62000);

--Procedure
DELIMITER $$

CREATE PROCEDURE create_emp (
	IN p_id INT,
    IN p_empName VARCHAR(255),
    IN p_Dept VARCHAR(255),
    IN p_Des VARCHAR(255),
    IN p_Salary INT
)
BEGIN
	INSERT INTO EMPLOYEE (id, empName, Dept, Des, Salary)
    VALUES (p_id, p_empName, p_Dept, p_Des, p_Salary);
END$$

DELIMITER ;

--Function
CREATE FUNCTION getUpperName(name VARCHAR(50))
RETURNS VARCHAR(50)
DETERMINISTIC
RETURN UPPER(name);

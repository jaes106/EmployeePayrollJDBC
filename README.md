# EmployeePayrollJDBC

Java JDBC implementation of the Employee Payroll Service learning problem.

This project demonstrates how a Java application connects to a MySQL database using JDBC and performs CRUD operations step-by-step using Git feature branches.

---

# Technologies Used

Java  
JDBC  
MySQL  
Maven  
Git & GitHub

# Use Cases

## UC1 – Connect Java Program to Database
Establish connection between Java application and MySQL database using JDBC.

Concepts:
- JDBC Driver
- DriverManager
- Database connection

---

## UC2 – Retrieve Employee Payroll Data
Fetch employee payroll records from the database using SQL SELECT query.

Concepts:
- Statement
- ResultSet
- Reading database records

---

## UC3 – Update Employee Salary
Update the salary of an employee in the database.

SQL example:

UPDATE employee_payroll  
SET salary = 3000000  
WHERE name = 'Terisa';

Concepts:
- executeUpdate()

---

## UC4 – Use PreparedStatement for Updates
Use PreparedStatement instead of Statement to safely update employee salary.

Concepts:
- PreparedStatement
- Parameterized queries

---

## UC5 – Retrieve Employees by Date Range
Fetch employees whose start date falls within a specific range.

SQL example:

SELECT *
FROM employee_payroll  
WHERE start BETWEEN '2018-01-01' AND '2020-12-31';

Concepts:
- Date filtering
- PreparedStatement parameters

---

## UC6 – Calculate Salary Statistics
Calculate salary statistics grouped by gender.

SQL example:

SELECT gender,  
SUM(salary),  
AVG(salary),  
MIN(salary),  
MAX(salary),  
COUNT(*)  
FROM employee_payroll  
GROUP BY gender;

Concepts:
- Aggregate functions
- Group by

---

-- 1.Display all employees with their department names
SELECT *
FROM company.Employee e
JOIN company.Department d
ON e.dept_id = d.dept_id;

SELECT e.emp_id,e.emp_name,e.salary,e.hire_date,d.dept_name,d.location
FROM company.Employee e
JOIN company.Department d
ON e.dept_id = d.dept_id;

-- Both are correct

-- 2.Find Employees who earns more than 50,000
SELECT emp_id,emp_name, salary
FROM company.Employee
WHERE salary > 50000;

-- 3.List Employees in ascending order of salary
SELECT * 
FROM company.Employee
ORDER BY salary asc;

-- 4.Find the average salary in each department
SELECT AVG(e.salary),d.dept_name
FROM company.Employee e
JOIN company.Department d
ON e.dept_id = d.dept_id
GROUP BY d.dept_name;

-- 5.Count the number of employees in each department
SELECT COUNT(e.emp_name),d.dept_name
FROM company.Employee e
JOIN company.Department d
ON e.dept_id = d.dept_id
GROUP BY d.dept_name;

-- 6.Find Department having more than 2 employees
SELECT COUNT(e.emp_name),d.dept_name
FROM company.Employee e
JOIN company.Department d
ON e.dept_id = d.dept_id
GROUP BY d.dept_name
HAVING COUNT(e.emp_name)>2;

-- 7.List Employees along with the projects they are working on
SELECT 	e.emp_id,e.emp_name,p.project_name,p.budget
FROM company.Employee e
JOIN company.Project p
ON e.dept_id=p.dept_id;

-- 8.Show Employee name,department name and project name for all employees
SELECT e.emp_id,e.emp_name,d.dept_name,p.project_name
FROM company.Employee e
JOIN company.Department d
ON e.dept_id = d.dept_id
JOIN company.Project p
ON e.dept_id = p.dept_id;

-- 9.Find Employees who earn more than average salary of all employees
SELECT emp_id,emp_name,salary 
FROM company.Employee
WHERE salary >(SELECT AVG(salary) from company.Employee);

-- 10.Find employees who work in the same department as "John"

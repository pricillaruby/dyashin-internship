CREATE TABLE company.Department(
	dept_id SERIAL UNIQUE PRIMARY KEY NOT NULL,
	dept_name VARCHAR(100) NOT NULL,
	location VARCHAR(100) NOT NULL
);

SELECT * FROM company.Department;

CREATE TABLE company.Employee(
	emp_id SERIAL UNIQUE PRIMARY KEY NOT NULL,
	emp_name VARCHAR(100) NOT NULL,
	salary FLOAT NOT NULL CHECK(salary>0),
	hire_date DATE DEFAULT CURRENT_DATE,
	dept_id INT,
	FOREIGN KEY(dept_id) REFERENCES company.Department(dept_id)
);

SELECT * FROM company.Employee;

CREATE TABLE company.Project(
	project_id SERIAL PRIMARY KEY UNIQUE NOT NULL,
	project_name VARCHAR(100) NOT NULL,
	budjet INT NOT NULL CHECK(budjet>0),
	dept_id INT,
	FOREIGN KEY(dept_id) REFERENCES company.Department(dept_id)
)

SELECT * FROM company.Project;

ALTER TABLE company.Project RENAME COLUMN budjet to budget;

CREATE TABLE company.WorksOn(
	emp_id INT,
	FOREIGN KEY(emp_id) REFERENCES company.Employee(emp_id),
	project_id INT,
	FOREIGN KEY(project_id) REFERENCES company.Project(project_id),
	hours_worked INT NOT NULL
)

SELECT * FROM company.WorksOn;
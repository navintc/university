-- 11
select lecturer.lec_code, lecturer.specialization, lecturer.salary FROM lecturer INNER JOIN department ON lecturer.dno = department.dept_no GROUP BY department.dname;

-- 12
select avg(lecturer.salary) FROM lecturer INNER JOIN department ON lecturer.dno = department.dept_no GROUP BY department.dname; 

-- 13
select * FROM department WHERE dept_no in (SELECT dno FROM lecturer where (salary>149000)); 

-- 14
SELECT count(lecturer.lec_code) from lecturer INNER JOIN department ON lecturer.Dno = department.dept_no GROUP BY department.dname; 

--15
SELECT lecturer.lecturername, lecturer.salary, department.dname from lecturer INNER JOIN department ON lecturer.dno = department.dept_no where lecturer.address = "Colombo"; 

-- 16
DELIMITER //
CREATE PROCEDURE salaryFind (IN valueOne INT, IN valueTwo INT)

BEGIN
SELECT * FROM lecturer WHERE salary BETWEEN valueOne AND valueTwo;
END//


-- 17
GRANT ALL PRIVILEGES ON University TO "test1"@"localhost";

-- 18
REVOKE SELECT ON University from "test1"@"localhost";

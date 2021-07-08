-- 1
CREATE DATABASE university;

-- 2
CREATE table department(
    dept_no varchar(4),
    dname varchar(8),
    PRIMARY KEY (dept_no)
);

-- 3 
CREATE TABLE lecturer (
    lec_code varchar(8),
    lecturername varchar(16),
    specialization varchar(16),
    salary int,
    address varchar(8),
    PRIMARY KEY (lec_code)
   
);


-- 4
ALTER TABLE lecturer ADD dno VARCHAR(2);

-- 5
ALTER TABLE lecturer ADD FOREIGN KEY (dno) references department(dept_no);

-- 6

INSERT into department VALUES
("CD", "computing"),
("SD", "statistics"),
("MD", "marketing"),
("BD", "buisness");

insert into lecturer VALUES 
("L100", "perera", "dbms", 120000,"colombo", "CD"),
("L101", "victor", "c++", 150000,"galle", "CD"),
("L102", "gihan", "statistics", 125000,"colombo", "SD"),
("L103", "sanath", "marketing", 180000,"kandy", "MD");


-- 7
SELECT * from lecturer;

-- 8
SELECT * from lecturer where specialization="DBMS" or specialization="C++";

-- 9
SELECT * from lecturer where salary>150000;

-- 10
SELECT * from lecturer where lecturername LIKE "P%";

-- 11
SELECT * from lecturer where salary BETWEEN 100000 AND 150000;

-- 12
UPDATE lecturer SET salary=150000 where lecturername="perera";

-- 13
DELETE FROM lecturer where lec_code="L100";

-- 14
DROP TABLE department;

-- 15
-- No, I can not. Lecturer table has a foreign key which is referencing
-- to the department table.

-- 16
SELECT department.dname, lecturer.lec_code, lecturer.specialization, lecturer.salary
FROM department INNER JOIN lecturer ON lecturer.dno=department.dept_no;

-- 17
SELECT AVG(salary) from lecturer;

-- 18
SELECT department.dname from department INNER JOIN lecturer ON department.dept_no=lecturer.dno
GROUP BY department.dname HAVING SUM(lecturer.salary)>75000;

-- 19
SELECT department.dname, count(lecturer.dno) 
from department INNER JOIN lecturer ON department.dept_no = lecturer.dno 
GROUP BY department.dname HAVING count(lecturer.dno)>2;

-- 20
SELECT lecturer.lecturername, lecturer.salary, department.dname from
lecturer INNER JOIN department ON lecturer.dno=department.dept_no WHERE lecturer.address = "Colombo";

-- note: You can't use Group by to simply select data by comparing to stuff.

-- 21
DELIMITER //
CREATE PROCEDURE betSalary (IN valueOne int, in valueTwo int)
BEGIN
SELECT lecturername from lecturer where salary BETWEEN valueOne AND valueTwo;
END//

-- Note: @ signs are used in SQL, not in MYSQL. Instead 'IN' is used.
-- 'AS' is also not used. Delimiter is a must. So is brackets.
-- DELIMITER must have have space before the symbol you are using (Eg: //)
-- use `CALL betSalary2(120000, 150000);` to use this 


-- 22
DELIMITER //
CREATE PROCEDURE highSalary (IN valuesal INT, IN name VARCHAR(16))
BEGIN
SELECT lecturername from lecturer where salary>valuesal AND lecturername LIKE CONCAT(name,'%');
END //

--NOTE: A classic CONCAT. 
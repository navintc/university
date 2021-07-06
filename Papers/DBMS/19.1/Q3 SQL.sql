CREATE table department(
	dept_no varchar(4),
    dname varchar(8),
    PRIMARY KEY (dept_no)
);

CREATE TABLE lecturer (
	lec_code varchar(8),
    lecturername varchar(16),
    specialization varchar(16),
    dno VARchar(4),
    salary int,
    address varchar(8),
    PRIMARY KEY (lec_code),
    FOREIGN KEY (dno) References department(dept_no)
);



INSERT into department VALUES
("CD", "computing"),
("SD", "statistics"),
("MD", "marketing"),
("BD", "buisness");

insert into lecturer VALUES
("L100", "perera", "dbms", "cd", 120000,"colombo"),
("L101", "victor", "c++", "cd", 150000,"galle"),("L102", "gihan", "statistics", "sd", 125000,"colombo"),
("L103", "sanath", "marketing", "md", 180000,"kandy");






q
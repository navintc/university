CREATE TABLE city(
	city varchar(16),
    province varchar(16),
    PRIMARY KEY (city)
);

CREATE TABLE university (
    unicode varchar(4),
    uniname varchar(32),
    city varchar(16),
    PRIMARY KEY(unicode),
    FOREIGN KEY (city) REFERENCES city(city)
);

CREATE TABLE lecturer (
	lec_code int,
    lecturername VARCHAR(16),
    specialization varchar(16),
    unicode VARCHAR(4),
    PRIMARY KEY (lec_code),
    FOREIGN KEY (unicode) REFERENCES university(unicode)
);

CREATE TABLE student (
	stno varchar(8),
    stname varchar(16),
    stream varchar(16),
    uniCode varchar(4),
    lec_code int,
    PRIMARY KEY (stno),
    FOREIGN KEY (unicode) REFERENCES university(unicode),
    FOREIGN KEY (lec_code) REFERENCES lecturer(lec_code)
);


INSERT INTO city VALUES
("Colombo", "Western"),
("Matara", "Southern"),
("Jayawardanapura", "Western"),
("Peradeniya", "Western");

INSERT INTO university VALUES
("UC", "University of Colombo", "Colombo"),
("UR", "University of Ruhuna", "Colombo"),
("UJ", "University of Jayawardanapura", "Jayawardanapura");

INSERT INTO lecturer VALUES
(100, "Perera", "Chemistry", "UC"),
(101, "Victor", "Physical", "UR"),
(102, "Gihan", "Economics", "UJ"),
(103, "Sanath", "Finance", "UJ");

insert into student VALUES
("st001", "Nimal", "Biology", "UC", 100),
("st002", "Kamal", "Maths", "UJ", 101),
("st003", "Saman", "Commerce", "UJ", 103);




1. select * from student where stream="biology" 
2. select * from student where lecturer.lecturername like 'p%';
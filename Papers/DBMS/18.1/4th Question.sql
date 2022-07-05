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
    unicode VARCHAR(2),
    PRIMARY KEY (lec_code),
    FOREIGN KEY (unicode) REFERENCES university(unicode)
);

CREATE TABLE student (
    stno varchar(8),
    stname varchar(16),
    stream varchar(16),
    uniCode varchar(2),
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




-- 1.
select * from student where stream="biology" 

-- 2.
select * from student where lec_code = (select lec_code from lecturer where lecturername like "p%") ;

-- 3. 
SELECT lecturername FROM lecturer where specialization="Chemistry" or specialization="Physical";

-- 4.
SELECT count(stno) from student;


-- 5. 
SELECT stream, count(*) from student GROUP BY stream; 

-- or 

SELECT count(if(stream="biology",1,null)) "Biology", count(if(stream="maths", 1, null)) "maths", count(if(stream="commerce", 1,null)) "commerce" from student;



-- 6. 
select uniname from university where unicode=(SELECT unicode from lecturer where lec_code=(select lec_code from student where stream="maths"));

-- 7.
SELECT DISTINCT university.unicode, city.province from university INNER join city on university.city=city.city 

-- 8.
SELECT uniname from university where unicode=(SELECT unicode from lecturer where lecturername like "v%" and specialization ="physical") ;

-- 9.
SELECT stname, stream from student where lec_code=(select lec_code from lecturer where unicode=(select unicode from university where uniname="University of colombo")) ;

-- 10. 
SELECT uniName from university where unicode=(select uniCode from lecturer where lec_code=(SELECT lec_code from student where stname like "s%")) ;

-- 11.
create database University;

-- 12.
create table student(
stno varchar(8),
stname varchar(16),
stream varchar(16),
unicode varchar(4),
lec_code int,
primary key (stno),
foreign key (unicode) references university(unicode),
foreign key (lec_code) references lecturer(lec_code)

);

-- 13.
update student set stream="Computer Science" where stno="st002"







-- Anjali's notes:=-------------------------------------- 

select * from student where uniCode = (
select uniCode from University where city = (
select city from city where city = 'Colombo'
));

or--


select * from student where uniCode = (
select uniCode from University where city = 'Colombo');

-- ---------------------------------------------------------

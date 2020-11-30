/*
	1026 복습 
	Outer join : 조인컬럼의 조건이 맞지 않아도 한쪽 테이블의 내용은 조회가능.
		Left outer join : 왼쪽 테이블의 내용이 전부 조회됨.
		Right outer join : 오른쪽 테이블의 내용이 전부 조회됨.
		full outer join : 양쪽 테이블의 내용이 전부 조회됨.
							=> union 명령어를 이용하여 구현 
							 
	subquery : select 구문 내부에 select 구문이 존재함 
		단일행 subquery : =,>,< ....
		복수행 subquery : in, <any, >all ....
							any : 여러개중 한개 
							all : 여러개 모두 
*/

/*
	다중 컬럼 서브쿼리 :  비교 대상 컬럼이 두개 
								any, all 사용불가 
								in 만 사용가능
*/
--학년별로 최대키를 가진 학생의 학년과 이름, 키를 출력하기 
SELECT grade, NAME, height 
FROM student 
WHERE grade = 1
AND height = (SELECT MAX(height) FROM student WHERE grade = 1)
union
SELECT grade, NAME, height 
FROM student 
WHERE grade = 2
AND height = (SELECT MAX(height) FROM student WHERE grade = 2)
union
SELECT grade, NAME, height 
FROM student 
WHERE grade = 3
AND height = (SELECT MAX(height) FROM student WHERE grade = 3)
union
SELECT grade, NAME, height 
FROM student 
WHERE grade = 4
AND height = (SELECT MAX(height) FROM student WHERE grade = 4);

SELECT grade, NAME, height 
FROM student
WHERE (grade,height) IN
(SELECT grade,MAX(height) FROM student GROUP BY grade)
ORDER BY 1;

--1. emp 테이블에서 직급별로 해당 직급의 최대 급여를 받는 
-- 직원의 모든 정보를 조회 하기 
SELECT * FROM emp 
WHERE (job,salary)IN (SELECT job,MAX(salary) FROM emp GROUP BY job);
--2. 학과별 입사일 가장 오래된 교수의 교수번호,이름,입사일,학과명 조회하기
SELECT p.no,p.name,p.hiredate,m.name
FROM professor p,major m
WHERE p.deptno=m.code
AND (deptno,hiredate) IN 
(SELECT deptno,MIN(hiredate) FROM professor GROUP BY deptno);

/*
	상호연관 서브쿼리 : 외부 query의 컬럼이 subquery에 영향을 주는 query
								성능이 안좋다.
*/
--직원의 현재 직급의 평균 급여 이상을 받는 직원의 모든 정보를 조회 하기
SELECT * FROM emp e1
WHERE salary >= (SELECT AVG(salary) FROM emp e2 WHERE e2.job = e1.job);

--교수 본인 직급의 평균급여 이상을 받는 교수의 이름, 직급, 급여, 학과명 조회하기
SELECT p.name, p.position, p.salary, m.name 
FROM professor p, major m 
WHERE p.deptno = m.code
AND salary >=(SELECT AVG(salary) FROM professor p2 WHERE p2.position=p.position);

/*
	subquery 사용 위치에 따른 분류 
		1. where 조건문 
		2. 컬럼 부분 : 스칼라 subquery라 함 
		3. having 구문 
		4. from 구문 : inline view
							반드시 alias를 지정해야 함 
*/
-- 사원이름, 직급, 부서코드, 부서명 출력하기 
SELECT e.ename,e.job,e.deptno,d.dname
FROM emp e, dept d
WHERE e.deptno = d.deptno;
--스칼라방식 
SELECT e.ename,e.job,e.deptno,
(select dname FROM dept d WHERE d.deptno = e.deptno) 부서명
FROM emp e;

--학년별 평균체중이 가장 적은 학년의 학년과 평균체중을 출력하기 
SELECT grade, AVG(weight)
FROM student
GROUP BY grade
HAVING AVG(weight) <=ALL (SELECT AVG(weight) FROM student GROUP BY grade);

SELECT grade, min(AVG) 
FROM (SELECT grade,AVG(weight) avg FROM student GROUP BY grade ORDER BY 2) a;

/*
	DDL : Data Definition Language(데이터 정의어)
	 		객체(table, index, view, user)
			생성(create), 제거(drop), 수정(alter), truncate
			transaction(commit, rollback) 처리 안됨.  
*/
/*
	create : table 을 생성하는 명령어 
*/
--test1 테이블 생성하기 
CREATE TABLE test1 (
	NO INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20),
	birth datetime
)
/*
	CREATE TABLE test1 : test1 이름을 가진 table 객체 생성 
		NO INT PRIMARY KEY AUTO_INCREMENT : 정수형값을 저장할 no 컬럼 설정. 
		     PRIMARY KEY (기본키, not null+unique) 
		     AUTO_INCREMENT : 자동으로 1씩 증가. 숫자형 기본키에 사용가능 
		     						 오라클에서 사용 안됨. => 시퀀스 객체를 이용 
*/
SELECT * FROM test1;
DESC test1;

-- 1. test2 테이블 생성하기 
-- 컬럼 : seq : 숫자, 기본키, 자동증가
-- 		 name : 문자형 20문자 
-- 		 birthday : 날짜만 
CREATE TABLE test2 (
	seq INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20),
	birthday date
)
DESC test2;
INSERT INTO test2(NAME,birthday) VALUES('홍길동','2020-01-01')
INSERT INTO test2(NAME,birthday) VALUES('김삿갓','2020-02-01')
SELECT * FROM test2

/*
	기본키가 여러 컬럼인 테이블 생성하기
*/
CREATE TABLE test3(
	NO INT,
	seq INT,
	NAME VARCHAR(20),
	PRIMARY KEY(NO,seq)
)
SELECT * FROM test3
INSERT INTO test3(NO,seq,name) VALUES(1,1,'홍길동')
INSERT INTO test3(NO,seq,name) VALUES(1,2,'김삿갓')
INSERT INTO test3(NO,seq,name) VALUES(2,1,'이몽룡')

/*
	컬럼에 기본값 설정하기 
*/
CREATE TABLE test4(
	NO INT PRIMARY KEY,
	NAME VARCHAR(30) DEFAULT '홍길동'
)
-- => 값이 입력되지 않으면 홍길동 설정 
SELECT * FROM test4;
INSERT INTO test4(NO) VALUES(1)
DESC test4;

/*
	기존의 테이블을 이용하여 새로운 테이블 생성하기 
*/
--dept 테이블의 모든 컬럼과 모든 레코드를 가진 depttest1 테이블 생성하기 
SELECT * FROM dept;
CREATE TABLE depttest1
AS SELECT * FROM dept;
SELECT * FROM depttest1;

--dept 테이블의 deptno, danme 컬럼을 가진 depttest1 테이블 생성하기 
CREATE TABLE depttest2
AS SELECT deptno,dname FROM dept
SELECT * FROM depttest2;

--dept 테이블의 모든 컬럼과 지역이 서울인 레코드만 가진 
--depttest3 테이블을 생성하자 
CREATE TABLE depttest3
AS SELECT * FROM dept WHERE loc = '서울'
SELECT * FROM depttest3;

--dept 테이블의 deptno, dname 컬럼을 가지고 있는 데이터는 없는 
--depttest4 테이블을 생성하자 
CREATE TABLE depttest4
AS SELECT deptno, dname FROM dept WHERE 1=2
SELECT * FROM depttest4;

--1. 교수테이블에서 101학과 교수들로 이루어진 테이블 
-- professor_101 생성하기 
-- 컬럼은 교수번호, 이름, 학과코드, 직책, 학과명을 가진다. 
CREATE TABLE professor_101
AS SELECT NO,p.NAME,deptno,POSITION,m.name mname
FROM professor p,major m
WHERE p.deptno=m.code AND p.deptno = 101;
SELECT * FROM professor_101;

--현재 database 의 table 목록 보기 
SHOW TABLES

DESC professor_101;
DESC depttest1;

--professor_101 테이블에 index 생성하기 
CREATE INDEX professor_101_name ON professor_101(NAME);

--시험 
SELECT * FROM CAR
CREATE TABLE CAR(
	NO INT(11) PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20),
	ENGINE INT(11),
	makingdate DATETIME,
	color VARCHAR(30),
	owner_no INT(4)
)
INSERT INTO CAR(NO,NAME,color) VALUES(11,'홍길동','빨강')

SELECT * FROM car_info
CREATE TABLE car_info
AS SELECT NO,NAME,color FROM CAR WHERE NO = 10

SELECT position,COUNT(POSITION),COUNT(bonus)
FROM professor
GROUP BY POSITION

SELECT deptno,COUNT(deptno) '부서코드별 인원수',
SUM(salary) 총급여,SUM(ifnull(bonus,0)) 총보너스,
AVG(salary) 급여평균,AVG(ifnull(bonus,0)) 보너스평균
FROM professor
GROUP BY deptno

SELECT o.name 소유자이름, o.tel 전화번호,
c.name 자동차이름, c.color 색상 
FROM CAR c,owner o
WHERE c.owner_no = o.no

SELECT e.empno 사원번호,e.ename 사원이름, e.job 직급,
e1.empno 상사번호,e1.ename 상사이름
FROM emp e,emp e1
WHERE e.mgr=e1.empno\

SELECT p.no, p.name, ifnull(COUNT(s.profno),0)
FROM professor p LEFT join student s
on p.no=s.profno
GROUP BY p.no

SELECT e.ename,e.job,e.deptno,d.dname
FROM emp e, dept d
WHERE e.deptno=d.deptno
AND month(birthday) 
IN(SELECT month(birthday) FROM emp WHERE ename = '강칠성')



--1
SELECT grade,AVG(weight)
FROM student
GROUP BY grade
HAVING AVG(weight)>70
--2 
SELECT grade,AVG(weight)
FROM student
GROUP BY grade
HAVING AVG(weight)<=all(SELECT AVG(weight) FROM student GROUP BY grade);
--3   
SELECT name
FROM major
WHERE part IN(SELECT CODE 
                 FROM major 
					  WHERE part = (SELECT CODE 
					                FROM major 
										 WHERE NAME = '공과대학'));
--4
SELECT studno,NAME, major1, weight
FROM student s
WHERE weight < (SELECT AVG(weight) FROM student s1 WHERE s1.major1 = s.major1);
--5
SELECT NAME, grade, height
FROM student
WHERE grade = (SELECT grade FROM student WHERE studno = '960212')
AND height > (SELECT height FROM student WHERE studno = '950115')
--6
SELECT s.studno, s.name, s.major1, m.name
FROM student s, major m, major m1
WHERE s.major1 = m.code
AND   m.part = m1.code
AND   m1.name = '컴퓨터정보학부'
--7
SELECT studno, NAME, height
FROM student
WHERE height > (SELECT MIN(height) FROM student WHERE grade = 4)
--8
SELECT studno, NAME, birthday
FROM student
WHERE birthday = (select MIN(birthday) FROM student)
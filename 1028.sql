
--1
SELECT grade,AVG(weight) FROM student 
GROUP BY grade HAVING AVG(weight)>70
--2
SELECT grade,AVG(weight) FROM student 
GROUP BY grade HAVING AVG(weight) <=ALL (SELECT AVG(weight) FROM student 
GROUP BY grade)
--3
SELECT NAME FROM major
WHERE part IN (SELECT m1.code FROM major m1,major m2 WHERE m1.part=m2.code AND m2.name ='공과대학')
--4
SELECT studno,NAME,major1,weight
FROM student s1
WHERE weight <
(SELECT AVG(weight) FROM student s2 WHERE s2.major1=s1.major1)
--5
SELECT NAME,grade,height
FROM student
WHERE grade=(SELECT grade FROM student WHERE studno=960212)
AND height>(SELECT height FROM student WHERE studno=950115)
--6
SELECT s.studno,s.name,s.major1,m.name
FROM student s,major m
WHERE s.major1=m.code
AND s.major1 IN(SELECT CODE FROM major WHERE part=100)
--7 
SELECT studno, NAME, height
FROM student
WHERE height > (SELECT MIN(height) FROM student WHERE grade = 4)
--8
SELECT studno, NAME, birthday
FROM student
WHERE birthday = (select MIN(birthday) FROM student);

/*
	1027 복습
	subquery 
		단일행 subquery, 복수행 subquery, 
		다중컬럼 subquery, 상호연관 subquery
		 
		스칼라 subquery : 컬럼부분에서 사용되는 subquery 
		having subquery : having 구문에서 사용되는 subquery 
		inline view     : from 구문 subquery 
		 
	DDL : 데이터 정의어. 
			transaction 처리 안됨 : commit, rollback 안됨. 
	   create : 객체 생성 명령어 :
	   			create table, create index, create user,
	   			create database, create view ....
 	   	 
	   create table
*/



/*
   alter : 테이블의 구조 수정 
*/
SELECT * from depttest2
--depttest2 Loc 컬럼 추가하기 
ALTER TABLE depttest2 ADD loc VARCHAR(30)
--depttest2 loc 컬럼 크기를 100 변경하기 
ALTER TABLE depttest2 MODIFY loc VARCHAR(100)
DESC depttest2

--depttest2 loc 컬럼을 area 컬럼명으로 변경하기 
ALTER TABLE depttest2 CHANGE loc AREA VARCHAR(100)

--depttest2 테이블의 area 컬럼 제거하기 
ALTER TABLE depttest2 DROP AREA

DESC depttest1
--depttest1 테이블에 기본키 설정하기 
ALTER TABLE depttest1 ADD CONSTRAINT PRIMARY KEY (deptno)

SELECT * FROM professor_101
--professor_101 테이블의 no 컬럼은 반드시 professor 테이블의 
--no 컬럼의 값이 있는 경우만 가능하다.
--professor_101 테이블에 외래키 설정하기 
ALTER TABLE professor_101 ADD CONSTRAINT FOREIGN KEY (NO)
REFERENCES professor (NO) 
DESC professor_101
INSERT INTO professor_101 (NO,NAME,position,dname) VALUES (1002,'홍','기타','기타')
SELECT * FROM professor_101

--professor_101 테이블에 deptno는 major 테이블의 code 컬럼의 
--값이 있는 경우만 등록이 가능하도록 외리키 설정하기 
ALTER TABLE professor_101 ADD CONSTRAINT FOREIGN KEY (deptno)
REFERENCES major(CODE)

-- 제약 조건 삭제하기 
--기본키 삭제 
ALTER TABLE depttest1 DROP PRIMARY KEY
--외래키 삭제 
ALTER TABLE professor_101 DROP FOREIGN KEY professor_101_ibfk_2
--데이터 dictionary
--information_schema 데이터베이스의 
--table_constraints : 테이블에 정의된 제약 조건의 목록 
--   -> 테이블의 구조 GUI환경
SELECT * FROM TABLE_CONSTRAINTS WHERE TABLE_NAME = 'dept'

--문제 
DESC dept3
SELECT * FROM dept3
DROP TABLE dept3
--1. dept 테이블의 deptno, dname 컬럼을 가지는 dept3 테이블 생성하기 
--  내용은 없는 dept3테이블 생성하기 
CREATE TABLE dept3
AS SELECT deptno,dname FROM dept WHERE 1=2
--2. detp3테이블에 area 컬럼 추가한다. varchar(10)
ALTER TABLE dept3 ADD area VARCHAR(10)
--3. area 컬럼의 크기를 100으로 변경하기 
ALTER TABLE dept3 MODIFY area VARCHAR(100)
--4. deptno 컬럼을 기본키로 설정하기 
ALTER TABLE dept3 ADD CONSTRAINT PRIMARY KEY (deptno)
--5. area 컬럼을 part 컬럼명으로 변경하기 
ALTER TABLE dept3 CHANGE area part VARCHAR(100)
--6. deptno 컬럼을 dept 테이블의 deptno 컬럼의 외래키로 설정하기 
ALTER TABLE dept3 ADD FOREIGN KEY (deptno)
REFERENCES dept (deptno)
--7. 데이터사전에서 dept3테이블의 제약 조건 조회 하기 
SELECT * FROM information_schema.TABLE_CONSTRAINTS WHERE TABLE_NAME = 'dept3'
--8. part 컬럼 제거하기
ALTER TABLE dept3 DROP part
DESC dept4

--테이블의 이름 변경하기
ALTER TABLE dept3 RENAME TO dept4

/*
	객체 제거하기 : drop 
*/
SHOW TABLES
--professor_101 테이블 제거 
DROP TABLE professor_101 

/*
	truncate : 모든 데이터 제거하기. rollback 안됨.
				  조건 설정 안됨.
				  대용량 데이터를 빠른 시간에 삭제 가능.
	 
	delete 구문 : 데이터 제거하기. rollback 가능 
							  조건 설정 가능.
*/
SET autocommit =FALSE  --자동 commit 해제.
SELECT * FROM depttest2
DELETE FROM depttest2
ROLLBACK

TRUNCATE TABLE depttest2
SELECT * FROM depttest2
ROLLBACK
SELECT * FROM depttest2

/*
	DML : Data Manipulation Language : 데이터 처리(조작)어.
			테이블 내부의 자료(데이터)를 처리(추가,변경,삭제) 할 수 있는 언어 
		1. insert : 데이터 추가 Create : C 
		2. update : 데이터 변경 Update : U
		3. delete : 데이터 제거 Delete : D
		4. select : 데이터 조회 Read : R
	CRUD : Create Read  Update Delete
	 
	Transaction 처리 가능 : commit, rollback 가능 
*/
SET autocommit =TRUE --자동으로 commit 됨. 개발자가 선택 불가. 기본값 
SET autocommit =FALSE --자동으로 commit 안됨. 개발자가 선택.

--현재 session의 autocommit 상태 조회 
SHOW VARIABLES LIKE 'autocommit'

/*
	insert : 레코드 추가 
	insert into 테이블면 [(컬럼명1,컬럼명2,...)] values (값1,값2,....)

	컬럼명들을 기술하지 않고 insert 구문 처리시 
	반드시 모든 컬럼을 스키마에 정의된 순서대로 값으로 입력해야함. 
	=> 권장하지 않음.
	 
	--컬렴명을 기슬해야 하는 경우 
	1. 모든 컬럼의 값을 입력하지 않는 경우 
	2. 스키마의 순서를 모를때 
	3. db구조의 변경이 자주 발생될때 컬럼명을 기술하는 것이 안전함.
*/

SELECT * FROM depttest4
--depttest4 테이블에 90번 부서 추가하기 
-- deptno :90, dname: 특판팀.
INSERT INTO depttest4(deptno,dname) VALUES (90,'특판팀')
-- deptno :91, dname: 특판1팀.
INSERT INTO depttest4 VALUES (91,'특판1팀')
--deptno : 92
INSERT INTO depttest4 VALUES (92,'')
--deptno : 93
INSERT INTO depttest4(deptno) VALUES (93)
--deptno :94 dmame : 특판 4팀 
INSERT INTO depttest4(dname,deptno) VALUES ('특판4팀',94)

--1. 교수테이블에 교수번호: 6001, 이름 : 홍길동, id : hongkd, salary:350
-- 입사일 : 2020-03-01, 직책:초빙교수 값을 가진 레코드 추가하기 
INSERT INTO professor(NO,NAME,id,salary,hiredate,position) VALUES (6001,'홍길동','hongkd',350,'2020-03-01','초빙교수')
SELECT * FROM professor
--1. 교수테이블에 교수번호: 6002, 이름 : 홍길동, id : hongkd, salary:350
-- 입사일 : 2020-03-01, 직책:초빙교수 값을 가진 레코드 추가하기 
-- 컬럼명 생략한 방식으로 추가하기 
INSERT INTO professor VALUES (6002,'홍길동','hongkd','초빙교수',350,'2020-03-01',NULL,NULL,NULL,NULL)



SELECT * FROM emp
--1
INSERT INTO emp(empno,ename,job,salary,deptno,hiredate) 
VALUES (3001,'홍길동','사외이사',100,10,CURDATE())
--2
INSERT INTO emp
VALUES (3002,'홍길동','사외이사',NULL,null,CURDATE(),100,NULL,10)


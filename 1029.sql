/*
	기존테이블을 이용하여 데이터 추가하기 
*/
CREATE TABLE major2 AS SELECT * FROM major WHERE 1=2
SELECT * FROM major2
--major 테이블에서 code가 200이상인 데이터만 major2테이블에 데이터 추가하기 
INSERT INTO major2 SELECT * FROM major WHERE CODE >=200

--major10 테이블을 major테이블과 같은 구조로 생성하기 
-- 단 데이터는 추가하지 않는다 
-- major10 테이블에는 공과대학에 속한 학과 정보만 데이터로 추가하기 
CREATE TABLE major10 AS SELECT * FROM major WHERE 1=2
INSERT INTO major10 SELECT * FROM major where part IN 
(SELECT CODE FROM major WHERE part IN
(SELECT CODE FROM major WHERE NAME = '공과대학'))

SELECT * FROM major10

--student1 테이블을 student 테이블과 같은 구조로 생성하기 
-- 단 데이터는 추가하지 않는다 
-- student1테이블에는 1학년 학생중 평균키 이상인 학생의 정보만 추가하기 
CREATE TABLE student1 AS SELECT * FROM student WHERE 1=2
INSERT INTO student1 SELECT * FROM student 
WHERE height >= (select AVG(height) FROM student)AND grade =1 

SELECT * FROM student1

--박인숙 교수와 같은 조건으로 오늘 입사한 이몽룡 교수 추가하기 
--교수번호 : 600, 이름:이몽룡, 입사일:오늘, id:monglee 
INSERT INTO professor(NO,NAME,id,POSITION,salary,bonus,deptno,hiredate)
SELECT 6001,'이몽룡','monglee',POSITION,salary,bonus,deptno,CURRENT_DATE() 
FROM professor
WHERE NAME = '박인숙'

SELECT * FROM professor

/*
	update : 컬럼의 내용을 수정하기 
	 
	update 테이블명 set 컬럼1=값1,컬럼2=값2....
	[where 조건문] => 없는 경우 모든 레코드가 수정 
						   있는 경우 조건만족하는 레코드만 수정 
*/
--emp 테이블에서 사원직급인 경우 보너스 10만원 인상하기.
--보너스가 없는 경우도 10만원으로 인상함(0으로 처리함) 
SELECT * FROM emp WHERE job='사원'
SET autocommit = false
UPDATE emp SET bonus = ifnull(bonus,0) + 10
WHERE job = '사원'

--이상미 교수와 같은 직급의 교수중 급여가 350미만인 교수의 급여를 
--10% 인상한 값으로 수정하기
SELECT * FROM professor WHERE POSITION =
 (SELECT POSITION FROM professor WHERE NAME = '이상미') AND salary <350 
 
UPDATE professor SET salary=salary*1.1
WHERE POSITION =
 (SELECT POSITION FROM professor WHERE NAME = '이상미') AND salary < 350
ROLLBACK

--문제 : 보너스가 없는 시간강사의 보너스를 조교수의 평균 보너스의 50%로 수정하기 
SELECT * FROM professor WHERE POSITION = '시간강사'
UPDATE professor SET bonus = (SELECT round(AVG(IFNULL(bonus,0))/2) 
FROM professor WHERE POSITION = '조교수')
WHERE POSITION = '시간강사'

--2. 지도교수가 없는 학생의 지도교수를 이용학생의 지도교수로 수정하기 
SELECT * FROM student
UPDATE student SET profno = (SELECT profno FROM student WHERE NAME = '이용')
WHERE profno IS NULL
--3. 교수중 이몽룡과 같은 직급의 교수의 급여를 101학과의 평균급여로 
-- 수정하기. 소숫점이한느 반올림하기 
SELECT * FROM professor WHERE POSITION =
(SELECT position FROM professor WHERE NAME = '이몽룡')
UPDATE professor SET salary = (SELECT round(AVG(salary)) 
FROM professor WHERE deptno = 101)
WHERE POSITION =
(SELECT position FROM professor WHERE NAME = '이몽룡')

/*
	delete : 레코드 삭제 
	delete from 테이블명 
	[ where 조건문 ] =>없으면 모든 레코드 삭제 
						  =>있으면 조건의 결과가 참인 레코드만 삭제 
*/
SELECT *FROM depttest3
--depttest3 테이블에서 기획부를 제거하기 
DELETE FROM depttest3
WHERE dname= '기획부'

--교수 중 이몽룡 교수 퇴사 시키기 
DELETE FROM professor
WHERE NAME = '이몽룡'

SELECT *FROM professor

/*
	Transaction => ALL or Nothing

	SQL의 종류 

	DDL : Data Definition Language(데이터 정의어), 트랜젝션 처리 안됨 
			create,alter,drop, tuncate
	DML : Data Manipulation Language(데이터 조작어), 트랜젝션 처리 가능 
			insert(C),select(R),update(U),delete(D)
	TCL : Transaction Control Language(트랜젝션 제어어)
			commit, rollback
	DCL : Date Control Language(데이터 제어어) => db관리자가 사용하는 언어 
			grant : 권한 주기 
			revoke : 권한 뺏기 
*/

/*
	view : 가상 테이블 
			물리적으로 메모리 할당이 없다.
			테이블처럼 사용됨.
*/
--2학년 학생의 학번, 이름, 키, 몸무게를 가진 view v_stu2 생성하기 
CREATE OR REPLACE VIEW v_stu2 
as SELECT studno, NAME, height, weight FROM student WHERE grade =2
SELECT * FROM v_stu2	
--2학년 학생의 학번, 이름, 국어, 영어, 수학 값을 가지는 v_score2 뷰 생성하기
CREATE OR REPLACE VIEW v_score2
AS SELECT s.studno,s.name,s1.kor,s1.eng,s1.math
FROM student s, score s1 WHERE s.studno=s1.studno
AND s.grade =2
SELECT * FROM v_score2	
--v_stu2 테이블의 키와 몸무게, v_score2 테이블의 점수 정보를 조회 하기 
SELECT v1.studno,v1.name,height,weight,kor,eng,math
FROM v_stu2 v1, v_score2 v2
WHERE v1.studno = v2.studno

UPDATE score SET math = 65 WHERE studno = 970111

CREATE OR replace VIEW v_score1
AS
SELECT v1.studno,v1.name,height,weight,kor,eng,math
FROM v_stu2 v1, v_score2 v2
WHERE v1.studno = v2.studno

--view 삭제 
DROP VIEW v_score1
SELECT * FROM v_score1

/*
	inline 뷰 : 뷰의 이름이 없고, 일회성으로 사용되는 뷰 
					select 구문에 from 절에 사용되는 subquery를 말한다 
					반드시 별명을 설정해야한다.
*/
--학생의 학번,이름,학년,키,몸무게,학년의 최대키, 최대몸무게 조회하기 
SELECT studno, NAME,grade,height,weight,
(SELECT MAX(height) FROM student s2 WHERE s2.grade=s1.grade),
(SELECT MAX(weight) FROM student s2 WHERE s2.grade=s1.grade)
FROM student s1

--inline view
SELECT studno, NAME,s1.grade,height,weight,max_h,max_w
FROM student s1,
(SELECT grade,MAX(height) max_h,MAX(weight) max_w
FROM student GROUP BY grade) a
WHERE s1.grade=a.grade

--교수번호, 이름, 부서코드,부서명,자기부서의 평균급여,평균보너스 조회하기 
-- 보너스가 없는면 0으로 처리한다.
SELECT p.NO,p.NAME,p.deptno,m.name,sal,bo
FROM professor p,major m,
(SELECT deptno,round(AVG(salary)) sal,round(AVG(IFNULL(bonus,0))) bo 
FROM professor p2 GROUP by deptno) a
WHERE p.deptno=m.code AND p.deptno=a.deptno

SELECT p.NO,p.NAME,p.deptno,m.name,
(SELECT round(AVG(salary)) FROM professor p1 
WHERE p1.deptno=p.deptno GROUP BY deptno ) sal,
(SELECT round(AVG(IFNULL(bonus,0))) FROM professor p1 
WHERE p1.deptno=p.deptno GROUP BY deptno ) bo
FROM professor p,major m
WHERE p.deptno=m.code



--1
CREATE table test4(
NO INT PRIMARY KEY,
NAME VARCHAR(20),
tel VARCHAR(20),
addr VARCHAR(100) DEFAULT '서울시 금천구'
)
--2
CREATE TABLE professor_101
AS SELECT NO,NAME,deptno,salary,bonus,POSITION 
FROM professor
WHERE deptno=101
--3
INSERT INTO emp(empno,ename,job,salary,deptno,hiredate)
VALUES (3001,'홍길동','사외이사',100,10,'2020-04-01')
--4
UPDATE student SET profno = (SELECT profno FROM student WHERE NAME = '이용')
WHERE profno IS NULL
--5
UPDATE professor SET salary = (SELECT round(AVG(salary)) 
FROM professor WHERE deptno = 101)
WHERE POSITION =
(SELECT position FROM professor WHERE NAME = '홍길동')
--6
DELETE FROM professor
WHERE POSITION = (SELECT POSITION FROM professor WHERE NAME = '홍길동')
--7
CREATE OR REPLACE VIEW v_stud_male
AS SELECT * FROM student WHERE substr(jumin, 7, 1) = 1
SELECT * FROM v_stud_male
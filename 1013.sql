DESC emp;
SELECT * FROM emp;
SELECT empno,ename,job FROM emp;	
SELECT empno,ename,'직원' FROM emp;
DESC professor;
DESC student; 
SELECT NO,NAME,'교수' FROM professor;
SELECT studno,NAME,'학생' FROM student;
SELECT NO 교수번호,NAME 교수이름,'교수' FROM professor;
SELECT NO "교수 번호",NAME "교수 이름",'교수' FROM professor;
SELECT NO AS '교수 번호',NAME AS '교수 이름','교수' FROM professor;
SELECT ename, salary, salary*1.1 FROM emp;
SELECT NO, NAME, salary, salary*1.05 FROM professor;
SELECT NO, NAME, salary*12 FROM professor;
SELECT distinct major1,major2 FROM student;
SELECT distinct POSITION FROM professor;
SELECT distinct deptno,POSITION FROM professor;
SELECT NAME, salary,bonus, salary+bonus FROM professor;

 SELECT EMPNO '사원번호', ENAME '사원명', JOB '직급' FROM emp;
 SELECT DEPTNO '부서#', DNAME '부서명', LOC '부서위치' FROM dept;
 SELECT PROFNO FROM student;
 SELECT POSITION FROM professor;
 SELECT NAME '이름', BIRTHDAY '생년월일', HEIGHT '키(cm)', WEIGHT '몸무게(kg)' FROM student;
 
 
 
 --강사님 깃허브
 /*
1. mariadb 설정
   https://mariadb.org 파일 다운받기
   mariadb-10.5.6-winx64.msi 설정
2. HeidiSQL 실행
   1. root 사용자 신규 설정
      -> classdb 데이터 베이스 추가
      -> 사용자 추가 : scott, 모든 권한 설정
3. HeidiSQL을 이용하여 scott 사용자로 로그인하기  
   -> classdb 선택하기
   -> 쿼리탭 : mariadb_init.txt 파일의 모든 내용을 실행(F9)하기
4. 확인
   classdb 데이터베이스에 테이블이 10개 생성.
*/

/* desc(DESCRIBE) : 테이블의 구조 조회. HeidiSQL 테이블:emp 탭에서 조회 가능
   desc 테이블이름 => 해당 테이블의 구조(스키마) 조회
   스키마 : 컬럼이름, 자료형, 키여부, default값 조회 가능
*/
DESCRIBE emp 
DESC emp
/*
  사원테이블(emp) 의 모든 컬럼과 모든 레코드 조회하기
  select 구문  
  select * || 컬럼이름들 from 테이블이름
  [where 조건문]  <= 조건문이 없으면 모든 레코드(row) 선택
                  <= 조건문이 있으면 조건을 참으로 하는 row만  선택
*/
SELECT * FROM emp
/* emp 테이블에서 사원번호(empno),사원이름(ename),직급(job) 컬럼 조회하기*/
SELECT empno,ename,job FROM emp
/*   리터널 컬럼 : 상수값 */
SELECT ename, job, '직원' FROM emp

/*
  문제 :  1. 교수테이블(professor) 의 구조 조회하기
          2. 교수테이블(professor) 교수번호(no),교수이름(name),'교수'
             로 조회하기
          3. 학생테이블(student) 학번(studno),학생이름(name),'학생'
             로 조회하기
*/
DESC professor
SELECT NO,NAME,'교수' FROM professor
SELECT studno,NAME,'학생' FROM student

/*
   컬럼에 별명(alias) 설정하기 : 컬럼이름을 변경하여 조회하기
*/
SELECT NO 교수번호 ,NAME 교수이름 ,'교수' FROM professor
SELECT NO "교수 번호" ,NAME "교수 이름" ,'교수' FROM professor
SELECT NO '교수 번호' ,NAME '교수 이름' ,'교수' FROM professor
SELECT NO AS '교수 번호' ,NAME AS '교수 이름' ,'교수' FROM professor

/* 
   컬럼에 연산자 사용하기 
*/
/*
   사원테이블(emp) 사원이름(ename),현재급여(salary), 10%인상예정급여 
   조회하기
*/
SELECT ename, salary, salary*1.1 FROM emp
/*
   문제 1 : 교수테이블에서 교수번호(no), 교수이름(name), 현재급여(salary)
            5%인상 예정 급여 조회하기
        2.  교수테이블에서 교수번호(no), 교수이름(name), 연봉 조회하기
		      연봉은 급여*12로 계산한다.    
*/
SELECT NO 교수번호, NAME 교수이름, salary, salary+(salary*0.05) 
FROM professor
SELECT NO,NAME,salary*12 연봉 FROM professor

/*
   distinct : 중복된 내용을 제거하여 조회하기. 조회시 성능이 좋지 않다.
              distinct 한번만 사용이 가능함
*/
-- 교수가 속한 부서코드를 조회하기
SELECT distinct deptno FROM professor
-- 학생테이블에서 학생이 속한 전공1, 전공2 번호 조회하기
SELECT distinct major1, major2 FROM student
-- 교수들이 속한 직급(position) 조회하기
SELECT distinct POSITION FROM professor
-- 교수들이 속한 부서코드별 직급(position) 조회하기
SELECT distinct deptno ,POSITION FROM professor
-- 교수테이블에서 교수이름, 급여(salary), 상여(bonus), 급여+상여 조회하기
/*
   null 값과 연산시 결과는 null이다.
*/
SELECT NAME, salary,bonus,salary+bonus FROM professor
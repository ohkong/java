/*
	순위 지정 함수 : rank over
*/
--교수의 번호, 이름, 급여, 급여많이 받는 순위 조회하기 
SELECT NO, NAME, salary, rank() over(ORDER BY salary DESC) 급여순위 FROM professor;
--교수의 번호, 이름, 급여, 급여 적게 받는 순위 조회하기 
SELECT NO, NAME, salary, rank() over(ORDER BY salary) 급여순위 FROM professor;

--emp 테이블에서 30번 부서 직원들의 사원번호, 이름, 급여, 급여작은순위 조회하기
SELECT empno, eNAME, salary,rank() over(ORDER BY salary) 급여순위 FROM emp WHERE deptno = 30;

--학생의 학번, 총점, 총점이 높은 순서로 등수를 조회하자
SELECT studno, kor+eng+math 총점, rank() over(ORDER BY kor+eng+math DESC) 등수 FROM score;
--학생의 학번, 국어, 영어, 수학, 국어 등수, 영어등수, 수학등수를 조회하자
SELECT studno, kor, eng, math, 
	rank() over(ORDER BY kor DESC) 국어등수,
	rank() over(ORDER BY eng DESC) 영어등수,
	rank() over(ORDER BY math DESC) 수학등수 FROM score ORDER BY 국어등수;
	
--교수들의 번호, 이름, 급여, 보너스, 총급여(급여+보너스)
--급여많은순위, 보너스 많은 순위, 총급여 많은 순위 조회하기
--총급여순위로 정렬하여 출력하기
SELECT NO, NAME, salary,ifnull(bonus,0) 보너스, salary+ifnull(bonus,0) 총급여,
rank() over(ORDER BY salary DESC) 급여순위,
rank() over(ORDER BY bonus DESC) 보너스순위, 
rank() over(ORDER BY salary+ifnull(bonus,0) DESC) 총급여순위 FROM professor ORDER BY 총급여순위;

/* 
	sum over : 누계 계산 
*/
--교수의 이름, 급여, 보너스, 급여누계 조회하기
SELECT NAME,salary, bonus, SUM(salary) over(ORDER BY salary DESC) 급여누계 FROM professor;

--score 테이블에서 학번, 국어, 영어, 수학, 총점누계, 총점순등수 조회하기
SELECT studno, kor, eng, math, SUM(kor+eng+math) over(ORDER BY kor+eng+math DESC) 총점누계,
rank() over(ORDER BY kor+eng+math DESC) 총점순등수 FROM score;


/*
	join : 여러개의 테이블에서 조회하기
	 
	 cross join : 두개테이블의 레코드 m*n개가 생성됨 
	 					사용시 주의해야함.
*/
SELECT * FROM emp; --레코드14개, 컬럼9개
SELECT * FROM dept; --레코드5개, 컬럼3개 
--cross join
SELECT * FROM emp,dept;
-- 사원번호,사원명,직책,부서코드,부서명 조회하기 
-- 두개테이블에 같은이름의 컬럼이 있는 경우 컬럼몇 앞에 테이블명을 기술해야함 
-- 단 테이블명은 별명을 사용해도 됨.
SELECT empno,ename,job,emp.deptno,dname FROM emp,dept;
SELECT e.empno,e.ename,e.job,e.deptno,d.dname FROM emp e,dept d;

/*
	등가 조인 : Equi join
					조인컬럼을 이용하여 필요한 레코드만 조회한다.
					조인컬럼의 조건이 =인 경우를 말한다 
*/
-- 사원번호,사원명,직책,부서코드,사원이 속한 부서명 조회하기 
--mariadb 방식
SELECT e.empno, e.ename,e.job, e.deptno,d.dname
FROM emp e, dept d
WHERE e.deptno=d.deptno;
--ansi 방식
SELECT e.empno, e.ename,e.job, e.deptno,d.dname
FROM emp e join dept d
on e.deptno=d.deptno;

--학생테이블에서 학번, 이름을, score 테이블에서 학번에 해당하는
-- 국어 영어 수학 총점을 조회하기
SELECT s.studno, name, kor,math,eng,kor+math+eng 총점
FROM student s, score s1
WHERE s.studno=s1.studno;

SELECT s.studno, name, kor,math,eng,kor+math+eng 총점
FROM student s join score s1
on s.studno=s1.studno;

--학생테이블에서 1학년 학생의  학번, 이름을, score 테이블에서 학번에 해당하는
-- 국어 영어 수학 총점을 조회하기
SELECT s.studno, name, kor,math,eng,kor+math+eng 총점
FROM student s, score s1
WHERE s.studno=s1.studno AND grade =1;

SELECT s.studno, name, kor,math,eng,kor+math+eng 총점
FROM student s join score s1
on s.studno=s1.studno
WHERE grade=1;

--학생의 학번,이름,학년,지도교수번호,지도교수이름 조회하기 
--학생테이블 : 학번,이름,학년,지도교수번호 
--교수테이블 : 지도교수이름 
SELECT studno,s.name,grade, s.profno,p.name
FROM student s, professor p
WHERE s.profno=p.no;

SELECT studno,s.name,grade, s.profno,p.name
FROM student s join professor p
on s.profno=p.no;


--1
SELECT studno 학번,s.name 이름,s.major1 전공1번호,m.name 전공학과이름,build 학과위치
FROM student s,major m
WHERE s.major1=m.code
AND s.name='장성태';
--2
SELECT studno 학번,s.name 이름, m.name 학과이름, build 학과위치
FROM student s,major m
WHERE s.major1=m.code
AND weight>=80;
--3
SELECT s.name 이름,major1 학과번호,build 학과위치
FROM student s,major m
WHERE s.major1=m.code
AND grade = 4;
--4
SELECT s.name 이름,m.name 학과이름,build 학과위치
FROM student s,major m
WHERE s.major1=m.code
AND s.NAME LIKE '김%';
--5
SELECT s.studno, s.name,m.name
FROM student s,major m
WHERE s.major1=m.code
ORDER BY 2;
--6
SELECT m.name 부서명,SUM(salary) 급여합계,SUM(IFNULL(bonus,0)) 보너스합계,
round(AVG(salary),2) 급여평균,round(AVG(IFNULL(bonus,0)),2) 보너스평균
FROM major m, professor p
WHERE m.code = p.deptno
GROUP BY deptno;
--7
SELECT s.name 이름,p.name 지도교수이름
FROM student s,professor p
WHERE s.profno=p.no;
--8
SELECT p.name 지도교수명,COUNT(*) 인원수
FROM student s,professor p
WHERE s.profno=p.no
GROUP BY profno;
--1         
SELECT studno 학번,s.name 이름,grade 학년,NO 지도교수번호,p.name 지도교수이름,m.name 학과명
FROM student s, professor p,major m
WHERE s.profno=p.no 
AND s.major1=m.code;
--2         
SELECT s.studno 학번,s.name 이름, kor 국어, math 수학, eng 영어, kor+math+eng 총점
FROM student s,score s2
WHERE s.studno=s2.studno
AND s.name="김태훈";
--3         
SELECT e.ename,e.job, (salary*12+ifnull(bonus,0))*10000 현재연봉,p.s_pay 연봉하한,p.e_pay 연봉상한
FROM emp e,p_grade p
WHERE e.job=p.position;
--4         
SELECT e.ename,e.deptno,d.dname
FROM emp e,dept d
WHERE e.deptno=d.deptno;
            
--1026      
/*          
	1023 복습
	 join 구문 : 여러개의 테이블을 연결하여 조회. 
	  Cross jn : n * m 개의 레코드로 조회됨. 주의필요
	  등가 조인컬럼의 값이 같은 경우를 조인 대상 레코드 조회 
	  비등가 조인컬럼의 값이 같은 경우가 아닌 범위지정으로 레코드 조회 
	  self 조 join 대상 테이블이 같은 테이블인 경우 
	  			 테이블의 별명을 지정해야 함.
*/          
            
/*          
	--1026 수
	 outer join
			양쪽테이블의 조인 컬럼 조건이 맞는 경우만 조회됨 => inner join
			조건에 맞지 않아도 한쪽 테이블의 모든 레코드가 조회됨 => outer join
		      
		   Lefter join : 왼쪽 테이블의 모든 레코드를 조회 
		   Riguter join : 오른쪽 테이블의 모든 레코드를 조회
		   fulter join : 약쪽 테이블의 모든 레코드를 조회
		   	> 구현안됨. union 명령어 사용.
*/          
-- 학생의 이도교수의 이름 조회 => 지도 교수가 있는 학생만 조회
SELECT s.name,p.name
FROM student s, professor p
WHERE s.profno = p.no;
-- 학생의 이도교수의 이름 조회 => 지도 교수가 없는 학생도 조회
--mariadb   
SELECT s.name,p.name
FROM student s LEFT join professor p
on s.profno = p.no;
-ansi       
SELECT s.name,p.name
FROM student s LEFT outer join professor p
on s.profno = p.no;
--oracle => mariadb 에선 안됨  +붙지 않은 곳의 레코드가 나오도록 설정됨
SELECT s.name,p.name
FROM student s, professor p
on s.profno = p.no(+);
            
--right outer join
--학생의 이교수의 이름 조회 => 지도 학생이 없는 교수도 조회
SELECT s.name,p.name
FROM student s right join professor p
on s.profno = p.no;
            
SELECT s.name,p.name
FROM student s right outer join professor p
on s.profno = p.no;
            
-- full outer join
-- 학생의 이도교수의 이름 조회하기
-- 지도학생교수, 지도교수가 없는 학생도 조회하기
SELECT s.name,p.name
FROM student s LEFT join professor p
on s.profno = p.no
union       
SELECT s.name,p.name
FROM student s right join professor p
on s.profno = p.no;
            
--1.emp, p_grade 테이블을 조인하여
-- 사원이름, 현재연봉, 해당직급의 연봉하한, 연봉상한 조회하기
-- 연봉 : (12 +보너스)*10000. 보너스가 없는 경우 0으로 처리하기
 -- 단 모든  출력하기
SELECT e.ename,e.job, (salary*12+ifnull(bonus,0))*10000 현재연봉,p.s_pay 연봉하한,p.e_pay 연봉상한
FROM emp e left join p_grade p
ON e.job=p.position;
            
--2. emp, p_grade 테이블을 조인하여
--사원이름,  근속년도, 현재직급, 근속년도 기준 에상직급 출력하기
-- 근속년도 기준으로 입사일의 일자/365 나눈후 소수점이하는 버림으로
-- 단 모든 출력하기
SELECT e.ename 이름,e.hiredate 입사일,e.job,truncate(datediff(NOW(),hiredate)/365,0) 근속년도, salary 현재직급, p.position 에상직급
FROM emp e LEFT join p_grade p
ON truncate(datediff(NOW(),hiredate)/365,0) BETWEEN p.s_year AND p.e_year;
            
--3. emp, p_grade 테이블을 조인하여
--사원이름,, 현재직급, 나이 기준 에상직급 출력하기
--나이는 오으로 생일까지의 일자/365 나눈후 소숫점이하는 버림
-- 단 모든 출력하기 
SELECT e.ename 이름, e.birthday 생일, truncate(datediff(NOW(),birthday)/365,0) 나이, e.job 현재직급, p.position 에상직급
FROM emp e LEFT join p_grade p
ON truncate(datediff(NOW(),birthday)/365,0) BETWEEN p.s_age AND p.e_age;
            
--4. major 이블에서 학과코드 , 학과명, 상위학과코드, 상위 학과명 조회하기
-- 모든 학과하기
SELECT m.CODE,m.name, m.part, m1.name
FROM major m LEFT JOIN major m1
ON m.part= m1.code;
            
--5 교수번호ㅇ입사일, 자신보다 입사일이 빠른 교수의 인원수 조회하기
-- 모든 교수회됨
SELECT p.no,p.name,p.hiredate,p1.no,p1.hiredate,COUNT(p1.no)
FROM professor p LEFT JOIN professor p1
ON p.hiredate>p1.hiredate
GROUP BY p.No
            
/*          
	subquery select 구문 내부에 select 구문 존재함
		where  사용되는 select 구문 
		      
		      
		단일행ry :  where 조건문의 select 구문 결과가 한개인 경우
			사:  =,>=,<=,.....
		복수행ry :  where 조건문의 select 구문 결과가 여러개인 경우
			사: in,>All,<All,>Any,<Any
*/          
--emp 테이블이혜라 사원보다 많은 급여를 받는 직원의 정보 출력하기
SELECT salary FROM emp WHERE ename = '이혜라';
            
SELECT * FROM emp
WHERE salary > (SELECT salary FROM emp WHERE ename = '이혜라');
            
--1 학생중 학생보다 윗학년의 이름, 학년, 전공1코드, 전공1학과명 조회하기
SELECT s.name, s.grade, s.major1, m.name
FROM student s, major m
WHERE s.major1=m.code
AND s.grade > (SELECT grade FROM student WHERE NAME = "김종연");
            
--2 학생중 학생과 같은학과 학생의 이름, 학년, 전공1코드, 전공1학과명 조회하기
SELECT s.name, s.grade, s.major1, m.name
FROM student s, major m
WHERE s.major1=m.code
AND s.major1 = (SELECT major1 FROM student WHERE NAME = "김종연");
            
--3 직급이 직원의 평균 급여보다 적은 급여를 받는 직원의 
-- 사원번호, 직급, 급여 조회하기
SELECT empno 사원번호,ename 이름, job 직급, salary 급여
FROM emp    
WHERE salary <(SELECT AVG(salary) FROM emp WHERE job = "사원");
            
--4 직원의 여보다 적은 급여를 받는 직급이 사원인 직원의 
-- 사원번호, 직급, 급여 조회하기
SELECT empno 사원번호,ename 이름, job 직급, salary 급여
FROM emp    
WHERE salary <(SELECT AVG(salary) FROM emp)
AND job = '원';
            
/*          
	복수행 서subquery의 결과가 여러행인 경우 
*/          
--emp, dept 테이블을 이용하여 근무지역이 서울인 사원의 
-- 사원번호, 부서코드, 부서명을 조회하기 
SELECT empno, ename, e.deptno, d.dname
FROM emp e,dept d
WHERE e.deptno = d.deptno
AND e.deptno IN (SELECT deptno FROM dept WHERE loc = "서울")
            
--1   1학년 과 같은 키를 가지고 있는 2학년 학생의 이름, 키, 학년을 조회 하기
SELECT NAME, height, grade
FROM student
WHERE height IN(SELECT distinct height FROM student WHERE grade =1)
AND grade =2;
            
--2 사원 직대 급여 보다 급여가 높은 사람의  이름, 직급, 급여 조회하기
SELECT ename,job, salary
FROM emp    
WHERE salary > (SELECT max(salary) FROM emp WHERE job = '사원')
            
SELECT ename,job, salary
FROM emp    
WHERE salary >all (SELECT salary FROM emp WHERE job = '사원')
                
--1         
SELECT s.name,ifnull(p.name,'0000')
FROM student s LEFT join professor p
on s.profno = p.no
union       
SELECT ifnull(s.name,'****'),p.name
FROM student s right join professor p
on s.profno = p.no;
            
--2         
SELECT p.no,p.name,ifnull(COUNT(s.profno),0)
FROM professor p LEFT JOIN student s
ON p.no=s.profno
GROUP BY p.no;
            
--3  =====  
SELECT p.no,p.name,p.deptno,m.name
FROM professor p left join student s
on p.no = s.profno
JOIN major m 
ON p.deptno=m.code
WHERE s.profno IS NULL;
            
--4         
SELECT e.empno,e.ename,e.job,ifnull(e1.ename,'상사없음'),e1.job
FROM emp e LEFT JOIN emp e1
ON e.mgr=e1.empno;
            
--5         
SELECT e.ename,e.job,e.deptno,d.dname
FROM emp e,dept d
WHERE e.deptno=d.deptno
and hiredate =(SELECT hiredate FROM emp WHERE eNAME = '김경빈');
            
--6         
SELECT p.name,p.hiredate,m.code,m.name
FROM professor p,major m
WHERE p.deptno=m.code
AND hiredate >(SELECT hiredate FROM professor WHERE NAME = '송승환')

            
--7         
SELECT NAME,weight,height
FROM student
WHERE weight>(SELECT max(weight) FROM student WHERE grade=2)
AND grade = 1;
            
--8         
SELECT s.NAME,s.weight,m.name
FROM student s,major m
WHERE s.major1=m.code
AND weight>(SELECT avg(weight) FROM student WHERE major1=101);
            
--9         
SELECT NAME,salary,hiredate
FROM professor
WHERE salary<(SELECT salary 
			from	professor
				 where NAME = '이영택')
AND hiredate = (SELECT hiredate
				from professor
				 where NAME = '이상미');
            
--10        
SELECT studno,NAME,major1,weight
FROM student
WHERE weight<(SELECT avg(weight) FROM student WHERE major1=101);
            
--11        
SELECT s.studno,s.name,s.major1,m.name
FROM student s,major m
WHERE s.major1=m.code
AND s.major1 IN(SELECT CODE 
				  FROM major
				  WHERE part =(SELECT code FROM major WHERE NAME = '컴퓨터정보학부'))
            
--12        
SELECT studno,name,birthday
FROM student
WHERE birthday = (SELECT MIN(birthday) FROM student)
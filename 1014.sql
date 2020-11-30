/*
where 조건문 : 레코드 선택하는 조건.
					조건문이 ㅇ벗는 경우 모든 레코드가 조회됨.
					조건문이 있는 경우 조건의 결과가 참인 레코드만 조회됨.
*/
SELECT * FROM student WHERE grade=1;
SELECT studno 학번, NAME 이름, grade 학년, major1 전공1코드 FROM student WHERE grade=2;
SELECT studno, NAME, grade, major1 FROM student WHERE grade=3 AND major1=101;

DESC emp
SELECT ename, salary, deptno FROM emp WHERE deptno=10;
SELECT ename, salary, deptno FROM emp WHERE salary>800;
SELECT NAME, deptno, POSITION FROM professor WHERE POSITION = '정교수';

SELECT ename, salary, salary*1.1,deptno FROM emp WHERE salary*1.1>=1000;

/*
	where 조건문에서 사용되는 연산자 : between	
	where 컬럼명 between A and B : 컬럼의 값이 A이상 B이하인 레코드 선택
	where 컬럼명 >=A and 컬럼명 <=B : 컬럼의 값이 A이상 B이하인 레코드 선택
	*/
SELECT * FROM student WHERE grade =1 OR grade =2;
SELECT * FROM student WHERE grade >=1 and grade <=2;
SELECT * FROM student WHERE grade BETWEEN 1 AND 2;

SELECT NAME, grade, weight, major1 FROM student WHERE grade = 1 and weight BETWEEN 70 AND 80;

/*
	in 연산자 : or 조건문으로 표현이 가능하다.
*/
SELECT * FROM student WHERE major1 IN(101,201);
SELECT no,NAME, deptno,hiredate FROM professor WHERE deptno IN(101,201);

/*
	like 연산자
		% : 0개이상 임의의 문자
		_ : 1개의 임의의 문자
		binary : 대소문자구분
*/
SELECT studno, NAME, major1 FROM student WHERE NAME LIKE '김%';
SELECT studno, NAME, major1 FROM student WHERE NAME LIKE '%진%';
SELECT studno, NAME, major1 FROM student WHERE NAME LIKE '%진';
SELECT studno, NAME, major1 FROM student WHERE NAME LIKE '__';
SELECT NAME,grade,major1 FROM student WHERE NAME not LIKE '김%';
--대소문자 구분안됨 : binary를 사용하여 대소문자 구분
SELECT NAME,id,POSITION FROM professor WHERE id LIKE '%k%';
SELECT NAME,id,POSITION FROM professor WHERE id LIKE binary'%K%';


/*
	null의 의미 : 값이 없다. 
	=> 연산, 비교의 대상이 아니다
*/
SELECT NAME, salary, bonus FROM professor WHERE bonus IS NULL;
SELECT NAME, salary, bonus FROM professor WHERE bonus IS not NULL;
SELECT NAME, salary, bonus,salary*12+bonus '연봉'  FROM professor WHERE bonus IS not NULL;

/*
	정렬하기(sort) : order by 구문
	asc : 오름차순(기본값. 생략가능)
	desc : 내림차순
*/
SELECT NAME,height FROM student where grade = 1 ORDER BY height DESC;
SELECT NAME,height 키 FROM student where grade = 1 ORDER BY 2 DESC;
SELECT NAME,height 키 FROM student where grade = 1 ORDER BY 키 DESC;
SELECT empno, ename, salary, salary*1.1 인상예상급여  FROM emp ORDER BY salary*1.1 DESC;
SELECT empno, ename, salary, salary*1.1 인상예상급여  FROM emp ORDER BY 인상예상급여 DESC;
SELECT empno, ename, salary, salary*1.1 인상예상급여  FROM emp ORDER BY 4 DESC;
--조회되지 않은 컬럼으로 정렬이 가능함. 숫자 안됨, 별명안됨
SELECT studno,NAME,weight,height FROM student ORDER BY grade;

SELECT NAME, grade, height FROM student ORDER BY grade,height DESC,NAME;
SELECT NAME, grade, height FROM student ORDER BY 2,3 DESC,1;

SELECT NO, NAME, deptno, salary, salary*1.1 FROM professor ORDER BY 3, 5 DESC;
SELECT studno, NAME, profno,major1 FROM student WHERE profno IS NULL ORDER BY 4; 
SELECT NAME, height, weight FROM student where grade =1 ORDER BY 2,3 DESC;

/*
	합집합 : union , union all
		union : 합집합. 중복제거
		union all : 두개의 query 의 결과를 합하여 출력함. 중복제거 안됨
	=> 두개의 select구문의 조회되는 컬럼의 갯수가 같아야함
*/
SELECT studno, NAME, major1,major2 FROM student WHERE major1 = 202 OR major2 = 101;

SELECT studno, NAME, major1,major2 FROM student WHERE major1 = 202
UNION
SELECT studno, NAME, major1,major2 FROM student WHERE major2 = 101;

SELECT studno, NAME, major1,major2 FROM student WHERE major1 = 202
UNION all
SELECT studno, NAME, major1,major2 FROM student WHERE major2 = 101;

SELECT NO,NAME,salary 현재급여,salary*1.05 인상예정급여 FROM professor where salary>=450
UNION
SELECT NO,NAME,salary 현재급여,salary*1.1 인상예정급여 FROM professor where salary<450 ORDER BY 4 DESC;

--union에서 두개의 select 구문의 조회 컬럼의 갯수는 같아야한다. 컬렴명은 맨윗줄을 따라감.
SELECT NO,NAME,salary,bonus,salary*12+bonus FROM professor WHERE bonus IS NOt NULL
UNION
SELECT NO,NAME,salary,bonus,salary*12 FROM professor WHERE bonus IS NULL ORDER BY 5;

/*
	교집합 : intersect => 10.3버전 이후에서만 가능함.
				and 연산자 이용의 경우가 많다.
*/
--학생의 성이 김씨 학생 중 이름의 끝이 훈인 학생의 이름과 학과를 출력하자
SELECT NAME,major1 FROM student WHERE NAME LIKE '김%' AND NAME LIKE '%훈';

SELECT NAME,major1 FROM student WHERE NAME LIKE '김%'
intersect
SELECT NAME,major1 FROM student WHERE NAME LIKE '%훈';

--전공1학과가 202번이고 전공2학과가 101인 학생의 학번 이름 전공1코드 전공2코드 조회     and intersect
SELECT studno,NAME,major1,major2 from student WHERE major1=202 AND major2=101;
SELECT studno,NAME,major1,major2 from student WHERE major1=202
intersect
SELECT studno,NAME,major1,major2 from student WHERE major2=101;


--1
SELECT NAME,weight,major1 FROM student WHERE major1 IN(101,201) AND weight BETWEEN 50 AND 80;
--2
SELECT eNAME,salary, salary*1.05,deptno FROM emp WHERE salary>=700;
--3
SELECT NAME, major1,birthday,grade FROM student WHERE grade =1 AND birthday>'1998-06-30';
--4
SELECT NAME, major1,birthday,grade FROM student WHERE grade =1 or birthday>'1998-06-30';
--5
SELECT studno, NAME,weight,height FROM student WHERE major1 IN(101,201) AND height>=170;
--6
SELECT NAME,jumin,birthday,height,weight FROM student WHERE grade =1 ORDER BY birthday;
--7
SELECT NAME,salary,bonus FROM professor WHERE salary>=300 AND bonus IS NOT NULL
UNION
SELECT NAME,salary,bonus FROM professor WHERE salary>=450;
--8
SELECT studno,NAME,grade,tel FROM student WHERE tel NOT LIKE '02%' ORDER BY grade;
--9
SELECT studno,NAME,grade,id FROM student WHERE id LIKE BINARY '%kim%';
--10
SELECT NO,NAME,salary,salary*1.1 FROM professor WHERE bonus IS NULL ORDER BY 4 DESC;
--11
SELECT studno,NAME,major1 FROM student WHERE NAME LIKE '%훈' ORDER BY grade;
--12
SELECT NAME FROM professor WHERE NAME >='자' AND NAME <'차';
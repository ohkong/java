SELECT p.name 지도교수명,COUNT(*) 인원수
FROM student s,professor p
WHERE s.profno=p.no
GROUP BY profno
HAVING COUNT(*)>=2;

--지도교수가 지도하는 학생의 인원수가 2명이상인 지도교수 번호, 학과코드, 학과명 출력하기 
SELECT p.no,p.name,p.deptno,m.name,COUNT(*) 
FROM professor p, major m,student s
WHERE p.deptno=m.code AND p.no = s.profno
GROUP BY p.no
HAVING COUNT(*)>=2;


--1022
/*
	비등가 조인(Non Equi Join) :
		조인컬럼의 조건이 = 가 아닌 경우. 범위 지정으로 조인됨.
*/
SELECT * FROM guest;
SELECT * FROM pointitem;

--고객의 포인트로 받을 수 있는 상품명, 고객이름, 고객의 포인트 조회하기 
SELECT g.name,g.point,p.name
FROM guest g, pointitem p
WHERE g.point BETWEEN p.spoint AND p.epoint;

-- 고객은 자기 포인트보다 낮은 포인트의 상품을 선택할 수 있다고 가정할때 
-- 외장 하드를 선택할 수 있는 고객의 이름, 포인트, 포인트 상품명, 시작 포인트, 종료 포인트를 조회하기 
SELECT g.name 이름 ,g.point 포인트 ,p.name 상품명,p.spoint 시작포인트, p.epoint 종료포인트
FROM guest g, pointitem p
WHERE g.point >= p.spoint
AND p.name = "외장하드";

-- 낮은 포인트의 상품을 선택 할 수 있을 때, 개인별로 사져갈 수 있는 상품의 갯수 조회하기 
-- 고객명, 고객포인트, 상품의 갯수 조회 
-- 상품의 갯수의 내림차순으로 정렬하여 출력하기 
SELECT g.name 이름 ,g.point 포인트,COUNT(*) 상품의갯수
FROM guest g, pointitem p
WHERE g.point >= p.spoint
GROUP BY g.name
ORDER BY COUNT(*) DESC;

-- 낮은 포인트의 상품을 선택 할 수 있을 때, 개인별로 사져갈 수 있는 상품의 갯수 조회하기 
-- 고객명, 고객포인트, 상품의 갯수 조회 
-- 상품의 갯수의 내림차순으로 정렬하여 출력하기  
-- 선택할 수 있는 상품의 갯수가 2개이상인 정보 출력하기 
SELECT g.name 이름 ,g.point 포인트,COUNT(*) 상품의갯수
FROM guest g, pointitem p
WHERE g.point >= p.spoint
GROUP BY g.name
HAVING COUNT(*)>=2
ORDER BY COUNT(*) DESC;


SELECT * FROM scorebase;
--학생의 학번, 이름, 국어,수학,영어,총점,평균,학점 출력하기 
-- 평균은 반올림하여 정수로 처리한다 
-- 학점은 scorebase 테이블을 따른다 
SELECT s.studno 학번, s.name 이름, kor 국어,math 수학,eng 영어, 
kor+math+eng '총점', ROUND((kor+math+eng)/3,0) '평균',s3.grade '학점'
FROM student s, score s2, scorebase s3
WHERE s.studno = s2.studno
AND ROUND((kor+math+eng)/3,0) between min_point AND max_point;

SELECT s.studno 학번, s.name 이름, kor 국어,math 수학,eng 영어, 
kor+math+eng '총점', ROUND((kor+math+eng)/3,0) '평균',s3.grade '학점'
FROM student s join score s2
on s.studno = s2.studno join scorebase s3
on ROUND((kor+math+eng)/3,0) between min_point AND max_point;


-- 평균은 반올림하여 정수로 처리한다 
-- 학점은 scorebase 테이블을 따른다  
-- 학점별 인원수 , 학점별 개인평균점수의 평균을 조회 
SELECT s3.grade '학점',COUNT(*) 인원수, avg((kor+math+eng)/3) '평균'
FROM  score s2, scorebase s3
WHERE ROUND((kor+math+eng)/3,0) between min_point AND max_point
GROUP BY s3.grade;

/*
  self join : 같은 테이블을 join함.
  			 	  반드시 테이블의 별명을 설정해야함.
*/
SELECT * FROM emp;
--emp 테이블에서 사원번호, 사원명, 상사의 이름 조회하기
SELECT e1.empno,e1.ename,e2.ename
FROM emp e1,emp e2
WHERE e1.mgr=e2.mgr;

--1.전공학과(major) 테이블에서 학과코드와 학과명, 상위학과명 조회하기
SELECT * FROM major;

SELECT m1.code,m1.name,m2.name
FROM major m1,major m2
WHERE m1.part=m2.code;

--2.교수번호, 이름, 입사일, 입사일이 같은사람의 인원수 조회하기
-- 입사일이 빠른 순으로 출력하기
SELECT p1.no,p1.name,p1.hiredate,COUNT(*)
FROM professor p1,professor p2
WHERE p1.hiredate=p2.hiredate
GROUP BY p1.no
ORDER BY p1.hiredate;


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
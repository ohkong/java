/*
	그룹함수 : 레코드 여러줄을 이용하여 결과 리턴 
				  group by, having 구문 사용됨.
	select 컬럼|* from 테이블명 
	[where 조건문]  => 레코드 선택 기준 
	[group by 컬럼 ] => 컬럼을 기준으로 레코드를 그룹화 
	[having 조건 ]	 => 그룹함수의 조건. 반드시 group by 와 같이 사용해야함.
	[order by 컬럼]  => 정렬 방식 지정. 
*/
SELECT NOW()
--오라클 
-- SELECT SYSDATE FROM dual


--count() : 조회된 레코드의 건수 리턴. 
-- 			null값은 건수에서 제외 

-- 교수의 전체 인원수, 보너스를 받는 인원수 조회하기 
SELECT COUNT(*),COUNT(bonus) FROM professor;
-- 학생의 전체인원수와, 지도교수를 배정받은 학생의 인원수 조회하기 
SELECT COUNT(*),COUNT(profno) FROM student;
-- 1학년 학생의 전체인원수와, 지도교수를 배정받은 학생의 인원수 조회하기 
SELECT COUNT(*),COUNT(profno) FROM student WHERE grade = 1;
-- 2학년 학생의 전체인원수와, 지도교수를 배정받은 학생의 인원수 조회하기 
SELECT COUNT(*),COUNT(profno) FROM student WHERE grade = 2;
-- 3학년 학생의 전체인원수와, 지도교수를 배정받은 학생의 인원수 조회하기 
SELECT COUNT(*),COUNT(profno) FROM student WHERE grade = 3;
-- 4학년 학생의 전체인원수와, 지도교수를 배정받은 학생의 인원수 조회하기 
SELECT COUNT(*),COUNT(profno) FROM student WHERE grade = 4;
--학년별 학생의 인원수와 지도교수를 배정받은 학생의 인원수 조회하기 
SELECT grade,COUNT(*),COUNT(profno) FROM student GROUP BY grade;
--전공1학과별 학생의 인원수와 지도교수를 배정받은 학생의 인원수 조회하기 
SELECT major1,COUNT(*),COUNT(profno) FROM student GROUP BY major1;

-- 합계 : sum
-- 평균 : avg =>null 값은 제외됨.
-- 교수들의 급여 합계와 보너스 합계 출력하기 
SELECT SUM(salary),SUM(bonus) FROM professor;
-- 교수들의 급여 합계와 평균 보너스 합계,보너스평균 출력하기 
-- 평균은 보너스를 받는 교수들의 평균 의미함. 
SELECT SUM(salary),avg(salary),SUM(bonus),avg(bonus) FROM professor;
-- 교수들의 급여 합계와 평균 보너스 합계,보너스평균 출력하기 
-- 평균을 모든 교수들의 평균으로 산출하기 
SELECT SUM(salary),avg(salary),SUM(bonus),avg(ifnull(bonus,0)) FROM professor;

/*
	문제1 
	교수의 부서별 인원수, 급여합계, 보너스 합계, 
	급여평균, 보너스평균 출력하기 
	단 보너스가 없는 교수도 평균에 계산하도록 하기 
*/
SELECT COUNT(*) 인원수,SUM(salary) 급여합계,SUM(bonus) 보너스합,AVG(salary)급여평균
,AVG(IFNULL(bonus,0))보너스평균 FROM professor;

/*
	문제2
	교수의 직급별 인원수, 직급별 급여합계, 직급별 보너스 합계, 
	급여평균, 보너스평균 출력하기 
	단 보너스가 없는 교수도 평균에 계산하도록 하기 
*/
SELECT position,COUNT(*)인원수,SUM(salary)급여합계,SUM(bonus)보너스합계,
AVG(salary)급여평균,AVG(IFNULL(bonus,0))보너스평균 FROM professor GROUP BY POSITION;

/*
	문제3
	1학년 학생의 인원수, 키, 몸무게의 평균 출력하기
*/
SELECT COUNT(*)인원수, AVG(height)키평균, AVG(weight)몸무게평균 FROM student WHERE grade = 1;

/*
	문제4
	학년별 학생의 인원수, 키, 몸무게의 평균 출력하기
*/
SELECT grade 학년,COUNT(*)인원수, AVG(height)키평균, AVG(weight)몸무게평균 FROM student GROUP BY grade;

/*
	문제5
	부서별 교수의 급여합 보너스합 연봉합 급여평균 보너스평균 연봉평균 출력하기
	연봉은 급여*12+보너스
	보너스없는 경우는 0으로 처리함
	평균 출력시 소숫점이하 2자리로 반올림하여 출력할것.
*/
SELECT deptno, SUM(salary)급여합,SUM(ifnull(bonus,0))보너스합, SUM(salary*12+ifnull(bonus,0))연봉합,
round(AVG(salary),2)급여평균,round(AVG(ifnull(bonus,0)),2)보너스평균,
round(AVG(salary*12+ifnull(bonus,0)),2)연봉평균 FROM professor GROUP BY deptno;
 
/*
	min : 최소 값 
	max : 최대 값 
*/
--전공1학과 별 가장 키가큰 학생의 키와 , 작은 키, 키평균을 출력하기
SELECT major1,MAX(height),MIN(height),AVG(height)
FROM student
GROUP BY major1;

--교수 중 급여와 보너스의 합계가 가장 많은값, 가장 적은 값,평균 조회하기
-- 보너스가 없는 경우 0으로 처리하기
-- 평균은 소수점이하 한자리로 반올림 하여 출력하기
SELECT max(salary+ifnull(bonus,0)),MIN(salary+ifnull(bonus,0)),
round(AVG(salary+ifnull(bonus,0)),1) FROM professor;

/*
	표준편차 : stddev
	분산 : variance
*/
--교수들의 급여평균과 표준편차, 분산 조회하기
SELECT AVG(salary), STDDEV(salary), VARIANCE(salary) FROM professor;
--학생의 점수테이블에서 합계평균, 합계펴준편차, 합계분산 
SELECT AVG(kor+eng+math),STDDEV(kor+eng+math),VARIANCE(kor+eng+math) FROM score;

/*
	having : 그룹의 조건
*/		
--학생의 학년별 키와 몸무게의 평균을 조회하기
-- 몸무게 평균이 70이상인 학년만 출력하기
SELECT grade,avg(height),AVG(weight)
FROM student
GROUP BY grade
HAVING AVG(weight)>=70;

/*
1.	교수의 부서별 급여합계와 편균을 구하기 
	급여 평균이 400이상인 부서만 조회하기
*/
SELECT deptno,SUM(salary),AVG(salary) 
FROM professor 
GROUP BY deptno 
HAVING AVG(salary)>=400;

/*
   주민번호를 기준으로 남학생과 여학생의 최대키, 최소키 ,평균키를 출력하기
	평균키는 소숫점이하 1자리에서 반올림하여 출력하기
*/
SELECT if(SUBSTR(jumin,7,1)IN(1,3),'남학생',if(SUBSTR(jumin,7,1)IN(2,4),'여학생',''))성별,
MAX(height)최대키,MIN(height)최소키,round(AVG(height),1)평균키 
FROM student
GROUP BY 성별;

/*
	학생중 생일(birthday)기준으로 월별로 태어난 인원수를 출력하기 
*/
SELECT CONCAT(MONTH(birthday),'월') 월,COUNT(birthday)인원수
FROM student
GROUP BY MONTH(birthday);
/*
	학생중 생일(birthday)기준으로 월별로 태어난 인원수를 가로로 출력하기 
*/
SELECT COUNT(*) 전체,
sum(if(MONTH(birthday)=1,1,0)) 1월,
sum(if(MONTH(birthday)=2,1,0)) 2월,
sum(if(MONTH(birthday)=3,1,0)) 3월,
sum(if(MONTH(birthday)=4,1,0)) 4월,
sum(if(MONTH(birthday)=5,1,0)) 5월,
sum(if(MONTH(birthday)=6,1,0)) 6월,
sum(if(MONTH(birthday)=7,1,0)) 7월,
sum(if(MONTH(birthday)=8,1,0)) 8월,
sum(if(MONTH(birthday)=9,1,0)) 9월,
sum(if(MONTH(birthday)=10,1,0)) 10월,
sum(if(MONTH(birthday)=11,1,0)) 11월,
sum(if(MONTH(birthday)=12,1,0)) 12월
FROM student;


--1
SELECT grade 학년,round(AVG(height),2) 평균키,round(AVG(weight),2) 평균몸무게
FROM student
GROUP BY grade;
--2
SELECT major1 학과,MAX(height) 최대키,MIN(height) 최소키,AVG(height) 평균키 
FROM student
GROUP BY major1
HAVING AVG(height)>=170;
--3
SELECT job 직급,AVG(salary) 평균급여,if(AVG(salary)>=1000,'우수','보통') 급여평가
FROM emp GROUP BY job;
--4
SELECT major1 학과,AVG(weight) 평균몸무게,COUNT(*) 학생수
FROM student
GROUP BY major1
ORDER BY '평균몸무게' DESC;
--5
SELECT deptno 학과번호,COUNT(*)
FROM professor
GROUP BY deptno
HAVING COUNT(*)<=2;
--6
SELECT if(LEFT(tel,INSTR(tel,')')-1)=02,'서울', 
if(LEFT(tel,INSTR(tel,')')-1)=031,'경기',
if(LEFT(tel,INSTR(tel,')')-1)=051,'부산',
if(LEFT(tel,INSTR(tel,')')-1)=052,'경남','그외지역')))) 지역
,COUNT(*)
FROM student
GROUP BY 지역;
--7
SELECT  COUNT(*) 전체,
sum(if(LEFT(tel,INSTR(tel,')')-1)=02,1,0)) 서울,
sum(if(LEFT(tel,INSTR(tel,')')-1)=031,1,0)) 경기도,
sum(if(LEFT(tel,INSTR(tel,')')-1)=051,1,0)) 부산,
sum(if(LEFT(tel,INSTR(tel,')')-1)=052,1,0)) 경남,
sum(if(LEFT(tel,INSTR(tel,')')-1)NOT IN (02,031,051,052),1,0)) 그외지역 
FROM student;
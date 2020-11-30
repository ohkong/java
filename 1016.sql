/*
	근사정수 ceil : 큰 근사 정수
	floor : 작은 근사 정수
*/
SELECT CEIL(12.3456),FLOOR(12.3456),CEIL(-12.3456),FLOOR(-12.3456);

/*
	나머지 함수 : mod
	제곱 함수 : power
*/
SELECT MOD(21,8),POWER(3,3);

/*
	날짜 관련 함수
		현재날짜 : now(), curdate(), current_date, current_date()
			now() : 날짜와 시간 리턴.   --자바연동시에는 now를 많이 씀 날짜시간을 다 리턴받기 때문에
			나머지 : 날짜 리턴.
*/
SELECT now(), curdate(), current_date, CURRENT_DATE();
SELECT CURDATE()+1  -- +가 들어가면 정수형으로 변경됨 주의;;;;

/*
	날짜 사이의 일자 수 알기 : datediff
*/
SELECT NOW(),'2020-01-01',DATEDIFF(NOW(),'1996-08-09');

--학생 테이블에서 학생의 이름, 생일, 생일부터 현재까지의 일수 조회하기
SELECT NAME, birthday, DATEDIFF(NOW(),birthday) 일수 FROM student;

-- 학생 중 생일이 1996년 이후에 태어난 학생의 이름과 생일 조회하기
SELECT NAME,birthday FROM student WHERE birthday >='1996-01-01';

--학생의 이름 생일 현재까지의 개월수 나이를 조회
--개월수 : 일수/30 계산. 반올림하여 정수로 출력 
--나이 : 일수/365 계산. 절삭하여 정수로 출력 
SELECT NAME, birthday,round(DATEDIFF(NOW(),birthday)/30) '개월수' ,truncate(DATEDIFF(NOW(),birthday)/365,0) '나이' FROM student;

--교수의 이름, 직급, 입사일(hiredate),입사개월수, 입사년수를 조회하기
--입사개월수 : 일수/30 계산. 반올림하여 정수로 출력 
--입사년수  : 일수/365 계산. 절삭하여 정수로 출력
SELECT NAME, POSITION,hiredate,round(DATEDIFF(NOW(),hiredate)/30) '입사개월수' ,truncate(DATEDIFF(NOW(),hiredate)/365,0) '입사년수' FROM professor;

/*
	year : 년도,
	month : 월,
	day: 일,
	weekday : 요일 0:월,1:화 ... 6:일
	dayofweek : 요일 1:일,2:월 ... 7:토
	week : 일년 기준 몇번째 주
	last_day : 해당월의 마지막 날짜
*/
SELECT NOW(),YEAR(NOW()),month(NOW()),day(NOW()),WEEKDAY(NOW()),dayofweek(NOW()),WEEK(NOW()),LAST_DAY(NOW());

--교수의 이름, 입사일, 입사년도의 휴가보상일, 올해의 휴가보상일 출력하기
--휴가보상일 : 입사월의 마지막 일자 
SELECT NAME,hiredate,LAST_DAY(hiredate) '입사년도의 휴가보상일',LAST_day(CONCAT(YEAR(NOW()),'-',MONTH(hiredate),'-','01'))
 '올해의 휴가보상일' FROM professor;
--교수중 입사일이 1~3월인 교수의 급여를 15% 인상예정임.
--교수의 이름, 현재급여, 반올림된 인상예정급여, 급여소급일
--급여소급일 : 올해 입사월의 마지막일자로 한다.
--인상예정 교수만 출력하기
SELECT NAME,salary,round(salary*1.15) 인상급여,LAST_day(CONCAT(YEAR(NOW()),'-',MONTH(hiredate),'-','01')) 급여소급일 FROM professor
WHERE MONTH(hiredate) BETWEEN 1 AND 3;

/*
	기준 일자 기준 이전/이후 날짜 리턴
	date_add : 기준일의 이후 
	date_sub : 기준일의 이전
*/
--현재시간 기준 1일 이후 날짜
SELECT NOW(),DATE_ADD(NOW(),INTERVAL 1 DAY);
--현재시간 기준 1일 이전 날짜
SELECT NOW(),DATE_sub(NOW(),INTERVAL 1 DAY);
--현재시간 기준 1시간 이후 날짜
SELECT NOW(),DATE_ADD(NOW(),INTERVAL 1 HOUR);
--현재시간 기준 1분 이후 날짜
SELECT NOW(),DATE_ADD(NOW(),INTERVAL 1 MINUTE);
--현재시간 기준 1초 이후 날짜
SELECT NOW(),DATE_ADD(NOW(),INTERVAL 1 SECOND);
--현재시간 기준 1달 이후 날짜
SELECT NOW(),DATE_ADD(NOW(),INTERVAL 1 MONTH);
--현재시간 기준 1년 이후 날짜
SELECT NOW(),DATE_ADD(NOW(),INTERVAL 1 YEAR);
--현재기준 10일 이후의 일자의 해당월의 마지막날짜
SELECT NOW(),DATE_ADD(NOW(),INTERVAL 10 DAY), LAST_DAY(DATE_ADD(NOW(),INTERVAL 10 DAY));
--현재기준 20일 이전의 일자의 해당월의 마지막날짜
SELECT NOW(),DATE_sub(NOW(),INTERVAL 20 DAY), LAST_DAY(DATE_sub(NOW(),INTERVAL 20 DAY));

--교수 번호, 이름, 입사일, 정식입사일 조회하기
--정식입사일 : 입사일 3개월 이후로 한다
SELECT NO,NAME,hiredate,DATE_ADD(hiredate,INTERVAL 3 MONTH) 정식입사일 FROM professor;
--사원의 정식 입사일은 입사일의 2개월 이후 다음달 1일로한다.
--사원번호, 이름, 입사일, 정식입사일 조회하기
SELECT empNO,eNAME,hiredate,DATE_ADD(last_day(DATE_ADD(hiredate,INTERVAL 2 MONTH)),INTERVAL 1 DAY) 정식입사일 FROM emp;

/*
	날짜를 문자열로 변환 : date_format
	문자열을 날짜로 변환 : str_to_date
	 
	%Y : 4자리 년도
	%m : 2자리 월
	%d : 2자리 일자
	%h : 1~12시
	%H : 0~23시
	%i : 분
	%s : 초
	%p : AM/PM
	%W : 요일
	%a : 약자표시 요일
*/
SELECT NOW(), DATE_FORMAT(NOW(),"%Y년%m월%d일 %H:%i:%s"),DATE_FORMAT(NOW(),"%Y년%m월%d일 %h:%i:%s %p"),
DATE_FORMAT(NOW(),"%Y년%m월%d일 %h:%i:%s %W"),DATE_FORMAT(NOW(),"%Y년%m월%d일 %h:%i:%s %a");

SELECT STR_TO_DATE("20201016","%Y%m%d"),LAST_DAY(STR_TO_DATE("20201016","%Y%m%d"));
--20201016 문자열을 2020년10월16일 형태로 출력하기
SELECT DATE_FORMAT((STR_TO_DATE("20201016","%Y%m%d")),"%Y년 %m월 %d일");

-- 교수의 이름, 직책, 입사일, 정식입사일 출력하기
-- 입사일 : 1990년 01월 01일 형식으로 출력
-- 정식입사일 : 04월 01일 형식으로 출력하기
SELECT NAME,position,hiredate,date_format(hiredate,"%Y년 %m월 %d일") 입사일,
date_format(DATE_ADD(hiredate,INTERVAL 3 MONTH),"%m월 %d일") 정식입사일 FROM professor;

  
SELECT empno,ename,job,deptno, 
concat(year(DATE_ADD(hiredate,INTERVAL 10 YEAR)),'-',month(birthday),'-','01') '안식시작일',
last_day(concat(year(DATE_ADD(hiredate,INTERVAL 10 YEAR)),'-',month(birthday),'-','01')) '안식종료일'
FROM emp;
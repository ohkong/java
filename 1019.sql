/* 전날복습
	숫자관련함수
	반올림 : round(컬럼,[표시할 소숫점 이하자리수]) // 소숫점자리수 생략가능
	버림 : truncate(컬럼,표시할 소숫점 이하자리수)  // 소숫점자리수 생략불가
	나머지 : mod(숫자1, 숫자2) // 숫자1 % 숫자2
	제곱 : power(숫자1, 숫자2) // 숫자1을 숫자2번 곱하기
	근사정수 : ceil :	큰 근사정수
				  floor : 작은 근사정수
	
	날짜 관련 함수
		현재시점 :  now() 날짜와 시간을 같이 출력
		오늘일자 : curdate(), current_date(), current_date
		일자수 계산 : datediff(날짜1, 날짜2)  날짜1 - 날짜2
		일자의 부분
			year(날짜) : 년도 리턴
			month(날짜) : 월 리턴
			day(날짜) : 일 리턴
			weekday(날짜) : 요일 리턴. 0(월) ... 6(일)
			dayofweek(날짜) : 요일 리턴. 1(일) ... 7(토)
			Last_day(날짜) : 해당 날짜의 마지막 날짜
		날짜의 이전 이후
			date_sub(날짜, interval 숫자 [year|month|day|hour|minute|second])
			date_add(날짜, interval 숫자 [year|month|day|hour|minute|second])
		날짜 변환
		date_format(날짜, "형식지정문자") : 날짜 => 형식화된 문자열 변환
		str_to_date(문자열, "형식지정문자") : 형식화된 문자열 => 날짜 변환
		형식지정문자 : 년도 :%Y, 월:%m, 일:%d, 시:%h,%H, 분:%i, 초:%s
*/


/*
	기타 함수
	ifnull(컬럼, 기본값) : 컬럼의 값이 null인 경우 기본값으로 변환
					오라클 : nvl 함수
*/
--교수의 이름, 직급, 급여, 보너스, 급여+보너스 조회
SELECT NAME,POSITION,salary,bonus,salary+bonus FROM professor;
--> 보너스가 null인 경우 합계도 null
SELECT NAME,POSITION,salary,bonus,salary+bonus FROM professor WHERE bonus IS NOT NULL
UNION
SELECT NAME,POSITION,salary,bonus,salary FROM professor WHERE bonus IS NULL;
-->ifnull 함수 사용하기
SELECT NAME,POSITION,salary,bonus,ifnull(salary+bonus,salary) FROM professor;
SELECT NAME,POSITION,salary,bonus,salary+ifnull(bonus,0) FROM professor;

--1.교수의 이름, 직책, 급여, 보너스 출력하기
-- 보너스가 없는 경우 bonus없음으로 출력하기
SELECT NAME,POSITION,salary,ifnull(bonus,"bonus없음") bonus FROM professor;
--2.학생의 이름과 지도교수번호 조회하기
-- 지도교수가 없는 경우 지도교수 배정안됨 출력하기
SELECT NAME,ifnull(profno,"지도교수 배정안됨") profno FROM student;
--3.major 테이블에서 코드, 코드명, build 조회하기
--build값이 없는 경우 '단독 건물 없음' 출력하기
SELECT CODE,NAME,ifnull(build,"단독건물없음") build FROM major;

/*
	조건함수 : if, case
	if(조건문, 참, 거짓)  
					오라클 : dcode 함수
*/
--교수의 이름, 학과번호, 학과명 조회하기
--학과명은 학과번호가 101 : 컴퓨터공학, 나머지는 공란 출력
SELECT NAME, deptno, if(deptno=101,'컴퓨터공학',"") 학과명 FROM professor;
--교수의 이름, 학과번호, 학과명 조회하기
--학과명은 학과번호가 101 : 컴퓨터공학, 나머지는 그외 학과 출력
SELECT NAME, deptno, if(deptno=101,'컴퓨터공학',"그외 학과") 학과명 FROM professor;

--1.학생의 주민번호 7번째 자리가 1인경우 남자로, 2인경우 여자로 성별을 출력함
--학생의 이름, 주민번호, 성별 조회하기
SELECT NAME,jumin,if(jumin LIKE "______1%","남자","여자") 성별  FROM student;  --내가한것
SELECT NAME,jumin,if(SUBSTR(jumin,7,1)="1","남자",if(SUBSTR(jumin,7,1)="2","여자","")) 성별  FROM student; --강사님
--2.교수의 이름, 학과번호, 학과명 출력하기
--학과명 : 학과번호가 101 : 컴퓨터공학
--							 102 : 멀티미디어공학
--							 201 : 기계공학
-- 						나머지 : 그외학과 출력하기
SELECT NAME,deptno,if(deptno=101,'컴퓨터공학',if(deptno=102,'멀티미디어공학',if(deptno=201,'기계공학','그외학과'))) 학과명
FROM professor;
--학생의 이름, 전화번호, 지역명 조회하기
--지역명 : 지역번호가 02 : 서울, 031 : 경기, 032 : 인천  그외 기타지역
SELECT NAME,tel,if(tel LIKE '02%','서울',if(tel LIKE '031%','경기',if(tel LIKE '032%','인천','기타지역'))) 지역명
FROM student;   --내가한것
SELECT NAME,tel,if(substr(tel,1,2)='02','서울',if(substr(tel,1,3)='031','경기',if(substr(tel,1,2)='032','인천','기타지역'))) 지역명
FROM student; --내가
SELECT NAME,tel,if(LEFT(tel,INSTR(tel,')')-1)=02,'서울', if(LEFT(tel,INSTR(tel,')')-1)=031,'경기',
if (LEFT(tel,INSTR(tel,')')-1)=032,'인천','그외 기타지역'))) 지역명 FROM student; --강사님
--학생의 이름, 전화번호, 지역명 조회하기 
--지역명 : 지역번호가 02,031,032 : 수도권 , 그외 기타지역 
SELECT NAME,tel,if(LEFT(tel,INSTR(tel,')')-1) IN (02,031,032),"수도권",'기타지역') 지역명 FROM student

/*
	case 조건문 
		case 컬럼명  when 값1 then 문자 
					    when 값2 then 문자 ....
					    else 문자 end
		case when 조건 then 문자 
			  when 조건 then 문자 
			  else 문자 end
*/
--교수이름, 학과코드, 학과명 조회하기
-- 학과명 : 101 학과인 경우 '컴퓨터공학', 그외는 공란으로 출력
SELECT NAME,deptno,if(deptno=101,'컴퓨터공학','') 학과명 FROM professor;
SELECT NAME,deptno,
 case deptno when 101 then '컴퓨터공학'
 ELSE '' END 학과명 FROM professor;
 --교수이름, 학과코드, 학과명 조회하기
-- 학과명 : 101 학과인 경우 '컴퓨터공학', 그외는 기타학과으로 출력
SELECT NAME,deptno,if(deptno=101,'컴퓨터공학','기타학과') 학과명 FROM professor;
SELECT NAME,deptno,
 case deptno when 101 then '컴퓨터공학'
 ELSE '기타학과' END 학과명 FROM professor;
 --교수의 이름, 학과번호, 학과명 출력하기
--학과명 : 학과번호가 101 : 컴퓨터공학
--							 102 : 멀티미디어공학
--							 201 : 기계공학
-- 						나머지 : 그외학과 출력하기
SELECT NAME,deptno,if(deptno=101,'컴퓨터공학',if(deptno=102,'멀티미디어공학',if(deptno=201,'기계공학','그외학과'))) 학과명
FROM professor;

SELECT NAME,deptno,
		case deptno when 101 then '컴퓨터공학'
						when 102 then '멀티미디어공학'
						when 201 then '기계공학'
						ELSE '그외학과' END 학과명 FROM professor;
						
-- 학생의 주민번호 7번째 자리가 1,3인 경우 남자로 , 2,4인경우 여자로
-- 그외는 그외성별로 출력하기
-- 이름,주민번호ㅡ성별 조회하기
--if
SELECT NAME,jumin,if(SUBSTR(jumin,7,1) IN (1,3),"남자",
if(SUBSTR(jumin,7,1) IN (2,4),"여자","그외성별")) 성별  FROM student;
--case
SELECT NAME,jumin,
		case SUBSTR(jumin,7,1) when 1 then '남자'
							  		  when 2 then '여자'
									  when 3 then '남자'
									  when 4 then '여자'
		ELSE '그외성별' END 성별 FROM student;
		
SELECT NAME,jumin,
		case when SUBSTR(jumin,7,1) IN (1,3) then '남자'
			  when SUBSTR(jumin,7,1) IN (2,4) then '여자'						
		ELSE '그외성별' END 성별 FROM student;		
--학생의 이름, 전화번호, 지역명 조회하기
--지역명 : 지역번호가 02 : 서울, 031 : 경기, 032 : 인천  그외 기타지역
SELECT NAME,tel,if(LEFT(tel,INSTR(tel,')')-1)=02,'서울', if(LEFT(tel,INSTR(tel,')')-1)=031,'경기',
if (LEFT(tel,INSTR(tel,')')-1)=032,'인천','그외 기타지역'))) 지역명 FROM student;

SELECT NAME,tel,
  case  LEFT(tel,INSTR(tel,')')-1) when 02 then '서울'
  	 	 									  when 031 then '경기'
  	 	 									  when 032 then '인천'
  	ELSE '그외 기타지역' END 지역명 FROM student;
--학생의 이름, 전화번호, 지역명 조회하기 
--지역명 : 지역번호가 02,031,032 : 수도권 , 그외 기타지역 
SELECT NAME,tel,if(LEFT(tel,INSTR(tel,')')-1) IN (02,031,032),"수도권",'기타지역') 지역명 FROM student

SELECT NAME,tel,
  case when LEFT(tel,INSTR(tel,')')-1) IN (02,031,032) then '수도권'
  	ELSE '그외 기타지역' END 지역명 FROM student;

--1.학생의 이름, 주민번호, 출생분기를 조회
-- 출생분기 : 주민번호기준 생일이 1~3월  1분기, 4~6월 2분기, 7~9월 3분기, 10~12월 4분기
SELECT NAME,jumin,
		case when SUBSTR(jumin,3,2) BETWEEN 01 AND 03 then '1분기' 
			  when SUBSTR(jumin,3,2) BETWEEN 04 AND 06 then '2분기'
			  when SUBSTR(jumin,3,2) IN (7,8,9) then '3분기' 
			  when SUBSTR(jumin,3,2) IN (10,11,12) then '4분기'
			ELSE '' END 출생분기 FROM student;
--2.학생의 이름, 생일, 출생분기를 조회
-- 출생분기 : 생일기준 생일이 1~3월  1분기, 4~6월 2분기, 7~9월 3분기, 10~12월 4분기
SELECT NAME,birthday,
		case when month(birthday) BETWEEN 01 AND 03 then '1분기' 
			  when month(birthday) BETWEEN 04 AND 06 then '2분기'
			  when month(birthday) BETWEEN 07 AND 09 then '3분기' 
			  when month(birthday) BETWEEN 10 AND 12 then '4분기'
			ELSE '' END 출생분기 FROM student;

SELECT NAME,jumin,
		case when SUBSTR(birthday,6,2) BETWEEN '01' AND '03' then '1분기' 
			  when SUBSTR(birthday,6,2) BETWEEN '04' AND '06' then '2분기'
			  when SUBSTR(birthday,6,2) IN (7,8,9) then '3분기' 
			  when SUBSTR(birthday,6,2) IN (10,11,12) then '4분기'
			ELSE '' END 출생분기 FROM student;


--1번
--if
SELECT studno,NAME,major1,
	if(MOD(studno,3)=0,'A팀',
	if(MOD(studno,3)=1,'B팀',
	if(MOD(studno,3)=2,'C팀',''))) 팀이름 FROM student;
--case
SELECT studno,NAME,major1,
  case MOD(studno,3) when 0 then 'A팀'
  							 when 1 then 'B팀'
  							 when 2 then 'C팀'
  		END '팀 이름' FROM student;
--2번
SELECT studno,kor,math,eng,truncate((kor+math+eng)/3,0) 평균,
case when (kor+math+eng)/3>=95 then 'A+' 
     when (kor+math+eng)/3>=90 then 'A0'
     when (kor+math+eng)/3>=85 then 'B+'
     when (kor+math+eng)/3>=80 then 'B0'
     when (kor+math+eng)/3>=75 then 'C+'
     when (kor+math+eng)/3>=70 then 'C0'
     when (kor+math+eng)/3>=65 then 'D+'
     when (kor+math+eng)/3>=60 then 'D0'
     END '학점',
case when (kor+math+eng)/3>=60 then 'PASS'
     ELSE 'FAIL' END 인정여부 FROM score; 
--3번 
SELECT NAME,height,weight,
case when height<160 then 'A등급'
     when height between 160 AND 169 then 'B등급'
     when height BETWEEN 170 AND 179 then 'C등급'
     when height>=160 then 'D등급'
     END 키의범위 FROM student;
--4번 
SELECT NAME, salary,
case when salary<=200 then '4급'
     when salary BETWEEN 201 AND 300 then '3급'
     when salary BETWEEN 301 AND 400 then '2급'
     when salary>=401 then '1급'
     END 등급 FROM professor ORDER BY 3;
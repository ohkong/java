/*
	함수
		단일행 함수 : 하나의 레코드에서만 사용되는 함수
		그룹 함수	: 여러행에 관련된 기능을 처리하는 함수
						group by , having 구문과 관련이 있음
*/

/*
	 단일행 함수: 문자관련 함수
	 1. 대소문자 변환 함수 :  upper, lower
*/
--학생의 전공1학과가 101인 학생의 이름 id 대문자id 소문자id 조회하기
SELECT NAME,id,UPPER(id),LOWER(id) FROM student WHERE major1 = 101;

--문자열 길이 함수 : length char_length
--length : 바이트 수 리턴
--char_length : 뮨자열의 길이 리턴. 한글은 3바이트

--학생의 이름, 아이디, 이름글자수, 이름바이트 수 조회하기
SELECT NAME,id, CHAR_LENGTH(NAME),length(NAME) FROM student;

SELECT LENGTH("가나다라마바사아")

--문자열의 연결 함수 : concat
-- 교수의 이름과 직급을 연결하여 조회하기
SELECT concat(NAME,POSITION) FROM professor
SELECT concat(NAME,POSITION,'님') FROM professor

--학생의 정보를 '홍길동1학년 150cm 50kg' 형태로 조회하기
SELECT CONCAT(NAME,grade,'학년 ', height,'cm ',weight,'kg') FROM student

/*
	부분문자열 : substr, left, right
		substr(컬럼명,시작인덱스,글자수)
		left(컬렴명,글자수) : 왼쪽 글자수만큼 부분 문자열리턴
		right(컬렴명,글자수) : 오른쪽 글자수만큼 부분 문자열리턴
*/
--학생의 이름2자만 조회하기
SELECT NAME,RIGHT(NAME,2) FROM student

--학생의 이름과 주민번호기준 생일 부분 조회하기
SELECT NAME,LEFT(jumin,6) FROM student
SELECT NAME,substr(jumin,1,6) FROM student

/*
1. 학생중 생일이 3월인 학생의 이름과 생년월일 출력하기 단 생일은 학생의 주민번호 기준으로 한다
2. 학생의 이름과 학년, 생년월일을 99년02월20일의 형식으로 출력하기
	생년월일은 주민번호 기준으로. 월을 기준으로 정렬하기
*/
SELECT NAME, LEFT(jumin,6) FROM student WHERE substr(jumin,3,2) = '03';

SELECT NAME, grade, CONCAT(LEFT(jumin,2),'년',SUBSTR(jumin,3,2),'월',SUBSTR(jumin,5,2),'일')생일 FROM student ORDER BY SUBSTR(jumin,3,2);

/*
	문자열에서 문자의 위치 : INSTR 
	INSTR(컬럼, 문자) :컬럼에 문자의 위치 리턴
*/
--학생의 이름, 전화버놓 전화번호의  ) 위치 조회하기
SELECT NAME, TEL, INSTR(tel,')')FROM student

-- 학생의 이름 전화번호 지역번호 출력하기
-- 지역번호 : 전화번호의 02, 032.. ...
SELECT NAME,tel,LEFT(tel,INSTR(tel,')')) 지역번호 FROM student

/*
교수의 이름 url homepage 조회하기 
homepage : url 정보에서 http://  이후의 문자열을 의미한다.
*/
SELECT NAME, url, SUBSTR(url,8) homepage FROM professor;
SELECT NAME, url, SUBSTR(url,INSTR(url,'/')+2) homepage FROM professor;






/*
문자 추가함수 : lpad, rpad 
	lpad 왼쪾에 문자 추가
	lpad(컬럼명,전체자리수,문자)
	rpad 오른쪽에 문자 추가
	rpad(컬럼명,전체자리수,문자)
*/

--학생의 학번 이름 조회하기 학번은 10자리로 빈자리는 오른쪽 *채워 출력하기
SELECT RPAD(studno,10,'*'), NAME FROM student	

--학생의 학번 이름 id조회하기
--학번은 10자리로 빈자리는 오른쪽에 *채워 출력 
--id는 20자리로 빈자리는 왼쪽에 $로 채워 출력
SELECT RPAD(studno,10,'*'), NAME,lPAD(id,20,'$') FROM student

/*
	문자 제거 함수 : trim,rtrim,ltrim
*/
--왼쪽 공배 제거
SELECT CONCAT("***",LTRIM("   왼쪽 공백 제거   "),"***");
--오른쪽 공백 제거
SELECT CONCAT("***",RTRIM("   오른쪽 공백 제거   "),"***");
--양쪽 공백 제서
SELECT CONCAT("***",TRIM("   양쪽 공백 제거   "),"***");

-- 0001200005670000 문자의 양쪽의 0 제거하기
SELECT TRIM(BOTH '0' FROM 0001200005670000)
-- 0001200005670000 문자의 오른쪽의 0 제거하기
SELECT TRIM(trailing '0' FROM '0001200005670000')
-- 0001200005670000 문자의 왼쪽의 0 제거하기
SELECT TRIM(leading '0' FROM '0001200005670000')


SELECT NAME,url,TRIM(LEADING 'http://' FROM url) homepage FROM professor

/*
	문자 치환 함수 : replace 
	replace(컬럼명,"문자1","문자2") : 컬럼에서 문자1을 문자2로 변경
*/
--학생의이름중 성부분의 한개 글자를 #으로 치환하여 조회하기
SELECT replace(NAME,LEFT(NAME,1),"#") from student"

/*
	101학과 학생의 이름과 주민번호 조회하기
	단 주민번호는 뒤의 6자리는 *로 출력하기
	990101******* 형깃으로 출력하기
*/
SELECT name,replace(jumin,right(jumin,6),"*******") from student WHERE major1= 101;

SELECT name,concat(left(jumin,7),"*******") from student WHERE major1= 101;

/*
	학생의 학번 이름 id 출력하기
	id 는 첫문자는 대문자로  나머지는 소문자로 출려하기
	id 순으로 정렬하기

	학생의 id길이가 7개 이상 10개 이하인 id를 가진 학생의 학번, 이름,id,id의 글자수를 출력하기
*/
SELECT studno,NAME, concat(upper(LEFT(id,1)),LOWER(SUBSTR(id,2))) FROM student ORDER BY id;
SELECT studno,NAME,id,char_length(id) FROM student WHERE char_LENGTH(id) between 7 and 10;

--숫자관련 함수
/*
	반올림 함수 : round 
	round(숫자) : 소숫점 제거. 소숫점1자리에서 반올림 
	round(숫자1,숫자2) : 소숫점 이하 숫자2만큼 출력. 소숫점 이하 숫자2+1자리에서 반올림 

	버림함수 : truncate
	truncate(숫자1,숫자2) : 소숫점 이하 숫자2만큼 출력
*/
SELECT ROUND(12.3456,-1) r1, ROUND(12.3456) r2, ROUND(12.3456,0) r3,ROUND(12.3456,1) r4, ROUND(12.3456,2) r5, ROUND(12.3456,3) r6,
TRUNCATE(12.4567,-1) t1,TRUNCATE(12.4567,0) t2,TRUNCATE(12.4567,1) t3,TRUNCATE(12.4567,2) t4,TRUNCATE(12.4567,3) t5;

--교수의 이름 , 현재급여 15%인상 반올림 예상급여 , 15%인상 버림 예상급여 조회하기
SELECT NAME,salary,ROUND(salary*1.15) 반올림예상급여,TRUNCATE(salary*1.15,0) 버림예상급여 FROM professor

--score 테이블에서 학생의 학번,국어,수학,영어,총점,평균, 조회하기
--	평균은 소숫점 이하 2자리까지만 반올림하여 출력하기
--	총점의 내림차순으로 정렬
SELECT *,kor+math+eng 총점, ROUND((kor+math+eng)/3,2) 평균 FROM score ORDER BY 총점  DESC



--1
SELECT NAME, email, SUBSTR(email,INSTR(email,'@')+1) 서버주소 FROM professor;
--2
SELECT NAME,rPAD(id,20,'$') FROM professor WHERE deptno IN(101,201,301) 
union
SELECT name,lPAD(id,20,'#') FROM student WHERE major1 IN(101,201,301)
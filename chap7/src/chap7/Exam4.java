package chap7;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 회사의 직원(Employee)은 여려유형으로 나뉜다
 * 모든 직원은 직원구분, 이름 , 주소, 소속부서를 가진다.
 * 1. 정규직원(FormalEmployee) : 직원번호, 직급, 연봉을 가진다.
 * 			급여는 연봉 /12
 * 2. 비정규직원 (InformalEmployee): 계약 만료일(Date), 기본임금을 가진다.
 * 			급여는 기본임금을 지급한다.
 * 3. 임시직원 (TempEmployee): 시간당임금, 근무시간을 가진다.
 * 			급여는  시간당 임금 * 근무시간을 가진다.
 * 모든직원은 급여를 받는다. getPay() 메서드를 구현하기
 * 모든 직원들은 자신의 멤버변수의 내용을 입력받아 객체로 생성한다.
 */
 abstract class Employee{
	String type,name,addr,dept;
	Employee(String type,String name,String addr,String dept){
		this.type=type;
		this.name=name;
		this.addr=addr;
		this.dept=dept;
	}
	 abstract long getPay();
}
class FormalEmployee extends Employee{
	String empno;
	String position;
	int pay;
	FormalEmployee(String name, String addr,String dept,String empno, String position, int pay){
		super("정규직",name,addr,dept);
		this.empno=empno;
		this.position=position;
		this.pay=pay;
	}
	@Override
	long getPay() {
		return pay/12 ;
	}
	
}
class InformalEmployee extends Employee{
	Date expireDate;
	int initpay;
	InformalEmployee(String name, String addr,String dept,Date expireDate, int initpay) {
		super("비정규직",name,addr,dept);
		this.expireDate=expireDate;
		this.initpay=initpay;
	}
	@Override
	long getPay() {
		return initpay;
	}
}
class TempEmployee extends Employee{
	int timepay,emptime;
	TempEmployee(String name, String addr,String dept, int timepay, int emptime){
		super("임시직",name,addr,dept);
		this.timepay=timepay;
		this.emptime=emptime;
	}
	@Override
	long getPay() {
		return timepay*emptime;
	}
}
public class Exam4 {

	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		emps[0] = new FormalEmployee("박정규","서울","총무부","001","과장",50000000);
		Date exDate = new Date();// 오늘날짜
		//1년후의 날짜로 등록
		//exDate.getTime() : 1970년 이후부터의 현재까지의 시간을 밀리초 리턴
		//exDate.setTime() : 시간설정
		//					exDate.getTime() 이후 1년의 밀리초 더해서설정
		//exDate : 1년 후의 오늘
		exDate.setTime(exDate.getTime() + (1000l*60*60*24*365));
		emps[1] = new InformalEmployee("유비정","서울","기확부",exDate,1000000);
		emps[2] = new TempEmployee("손임시","서울","영업부",25000,10);
		long total = 0;
		for(Employee e : emps) {
			System.out.println(e.type+"=>"+e.name + ":"+e.getPay());
			if(e instanceof InformalEmployee) {
				System.out.println("계약 만료일 :"+ new SimpleDateFormat("yyyy-MM-dd").format(((InformalEmployee)e).expireDate));
			}
			total += e.getPay();
		}
		System.out.println("전체 직원 급여:" + total);
	}

}

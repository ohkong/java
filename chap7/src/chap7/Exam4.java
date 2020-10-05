package chap7;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ȸ���� ����(Employee)�� ������������ ������
 * ��� ������ ��������, �̸� , �ּ�, �ҼӺμ��� ������.
 * 1. ��������(FormalEmployee) : ������ȣ, ����, ������ ������.
 * 			�޿��� ���� /12
 * 2. ���������� (InformalEmployee): ��� ������(Date), �⺻�ӱ��� ������.
 * 			�޿��� �⺻�ӱ��� �����Ѵ�.
 * 3. �ӽ����� (TempEmployee): �ð����ӱ�, �ٹ��ð��� ������.
 * 			�޿���  �ð��� �ӱ� * �ٹ��ð��� ������.
 * ��������� �޿��� �޴´�. getPay() �޼��带 �����ϱ�
 * ��� �������� �ڽ��� ��������� ������ �Է¹޾� ��ü�� �����Ѵ�.
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
		super("������",name,addr,dept);
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
		super("��������",name,addr,dept);
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
		super("�ӽ���",name,addr,dept);
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
		emps[0] = new FormalEmployee("������","����","�ѹ���","001","����",50000000);
		Date exDate = new Date();// ���ó�¥
		//1������ ��¥�� ���
		//exDate.getTime() : 1970�� ���ĺ����� ��������� �ð��� �и��� ����
		//exDate.setTime() : �ð�����
		//					exDate.getTime() ���� 1���� �и��� ���ؼ�����
		//exDate : 1�� ���� ����
		exDate.setTime(exDate.getTime() + (1000l*60*60*24*365));
		emps[1] = new InformalEmployee("������","����","��Ȯ��",exDate,1000000);
		emps[2] = new TempEmployee("���ӽ�","����","������",25000,10);
		long total = 0;
		for(Employee e : emps) {
			System.out.println(e.type+"=>"+e.name + ":"+e.getPay());
			if(e instanceof InformalEmployee) {
				System.out.println("��� ������ :"+ new SimpleDateFormat("yyyy-MM-dd").format(((InformalEmployee)e).expireDate));
			}
			total += e.getPay();
		}
		System.out.println("��ü ���� �޿�:" + total);
	}

}

package chap16;

import java.util.Arrays;
import java.util.List;

class Member{
	public static int MALE=0;
	public static int FEMALE=1;
	private String name;
	private int gender;
	private int age;
	public Member(String name, int gender, int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public String getName() {return name;}
	public int getGender() {return gender;}
	public int getAge() {return age;}
}
public class Exam3 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿",Member.MALE,30),
				new Member("�����",Member.FEMALE,20),
				new Member("�̸���",Member.MALE,45),
				new Member("������",Member.FEMALE,27)
				);
		System.out.println("���ڳ����� ����� ����ϱ�");
		double ageAvg=list.stream().filter(m->m.getGender()==Member.MALE)
				.mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("���� ���� ���: "+ageAvg);
		System.out.println("���ڳ����� ����� ����ϱ�");
		ageAvg=list.stream().filter(m->m.getGender()==Member.FEMALE)
				.mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("���� ���� ���: "+ageAvg);
		System.out.println("����ȸ�� �̸� ����ϱ�");
		list.stream().filter(s->s.getGender()==Member.MALE)
		//String ��Ҹ� ���� Stream ��ü
		.map(m->m.getName()).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("����ȸ�� �̸� ����ϱ�");
		list.stream().filter(s->s.getGender()==Member.FEMALE)
		.map(Member::getName).forEach(s->System.out.print(s+" "));
	}
}

package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student2 implements Comparable<Student2>{
	 String studno;
	 String name;
	 int grade;

	Student2(String studno, String name, int grade) {
		this.studno = studno;
		this.name = name;
		this.grade = grade;
	}

	public String toString() {
		return "studno=" + studno + ",name=" + name + ",grade=" + grade;
	}

	@Override
	public int compareTo(Student2 s) {
		return studno.compareTo(s.studno);
	}
}

public class SortedEx2 {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(
				new Student2("1000","ȫ�浿",1),
				new Student2("1234","���",2),
				new Student2("3456","�̸���",3),
				new Student2("1001","�Ӳ���",4)
		);
		//
		System.out.println("******�й� ������ ����******");
		list.stream().sorted().forEach(s->System.out.println(s));
		System.out.println("******�й� �������� ����******");
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		System.out.println("******�̸� ������ ����******");
		list.stream().sorted((s1,s2)->s1.name.compareTo(s2.name)).forEach(s->System.out.println(s));
		System.out.println("******�г� ������ ����******");
		list.stream().sorted((s1,s2)->s1.grade-s2.grade).forEach(s->System.out.println(s));
		Comparator<Student2> c = new Comparator<Student2>() {
			@Override
			public int compare(Student2 s1,Student2 s2) {
				return s1.grade-s2.grade;
			}
		};
		list.stream().sorted(c).forEach(s->System.out.println(s));
		}
	}

package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student{
	private String name;
	private int eng;
	private int math;
	Student(String name, int eng, int math){
		this.name=name;
		this.eng=eng;
		this.math=math;
	}
	public String getName() {return name;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	public String toString() {
		return "name="+name+",eng="+eng+",math="+math;
	}
}
public class StreamEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿",60,70),
				new Student("���",65,55),
				new Student("�̸���",80,75),
				new Student("�Ӳ���",85,65)
				);
		//list.stream() : list ��ü�� ��Ҹ� Stream ��ü ����
		Stream<Student> st = list.stream();
		//forEach : ���� �ݺ���.
		//s : Student ��ü
		st.forEach(s->{
			System.out.print(s);
			int sum = s.getEng() + s.getMath();
			double avg=sum/2.0;
			System.out.printf(",����=%-4d,���=%.2f%n",sum,avg);
		});
		System.out.println();
		System.out.println("��ü���");
		list.stream().forEach(s->System.out.println(s));
		System.out.println("------");
		//mapToInt : Stream => IntStream ������ ��ȯ
		//sum() : IntStream�� ����� �� ����
		System.out.println("������������" + 
	    //list.stream().mapToInt(Student::getMath).sum());
		  list.stream().mapToInt(t->t.getMath()).sum()); //�������
		System.out.println("������������" + 
				  list.stream().mapToInt(Student::getEng).sum());
	}
}

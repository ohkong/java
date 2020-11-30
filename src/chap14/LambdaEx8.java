package chap14;

import java.util.function.Function;
import java.util.function.ToIntFunction;

/*
 * Function �������̽�
 *   �Ű�����,���ϰ��� ����.
 *   R applyXXX(...)
 */
class Student{
	private String name;
	private int eng;
	private int math;
	private String major;
	public Student(String name, int eng, int math, String major) {
		this.name=name;
		this.eng=eng;
		this.math=math;
		this.major=major;
	}
	public String getName() {return name;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	public String getMajor() {return major;}
}
public class LambdaEx8 {
	private static Student[] List = {
			new Student("ȫ�浿",90,80,"�濵"),
			new Student("���",95,70,"�İ�"),
			new Student("�̸���",85,75,"���")
	};
	public static void main(String[] args) {
		System.out.print("�л��� �̸�:");
		for(Student s : List)
			System.out.print(s.getName() + ",");
		System.out.println();
		System.out.print("�л��� �̸�:");
		printString(t->t.getName());
		
		System.out.print("������ �̸�:");
		for(Student s : List)
			System.out.print(s.getMajor() + ",");
		System.out.println();
		System.out.print("������ �̸�:");
		printString(t->t.getMajor());
		
		System.out.print("���� ����:");
		printString(t->t.getMath()+"");
		
		System.out.print("���� ����:");
		printString(t->t.getEng()+"");
		
		System.out.print("�л��̸�(��������):");
		printString(t->t.getName()+"("+t.getEng()+")");
		
		System.out.print("�л��̸�(��������):");
		printString(t->t.getName()+"("+t.getMath()+")");
		//
		System.out.print("�л����� ���� ���� �հ�:");
		printTot(t->t.getEng());
		System.out.print("�л����� ���� ���� �հ�:");
		printTot(t->t.getMath());
	}
	private static void printTot(ToIntFunction<Student> f) {
		int sum =0;
		for(Student s : List) sum+=f.applyAsInt(s);
		System.out.println(sum);
	}
	//Function<Student,String> : �Ű����� Student Ÿ��
	//							  ����Ÿ�� String Ÿ��
	private static void printString(Function<Student,String> f) {
		for(Student s : List)
			System.out.print(f.apply(s)+",");
		System.out.println();
	}
}

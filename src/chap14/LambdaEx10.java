package chap14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Predicate �������̽�
 * 	  �Ű����� ����. �������� boolean
 * 	  boolean test(T)
 */
public class LambdaEx10 {
	private static List<Student> list = Arrays.asList
			(new Student("ȫ�浿",55,90,"�濵"),
			new Student("�̸���",95,90,"�İ�"),
			new Student("���",75,80,"�ɸ�"),
			new Student("�Ӳ���",65,70,"����"),
			new Student("������",65,0,"�İ�")
			);
	public static void main(String[] args) {
		System.out.println("�������� 60�̻��� �л��� ���� ���:"
					+avgEng(t->t.getEng()>=60));
		System.out.println("�İ��� �л��� ���� ���:"
				+avgEng(t->t.getMajor().equals("�İ�")));
		System.out.println("�������� 60�̻��� �л��� ���� ���:"
				+avgMath(t->t.getMath()>=60));
		System.out.println("�İ��� �л��� ���� ���:"
				+avgMath(t->t.getMajor().equals("�İ�")));
		System.out.println("�İ��� �л��� �ƴ� ���� ���:"
				+avgMath(t->!t.getMajor().equals("�İ�")));
		//
		System.out.println("�İ��� �л��� �̸� :");
		namsList(t->t.getMajor().equals("�İ�"));
		System.out.println("�İ����� �ƴ� �л��� �̸� :");
		namsList(t->!t.getMajor().equals("�İ�"));
		System.out.println("���������� 80�̻��� �л��� �̸� :");
		namsList(t->t.getEng()>=80);
		System.out.println("���������� 60�̻��� �л��� �̸� :");
		namsList(t->t.getMath()>=60);
		
	}
	private static void namsList(Predicate<Student> p) {
		for(Student s : list) {
			if(p.test(s)) System.out.print(s.getName()+",");
		}
		System.out.println();
	}
	private static double avgMath(Predicate<Student> p) {
		int sum = 0,cnt=0;
		for(Student s : list) {
			if(p.test(s)) {
				sum+=s.getMath();
				cnt++;
			}
		}
		return (double)sum/cnt;
	}
	private static double avgEng(Predicate<Student> p) {
		int sum = 0,cnt=0;
		for(Student s : list) {
			if(p.test(s)) {
				sum+=s.getEng();
				cnt++;
			}
		}
		return (double)sum/cnt;
	}
}

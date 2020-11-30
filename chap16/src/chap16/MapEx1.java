package chap16;

import java.util.Arrays;
import java.util.List;

/*
 * mapXXX �޼��� : ��Ʈ���� ��Ҹ� ġȯ�ϴ� �޼���
 */
public class MapEx1 {
	
	public static void main(String[] args) {
		 List<String> list = Arrays.asList
				("ȫ�浿��","������","�����","����ġ��");
		list.stream().mapToInt(String::length).forEach(s->System.out.print(s+" "));
		System.out.println();
		List<Student> list2 = Arrays.asList(
				new Student("ȫ�浿",80,95),
				new Student("�̸���",90,75),
				new Student("���",75,70)
				);
		//�������� ��� ����ϱ�
		list2.stream().mapToInt(Student::getEng).forEach(s->System.out.print(s+" "));
		System.out.println();
		//�������� ��� ����ϱ�
		list2.stream().mapToInt(Student::getMath).forEach(s->System.out.print(s+" "));
		System.out.println();
		//�հ����� ��� ����ϱ�
		list2.stream().mapToInt(s->s.getEng()+s.getMath()).forEach(s->System.out.print(s+" "));
		System.out.println();
		//�л��� �̸��� ����ϱ�
		list2.stream().map(Student::getName).forEach(s->System.out.print(s+" "));
	}
}

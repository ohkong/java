package chap16;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Collectors.toList() : Stream ��Ҹ� List ��ü��
 * Collectors.toArray() : Stream ��Ҹ� �迭 ��ü��
 * Collectors.toMap() : Stream ��Ҹ� Map ��ü��
 */
public class CollectionEx1 {
	public static void main(String[] args) {
		Student[] strArr = {
				new Student("ȫ�浿",60,75),
				new Student("���",80,65),
				new Student("�̸���",90,85),
				new Student("���ڹ�",60,85),
		};
		System.out.println("�̸��� List<String> ��ü�� ����");
		//Stream.of(strArr) : strArr�� ��ü�� Stream<Student> ����
		//collect : Collection ��ü�� ����
		//Student[]::new : ������ ����
		List<String> names = Stream.of(strArr) //Stream<String>
				.map(Student::getName)
				.collect(Collectors.toList());
		System.out.println(names);
		System.out.println("Stream<Student> => Student[]��ü");
		Student[] stuArr2 = Stream.of(strArr)
				.toArray(Student[]::new);
		for(Student s : stuArr2) System.out.println(s);
		System.out.println("�̸��� key�� �ϴ� Map<String,Student> ��ü�� ����");
		Map<String,Student> map = Stream.of(strArr)
				.collect(Collectors.toMap(s->s.getName(),s->s));
		for(String k : map.keySet())
			System.out.println(k+":"+map.get(k));
	}
}

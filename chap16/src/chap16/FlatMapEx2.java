package chap16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapEx2 {
	public static void main(String[] args) {
		List<Student> list1 = Arrays.asList(
				new Student("ȫ�浿",70,80),
				new Student("��浿",75,70)
				);
		List<Student> list2 = Arrays.asList(
				new Student("���",90,88),
				new Student("��浿",95,75)
				);
		List<List<Student>> list = new ArrayList<List<Student>>();
		list.add(list1);list.add(list2);
		list.stream().flatMap(s->s.stream()).forEach(s->System.out.println(s));
	}	
}

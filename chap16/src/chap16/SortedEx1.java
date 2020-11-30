package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Stream �����ϱ�
 */
public class SortedEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList
				("ȫ�浿","���","�̸���","�Ӳ���");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("�������� �����ϱ�");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}

package chap16;

import java.util.Arrays;
import java.util.List;

public class FilterStreamEx1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList
				("ȫ�浿","���","ȫ�浿","�Ӳ���","ȫ�浿","���ڹ�","���ڹ�");
		// 1. list ��ü�� Stream ���� �����Ͽ� �ߺ����� ��� ����ϱ�
		list.stream().distinct().forEach(System.out::println);
		System.out.println();
		//2. list ��ü�� Stream���� ���� ȫ���� ��Ҹ� ����ϱ�
		list.stream().filter(s->s.startsWith("ȫ")).forEach(System.out::println);
		System.out.println();
		//3. list ��ü�� Stream���� ���� ȫ���� ��Ҹ� �ߺ����� ����ϱ�
		list.stream().filter(s->s.startsWith("ȫ")).distinct().forEach(System.out::println);
		System.out.println();
		//4. list ��ü�� Stream���� �̸��� �ڹ��� ��Ҹ� �ߺ����� ����ϱ�
		list.stream().filter(s->s.endsWith("�ڹ�")).distinct().forEach(System.out::println);
		System.out.println();
		//5. list ��ü�� Stream���� �̸��� �ڹ��� ����� ���� ����ϱ�
		System.out.println(list.stream().filter(s->s.endsWith("�ڹ�")).count());
				
	}

}

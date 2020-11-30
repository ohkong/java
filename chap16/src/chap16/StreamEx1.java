package chap16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * Stream ����
 * Stream �������� ����.
 * Collection�� Stream ��� ��
 */
public class StreamEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿","���","�̸���");
		System.out.println("���� ���: Iterator ��ü���");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		System.out.println();
		System.out.println("Stream ���");
		Stream<String> st = list.stream();
		//name : Stream ������ ������ �Ѱ�.
		st.forEach(name->System.out.print(name+" "));
		System.out.println();
	}
}

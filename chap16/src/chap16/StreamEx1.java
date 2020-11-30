package chap16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * Stream 예제
 * Stream 데이터의 모임.
 * Collection과 Stream 방식 비교
 */
public class StreamEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","김삿갓","이몽룡");
		System.out.println("기존 방식: Iterator 객체사용");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		System.out.println();
		System.out.println("Stream 방식");
		Stream<String> st = list.stream();
		//name : Stream 내부의 데이터 한개.
		st.forEach(name->System.out.print(name+" "));
		System.out.println();
	}
}

package chap16;

import java.util.Arrays;
import java.util.List;

public class FilterStreamEx1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList
				("홍길동","김삿갓","홍길동","임꺽정","홍길동","김자바","박자바");
		// 1. list 객체를 Stream 으로 변경하여 중복없이 요소 출력하기
		list.stream().distinct().forEach(System.out::println);
		System.out.println();
		//2. list 객체를 Stream으로 성이 홍씨인 요소를 출력하기
		list.stream().filter(s->s.startsWith("홍")).forEach(System.out::println);
		System.out.println();
		//3. list 객체를 Stream으로 성이 홍씨인 요소를 중복없이 출력하기
		list.stream().filter(s->s.startsWith("홍")).distinct().forEach(System.out::println);
		System.out.println();
		//4. list 객체를 Stream으로 이름이 자바인 요소를 중복없이 출력하기
		list.stream().filter(s->s.endsWith("자바")).distinct().forEach(System.out::println);
		System.out.println();
		//5. list 객체를 Stream으로 이름이 자바인 요소의 갯수 출력하기
		System.out.println(list.stream().filter(s->s.endsWith("자바")).count());
				
	}

}

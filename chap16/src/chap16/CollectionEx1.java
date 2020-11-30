package chap16;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Collectors.toList() : Stream 요소를 List 객체로
 * Collectors.toArray() : Stream 요소를 배열 객체로
 * Collectors.toMap() : Stream 요소를 Map 객체로
 */
public class CollectionEx1 {
	public static void main(String[] args) {
		Student[] strArr = {
				new Student("홍길동",60,75),
				new Student("김삿갓",80,65),
				new Student("이몽룡",90,85),
				new Student("이자바",60,85),
		};
		System.out.println("이름만 List<String> 객체로 저장");
		//Stream.of(strArr) : strArr의 객체를 Stream<Student> 변경
		//collect : Collection 객체로 변경
		//Student[]::new : 생성자 참조
		List<String> names = Stream.of(strArr) //Stream<String>
				.map(Student::getName)
				.collect(Collectors.toList());
		System.out.println(names);
		System.out.println("Stream<Student> => Student[]객체");
		Student[] stuArr2 = Stream.of(strArr)
				.toArray(Student[]::new);
		for(Student s : stuArr2) System.out.println(s);
		System.out.println("이름을 key로 하는 Map<String,Student> 객체로 저장");
		Map<String,Student> map = Stream.of(strArr)
				.collect(Collectors.toMap(s->s.getName(),s->s));
		for(String k : map.keySet())
			System.out.println(k+":"+map.get(k));
	}
}

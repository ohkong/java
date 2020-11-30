package chap16;

import java.util.Arrays;
import java.util.List;

/*
 * mapXXX 메서드 : 스트림의 요소를 치환하는 메서드
 */
public class MapEx1 {
	
	public static void main(String[] args) {
		 List<String> list = Arrays.asList
				("홍길동전","춘향전","구운몽","전우치전");
		list.stream().mapToInt(String::length).forEach(s->System.out.print(s+" "));
		System.out.println();
		List<Student> list2 = Arrays.asList(
				new Student("홍길동",80,95),
				new Student("이몽룡",90,75),
				new Student("김삿갓",75,70)
				);
		//영어점수 목록 출력하기
		list2.stream().mapToInt(Student::getEng).forEach(s->System.out.print(s+" "));
		System.out.println();
		//수학점수 목록 출력하기
		list2.stream().mapToInt(Student::getMath).forEach(s->System.out.print(s+" "));
		System.out.println();
		//합계점수 목록 출력하기
		list2.stream().mapToInt(s->s.getEng()+s.getMath()).forEach(s->System.out.print(s+" "));
		System.out.println();
		//학생의 이름만 출력하기
		list2.stream().map(Student::getName).forEach(s->System.out.print(s+" "));
	}
}

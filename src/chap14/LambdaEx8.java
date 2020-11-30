package chap14;

import java.util.function.Function;
import java.util.function.ToIntFunction;

/*
 * Function 인터페이스
 *   매개변수,리턴값도 있음.
 *   R applyXXX(...)
 */
class Student{
	private String name;
	private int eng;
	private int math;
	private String major;
	public Student(String name, int eng, int math, String major) {
		this.name=name;
		this.eng=eng;
		this.math=math;
		this.major=major;
	}
	public String getName() {return name;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	public String getMajor() {return major;}
}
public class LambdaEx8 {
	private static Student[] List = {
			new Student("홍길동",90,80,"경영"),
			new Student("김삿갓",95,70,"컴공"),
			new Student("이몽룡",85,75,"통계")
	};
	public static void main(String[] args) {
		System.out.print("학생의 이름:");
		for(Student s : List)
			System.out.print(s.getName() + ",");
		System.out.println();
		System.out.print("학생의 이름:");
		printString(t->t.getName());
		
		System.out.print("전공의 이름:");
		for(Student s : List)
			System.out.print(s.getMajor() + ",");
		System.out.println();
		System.out.print("전공의 이름:");
		printString(t->t.getMajor());
		
		System.out.print("수학 점수:");
		printString(t->t.getMath()+"");
		
		System.out.print("영어 점수:");
		printString(t->t.getEng()+"");
		
		System.out.print("학생이름(영어점수):");
		printString(t->t.getName()+"("+t.getEng()+")");
		
		System.out.print("학생이름(수학점수):");
		printString(t->t.getName()+"("+t.getMath()+")");
		//
		System.out.print("학생들의 영어 점수 합계:");
		printTot(t->t.getEng());
		System.out.print("학생들의 수학 점수 합계:");
		printTot(t->t.getMath());
	}
	private static void printTot(ToIntFunction<Student> f) {
		int sum =0;
		for(Student s : List) sum+=f.applyAsInt(s);
		System.out.println(sum);
	}
	//Function<Student,String> : 매개변수 Student 타입
	//							  리턴타입 String 타입
	private static void printString(Function<Student,String> f) {
		for(Student s : List)
			System.out.print(f.apply(s)+",");
		System.out.println();
	}
}

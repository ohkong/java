package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student{
	private String name;
	private int eng;
	private int math;
	Student(String name, int eng, int math){
		this.name=name;
		this.eng=eng;
		this.math=math;
	}
	public String getName() {return name;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	public String toString() {
		return "name="+name+",eng="+eng+",math="+math;
	}
}
public class StreamEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("È«±æµ¿",60,70),
				new Student("±è»ñ°«",65,55),
				new Student("ÀÌ¸ù·æ",80,75),
				new Student("ÀÓ²©Á¤",85,65)
				);
		//list.stream() : list °´Ã¼ÀÇ ¿ä¼Ò¸¦ Stream °´Ã¼ º¯°æ
		Stream<Student> st = list.stream();
		//forEach : ³»ºÎ ¹Ýº¹ÀÚ.
		//s : Student °´Ã¼
		st.forEach(s->{
			System.out.print(s);
			int sum = s.getEng() + s.getMath();
			double avg=sum/2.0;
			System.out.printf(",ÃÑÁ¡=%-4d,Æò±Õ=%.2f%n",sum,avg);
		});
		System.out.println();
		System.out.println("°´Ã¼Ãâ·Â");
		list.stream().forEach(s->System.out.println(s));
		System.out.println("------");
		//mapToInt : Stream => IntStream ÇüÀ¸·Î º¯È¯
		//sum() : IntStreamÀÇ ¿ä¼ÒÀÇ ÇÕ ¸®ÅÏ
		System.out.println("¼öÇÐÁ¡¼öÃÑÁ¡" + 
	    //list.stream().mapToInt(Student::getMath).sum());
		  list.stream().mapToInt(t->t.getMath()).sum()); //°°Àº°á°ú
		System.out.println("¿µ¾îÁ¡¼öÃÑÁ¡" + 
				  list.stream().mapToInt(Student::getEng).sum());
	}
}

package chap16;

import java.util.Random;

public class RandomToStreamEx1 {
	public static void main(String[] args) {
		System.out.println("int 형 난수 스트림 생성");
		new Random().ints(3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("0~2사이의 int 형 난수10개를 가진 스트림 생성");
		new Random().ints(10,0,3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("long 형 난수3개를 가진 스트림 생성");
		new Random().longs(3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("0~9사이의 long 형 난수3개를 가진 스트림 생성");
		new Random().longs(3,0,10).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("char 형 난수3개를 가진 스트림 생성");
		new Random().ints(3,'A','Z'+1).forEach(s->System.out.print((char)s+" "));
		System.out.println();
		System.out.println("Double 형 난수3개를 가진 스트림 생성");
		new Random().doubles(3).forEach(s->System.out.print(s+" "));
	}
}

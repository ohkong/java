package chap14;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

/*
 * Java API FunctionalInterface 예제
 * 	 Consumer 인터페이스
 * 	 accept() 추상메서드 : 매개변수 있고, 리턴값은 없는 메서드
 */
public class LambdaEx6 {
	public static void main(String[] args) {
		Consumer<String> c1 = t->System.out.println(t+8);
		c1.accept("java");
		BiConsumer<String,String> c2 = (t,u)->System.out.println(t+u);
		c2.accept("java","8.0이후");
		//매개변수 : double 형, 실수형
		DoubleConsumer c3 = d->System.out.println("java"+d);
		c3.accept(8.0);
		ObjIntConsumer<String> c4 = (t,i)->System.out.println(t+i);
		c4.accept("java", 8);
		//IntConsumer : 매개변수가 int형
		//				  잆력된 값까지 합을 출력하기
		IntConsumer c5 = x->{
			int sum =0;
			for(int i = 0;i<=x;i++)sum+=i;
			System.out.println(sum);};
		c5.accept(10); // 55
		c5.accept(100); // 5050
		
		//BiConsumer 이용하여 두수중 큰값을 리턴
		BiConsumer<String,String> c6 = (t,u)->{
			System.out.println(t.compareTo(u)>0?t:u);
		};
		c6.accept("abc", "def"); //def
	}
}

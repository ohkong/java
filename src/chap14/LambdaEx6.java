package chap14;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

/*
 * Java API FunctionalInterface ����
 * 	 Consumer �������̽�
 * 	 accept() �߻�޼��� : �Ű����� �ְ�, ���ϰ��� ���� �޼���
 */
public class LambdaEx6 {
	public static void main(String[] args) {
		Consumer<String> c1 = t->System.out.println(t+8);
		c1.accept("java");
		BiConsumer<String,String> c2 = (t,u)->System.out.println(t+u);
		c2.accept("java","8.0����");
		//�Ű����� : double ��, �Ǽ���
		DoubleConsumer c3 = d->System.out.println("java"+d);
		c3.accept(8.0);
		ObjIntConsumer<String> c4 = (t,i)->System.out.println(t+i);
		c4.accept("java", 8);
		//IntConsumer : �Ű������� int��
		//				  ��µ� ������ ���� ����ϱ�
		IntConsumer c5 = x->{
			int sum =0;
			for(int i = 0;i<=x;i++)sum+=i;
			System.out.println(sum);};
		c5.accept(10); // 55
		c5.accept(100); // 5050
		
		//BiConsumer �̿��Ͽ� �μ��� ū���� ����
		BiConsumer<String,String> c6 = (t,u)->{
			System.out.println(t.compareTo(u)>0?t:u);
		};
		c6.accept("abc", "def"); //def
	}
}

package chap14;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * Supplier �������̽�
 * 	 �Ű������� ����, ���ϰ��� ����.
 * 	 T getXXX() �޼��带 �߻� �޼���� ����
 */
public class LambdaEx7 {
	public static void main(String[] args) {
//		Supplier<String> s1 = ()->{
//			return "java";
//		};
		Supplier<String> s1 = ()->"java";
		System.out.println(s1.get());
		//������ �ֻ��� ���� ����
//		 IntSupplier s2 = ()->{
//			 return (int)(Math.random()*6)+1;
//		 };
		 IntSupplier s2 = ()->(int)(Math.random()*6)+1;
		 System.out.println(s2.getAsInt());
		 //IntSupplier�� �̿��Ͽ� 1���� 100������ ���� ����
		 s2 = ()->{
			 int sum=0;
			 for(int i = 0;i<=100;i++)sum+=i;
				return sum;
				};
		 System.out.println(s2.getAsInt()); //5050
		 
		 double[] arr = {1.1,2.4,2.4,5.3,10.3};
		 DoubleSupplier s3 = ()->{
			 double sum = 0;
			 for(double d : arr)sum+=d;
				return sum;
		 };
		 System.out.println(s3.getAsDouble()); //�迭����
	}
}

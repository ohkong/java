package chap16;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * 1ºÎÅÍ 100±îÁöÀÇ ÀÓÀÇÀÇ ¼ö 10°³¸¦ IntStream ¿¡ ÀúÀåÇÏ°í
 * ÀúÀåµÈ ¼öÀÇ ÃÑÇÕ, Æò±Õ, Â¦¼öÀÇ Æò±Õ, È¦¼öÀÇ Æò±Õ Ãâ·ÂÇÏ±â
 * Â¦¼öÀÇ °¹¼ö, È¦¼öÀÇ °¹¼ö
 */
public class Exam1 {
	public static void main(String[] args) {
		int[] arr =new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100+1);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("ÃÑÇÕ :" + Arrays.stream(arr).sum());
		System.out.println("Æò±Õ :" + Arrays.stream(arr).average().getAsDouble());
		System.out.println("Â¦¼ö Æò±Õ :" + Arrays.stream(arr).filter(i->i%2==0).average().getAsDouble());
		System.out.println("È¦¼ö Æò±Õ :" + Arrays.stream(arr).filter(i->i%2==1).average().getAsDouble());
		System.out.println("Â¦¼ö °¹¼ö :" + Arrays.stream(arr).filter(i->i%2==0).count());
		System.out.println("È¦¼ö °¹¼ö :" + Arrays.stream(arr).filter(i->i%2==1).count());
		System.out.println("Áßº¹µÈ ¼ıÀÚ Á¦°Å ÈÄ °¹¼ö :" + 
		Arrays.stream(arr).distinct().count());
	}
}

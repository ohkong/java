package chap16;

import java.util.Random;

public class RandomToStreamEx1 {
	public static void main(String[] args) {
		System.out.println("int �� ���� ��Ʈ�� ����");
		new Random().ints(3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("0~2������ int �� ����10���� ���� ��Ʈ�� ����");
		new Random().ints(10,0,3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("long �� ����3���� ���� ��Ʈ�� ����");
		new Random().longs(3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("0~9������ long �� ����3���� ���� ��Ʈ�� ����");
		new Random().longs(3,0,10).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("char �� ����3���� ���� ��Ʈ�� ����");
		new Random().ints(3,'A','Z'+1).forEach(s->System.out.print((char)s+" "));
		System.out.println();
		System.out.println("Double �� ����3���� ���� ��Ʈ�� ����");
		new Random().doubles(3).forEach(s->System.out.print(s+" "));
	}
}

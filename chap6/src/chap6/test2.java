package chap6;

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;

	public String toString() {
		return kind + ":" + number + "(" + width + "," + height + ")";
	}
}

class Animal{
	String name;
	int age;
	void eat() {
		System.out.println("���ְ� ���");
	}
}

class Coin{
	int side;
	void flip() {
		side = (int)(Math.random()*2);
		if(side==0) {
			System.out.println("�ո�");
		}else {
			System.out.println("�޸�");
		}
	}
}

class Student{
	String name;
	int ban,no,kor,eng,math;
	
	int getTotal() {//������ ���� ��
		return kor + eng + math;
	}
	float getAverage() {//���� ���   ����Ÿ�� float
		return getTotal()/3f;
	}
	public String toString() {
		return "�̸� : " + name + "\n" + "���� : " + kor + "\n" + "���� : " + eng + "\n" +
				"���� : " + math + "\n" + "����: " + getTotal() + "\n" +
				"��� : " + getAverage(); 
	}
}

public class test2 {

	public static void main(String[] args) {
		//1��
//		Card h1 = new Card();
//		Card s1 = new Card();
//		h1.kind="Heart";
//		h1.number = 1;
//		s1.kind="Spade";
//		s1.number = 1;
//		System.out.println(h1);
//		System.out.println(s1);
//		Card.width=50;
//		Card.height=80;
//		System.out.println(h1);
//		System.out.println(s1);
		
		
		
		//2��
//		Animal m1 = new Animal();
//		m1.name = "������";
//		m1.age = 20;
//		System.out.println("�̸�(name) : " + m1.name);
//		System.out.println("����(age) : " + m1.age);
//		m1.eat();
		
		
		
		//3��
//		Coin c1 = new Coin();
//		c1.flip();
		
		
		
		//4��
//		Student s1 = new Student();
//		s1.name = "ȫ�浿";
//		s1.kor=80;
//		s1.eng=90;
//		s1.math=70;
//		System.out.println(s1);
		
	
		
		//5��
		String str = "the unemployment rates for african americans hispanic-americans, and asian americans";
		char[] word = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[]count = new int[26];
		char ch =str.charAt(0);
		for(int i = 0;i<word.length;i++) {
			for(int j=0;j<str.length();j++) {
				if(ch==word[j]) {
					count[i]++;
				}
			}
		}
		for(int i = 0;i<word.length;i++) {
			if(count[i]>0)
			System.out.println(word[i]+":"+count[i]+"��");
		}
		
		
	}

}

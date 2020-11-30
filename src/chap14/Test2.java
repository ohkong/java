package chap14;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

class Person2 {
    String name;
    int age;
    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
           return name + ":" + age;
    }
}

public class Test2 {
   static Person2[] arr = {new Person2("ȫ�浿",10),
                   new Person2("���",30),
                   new Person2("�̸���",15),
                   new Person2("���ڹ�",25),
                   new Person2("���ڹ�",20)
   };
    public static void main(String[] args) {
             System.out.print("�̸� ��� :");
             printString(t->t.name);
             System.out.print("���� ��� :");
             printInt(t->t.age);
             System.out.print("�ѳ����� �ջ� :");
             printTot(t->t.age);
             System.out.print("������ ��� :");
             printAvg(t->t.age);
    }
    static void printString(Function<Person2,String> f) {
    	for(Person2 p : arr)
			System.out.print(f.apply(p)+",");
		System.out.println();
    }
    static void printInt(ToIntFunction<Person2> f) {
    	for(Person2 p : arr)
			System.out.print(f.applyAsInt(p)+",");
		System.out.println();
    }
    static void printTot(ToIntFunction<Person2> f) {
    	int sum =0;
		for(Person2 p : arr) sum+=f.applyAsInt(p);
		System.out.println(sum);
    }
    static void printAvg(ToDoubleFunction<Person2> f) {
    	double sum=0;
    	for(Person2 p : arr) sum+=f.applyAsDouble(p);
		System.out.println(sum/arr.length);
    } 
}
package chap14;

import java.util.TreeSet;

class Person{
	String name;
	int age;
	Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name + ":"+age;
	}
	
	
}
public class Test1 {
	public static void main(String[] args) {
		Person[] arr = {new Person("È«±æµ¿",10),
	               new Person("±è»ñ°«",30),
	               new Person("ÀÌ¸ù·æ",15),
	               new Person("±èÀÚ¹Ù",25),
	               new Person("¹ÚÀÚ¹Ù",20)};
		
	          TreeSet<Person> s1 = new TreeSet<Person>((p1,p2)->{
	        		 return p1.name.compareTo(p2.name); });
	          for(Person p : arr) s1.add(p);
	          System.out.print("ÀÌ¸§¼ø:");
	          System.out.println(s1);
	          
	          TreeSet<Person> s2 = new TreeSet<Person>((p1,p2)->{
	        	  return p1.age-p2.age;});
	          for(Person p : arr) s2.add(p);
	          System.out.print("³ªÀÌ¼ø:");
	          System.out.println(s2);
	          
	          TreeSet<Person> s3 = new TreeSet<Person>((p1,p2)->{
	        //	  return p1.name.compareTo(p2.name)*(-1);
	        	  return p2.name.compareTo(p1.name); });
	          for(Person p : arr) s3.add(p);
	          System.out.print("ÀÌ¸§ ¿ª¼ø:");
	          System.out.println(s3);
	          
	          TreeSet<Person> s4 = new TreeSet<Person>((p1,p2)->{
	        	  return p2.age-p1.age;});
	          for(Person p : arr) s4.add(p);
	          System.out.print("³ªÀÌ ¿ª¼ø:");
	          System.out.println(s4);
	}

}

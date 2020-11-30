package chap11;
class Student{
	int no;
	String name;
	String dept;
	
	Student(int no,String name,String dept) {
		this.no = no;
		this.name = name;
		this.dept = dept;
		
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student s = (Student)o;
			return name.equals(s.name) &&  no== s.no;
		}else return false;
	}
	@Override
	public String toString() {
		return "studno="+no+", name="+name+", major="+dept;
	}
}
public class test3 {
	public static void main(String[] args) {
		Student s1 = new Student(1,"ȫ�浿","�濵");
        Student s2 = new Student(1,"ȫ�浿","�İ�");
        if(s1 == s2) {
            System.out.println("s1�� s2�� ���� ��ü�Դϴ�.");
         } else {
            System.out.println("s1�� s2�� �ٸ� ��ü�Դϴ�.");
         }
         if(s1.equals(s2)) {
            System.out.println("s1 �л��� s2 �л��� ���� �л��Դϴ�.");
         } else {
            System.out.println("s1 �л��� s2 �л��� �ٸ� �л��Դϴ�.");
          }
          System.out.println("�л�1:" + s1);
          System.out.println("�л�2:" + s2);
	}
}

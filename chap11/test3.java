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
		Student s1 = new Student(1,"홍길동","경영");
        Student s2 = new Student(1,"홍길동","컴공");
        if(s1 == s2) {
            System.out.println("s1과 s2는 같은 객체입니다.");
         } else {
            System.out.println("s1과 s2는 다른 객체입니다.");
         }
         if(s1.equals(s2)) {
            System.out.println("s1 학생과 s2 학생은 같은 학생입니다.");
         } else {
            System.out.println("s1 학생과 s2 학생은 다른 학생입니다.");
          }
          System.out.println("학생1:" + s1);
          System.out.println("학생2:" + s2);
	}
}

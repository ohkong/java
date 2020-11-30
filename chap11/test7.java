package chap11;

import java.util.Arrays;

class Student2 implements Comparable<Student2>{
    String name;
    int kor,eng,math;
    int sum;
    Student2(String name, int kor, int eng,int math){
    	this.name = name;
    	this.kor = kor;
    	this.eng = eng;
    	this.math = math;
    	sum = kor + eng+ math;
    }
    @Override
    public String toString() {
    	return "ÀÌ¸§:" + name + ", ±¹¾î=" + kor + ", ¿µ¾î=" + eng + ", ¼öÇÐ=" + math + ", ÃÑÁ¡=" + sum;
    }
	@Override
	public int compareTo(Student2 o) {
		return o.sum - sum;
	}

}
public class test7 {
	public static void main(String[] args) {
		Student2[] arr = {
		           new Student2("È«±æµ¿",70,60,70),
		           new Student2("ÀÌ¸ù·æ",55,65,90),
		           new Student2("±è»ñ°«",95,65,80),
		           new Student2("¼ºÃáÇâ",95,95,80)
		        };
		        Arrays.sort(arr);
		        for(Student2 s : arr) System.out.println(s);
	}

}

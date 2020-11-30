package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class Shape implements Comparable<Shape>{
	int x,y;
	Shape(){
		this(0,0);
	}
	Shape(int x,int y){
		this.x=x;
		this.y=y;
	}
	abstract double area();
	abstract double length();
	public String toString() {
		return "x:" +x+ ",y:" + y;
	}
	@Override
	public int compareTo(Shape o) {
		return (int)(area()-o.area());
	}
}
/*
 * Circle 클래스 구현하기
 * Shape 클래스의 하위클래스
 * 멤버 : double 반지름 (r) 
 * 생성자 : 반지름을 입력받아 객체 생성 
 * 		  반지름을 입력받아 객체 생성
 * 넓이 둘레 구하는 메서드 구현
 * 
 * Rectangle 클래스 구현하기
 * Shape 클래스의 하위클래스
 * 멤버 : int 가로 (w) , 세로(h)
 * 생성자 :  가로,세로값을 입력받아 객체 생성
 *	           가로,세로 입력이 없는 경우 1,1로 객체 생성하기
 * 넓이 둘레 구하는 메서드 구현
 */
class Circle extends Shape{
	double r;
	Circle(){
		this(1);
	}
	Circle(double r){
		this.r = r;
	}
	@Override
	double area() {
		return r*r*Math.PI;
	}
	@Override
	double length() {
		return 2*r*Math.PI;
	}
	public String toString() {
		return "("+ super.toString()+") 반지름:"+r+",면적"+area()+",둘레:"+length();
	}
	
}
class Rectangle extends Shape{
	int w, h;
	Rectangle(){
		this(1,1);
	}
	Rectangle(int w, int h){
		this.w=w;
		this.h=h;
	}
	@Override
	double area() {
		return h*w;
	}
	@Override
	double length() {
		return 2*(h+w);
	}
	public String toString() {
		return "("+ super.toString()+") 가로:"+w+" 세로"+h+",면적"+area()+",둘레:"+length();
	}
}
public class ListEx4 {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();
		list.add(new Circle(5));
		list.add(new Rectangle(3,4));
		list.add(new Circle());
		list.add(new Circle(10));
		list.add(new Rectangle());
		for(Shape s: list) {
			System.out.println(s);
		}
		System.out.println("면적이 넓은 순으로 정렬하기");
		Collections.sort(list,Comparator.reverseOrder());
		for(Shape s: list) {
			System.out.println(s);
		}
		System.out.println("둘레역순으로 정렬하기");
		Collections.sort(list,new Comparator<Shape>(){
			@Override
			public int compare(Shape s1,Shape s2) {
				return (int)(s2.length()-s1.length());
			}
		});
		for(Shape s: list) {
			System.out.println(s);
		}
	}
}

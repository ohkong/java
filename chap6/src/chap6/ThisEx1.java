package chap6;
/* 
 * this ����� ����
 * 
 * this() ������ : Ŭ���� ������ �ٸ� ������ ȣ��� ���
 * 				�ݵ�� ù�ٿ� �����ؾ� �Ѵ�.
 * this ��������  : �ڱ� ���� ����.
 * 				�ν��Ͻ������ �����Ҷ� ���
 * 				�ν��Ͻ��޼��忡�� ��밡���� =>�ν��Ͻ� �޼��忡 ���������� �ڵ� ������
 * 				���� �̸��� ���������� ��������� ���н� �����
 * 				
 */
class Car3{
	String color;
	int number;
	int serialNo;
	static int sno;
	Car3(String color, int number){
		System.out.println("Car3(String , int)");
		this.color = color;
		this.number = number;
		serialNo = ++sno;
	}
	Car3(){
		this("white",1111);//�������� ù�ٿ� �����ؾ���.
		System.out.println("Car3()");
	}
	Car3(String color){
		this(color,1111);
		System.out.println("Car3(String)");
	}
	Car3(int number){
		this("white",number);
		System.out.println("Car3(int)");
	}
	Car3(Car3 c){
		this(c.color,c.number);
	}
	public String toString() {
		return serialNo + "���ڵ��� : "+this.color + ","+this.number;
	}
}
public class ThisEx1 {

	public static void main(String[] args) {
		Car3 c1=new Car3("blue",1234); 
		Car3 c2=new Car3();				
		Car3 c3=new Car3("red");		
		Car3 c4=new Car3(1234);			
		Car3 c5=new Car3(c1);
		System.out.println(c1);//1�� �ڵ���:blue,1234
		System.out.println(c2);//2�� �ڵ���:white,1111
		System.out.println(c3);//3�� �ڵ���:red,1111
		System.out.println(c4);//4�� �ڵ���:white,1234
		System.out.println(c5);//5�� �ڵ��� :blue,1234
	}

}

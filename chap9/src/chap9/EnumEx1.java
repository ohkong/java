package chap9;
/*
 * ������ ����
 */
public class EnumEx1 {
	public enum Car{  //enum ����� jdk5���� �߰�
		AVANTE,SONATA,GRANDURE,SM5
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println(car);
		Car[] cars = Car.values();
		for(Car c : cars) {
			System.out.println(c + ":" + c.ordinal());
		}
		//car Object�� ����Ŭ����?
		if(car instanceof Object) {
			System.out.println("car��ü�� Object��ü��");
		}
		
	}
}

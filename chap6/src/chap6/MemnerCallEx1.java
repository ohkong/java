package chap6;

public class MemnerCallEx1 {
	static int cv1 = 10;
	static int cv2 = cv1; //클래스 멤버들간의 접근
	int iv1= 100;  //
	int iv2= iv1;  //인스턴스 멤버간의 접근
	int iv3= cv1;	//인스턴스 멤버에 클래스 멤버 접근
//	static int cv3=iv1;  //클래스 멤버에서 인스턴스 멤버 접근 직접접근 불가
	static int cv3=new MemnerCallEx1().iv1; //일회용 객체 생성
	void method1() { //인스턴스 메서드
		System.out.println("cv1 + cv2 = "+(cv1+cv2));
		System.out.println("iv1 + iv2 = "+(iv1+iv2));
	}
	static void method2() { //클래스 메서드
		System.out.println("cv1 + cv2 = "+(cv1+cv2));
//		System.out.println("iv1 + iv2 = "+(iv1+iv2)); //클래스 멤버에서 인스턴스 멤버 접근 직접접근 불가
		MemnerCallEx1 m = new MemnerCallEx1();
		System.out.println("iv1 + iv2 = "+(m.iv1+m.iv2));
	}
	public static void main(String[] args) {
		//method1();//클래스 멤버에서 인스턴스 멤버 접근 직접접근 불가 //객체화를 시킬지 static을 붙일지 하나 선택
		 new MemnerCallEx1().method1();
		method2();	
	}

}

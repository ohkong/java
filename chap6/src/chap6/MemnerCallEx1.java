package chap6;

public class MemnerCallEx1 {
	static int cv1 = 10;
	static int cv2 = cv1; //Ŭ���� ����鰣�� ����
	int iv1= 100;  //
	int iv2= iv1;  //�ν��Ͻ� ������� ����
	int iv3= cv1;	//�ν��Ͻ� ����� Ŭ���� ��� ����
//	static int cv3=iv1;  //Ŭ���� ������� �ν��Ͻ� ��� ���� �������� �Ұ�
	static int cv3=new MemnerCallEx1().iv1; //��ȸ�� ��ü ����
	void method1() { //�ν��Ͻ� �޼���
		System.out.println("cv1 + cv2 = "+(cv1+cv2));
		System.out.println("iv1 + iv2 = "+(iv1+iv2));
	}
	static void method2() { //Ŭ���� �޼���
		System.out.println("cv1 + cv2 = "+(cv1+cv2));
//		System.out.println("iv1 + iv2 = "+(iv1+iv2)); //Ŭ���� ������� �ν��Ͻ� ��� ���� �������� �Ұ�
		MemnerCallEx1 m = new MemnerCallEx1();
		System.out.println("iv1 + iv2 = "+(m.iv1+m.iv2));
	}
	public static void main(String[] args) {
		//method1();//Ŭ���� ������� �ν��Ͻ� ��� ���� �������� �Ұ� //��üȭ�� ��ų�� static�� ������ �ϳ� ����
		 new MemnerCallEx1().method1();
		method2();	
	}

}

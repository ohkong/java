package chap7;

//instanceOf : ��ü�� ���������� ���踦 �˷���
public class InstanceOfEx1 {

	public static void main(String[] args) {
		Parent3 p = new Child3();
		if(p instanceof Child3) {
			System.out.println("p �������� ��ü�� Child3 ��ü��");
			Child3 c= (Child3)p;
			System.out.println(c.x);
		}
		if(p instanceof Parent3) {
			System.out.println("p �������� ��ü�� Parent3 ��ü��");
		}
		if(p instanceof Object) {
			System.out.println("p �������� ��ü�� Object ��ü��");
			Object o= (Object)p;
			//System.out.println(o.x);
		}
	}

}

package chap9;

/*
 * �̸� ���� ���� Ŭ����
 */
interface I {
	void test();
}

public class InnerEx4 {
	public static void main(String[] args) {
		int iv = 100;
//		iv += 10; 
		System.out.println("iv=" + iv);
		I i = new I() { //�̸����� ����Ŭ����. ���� ����Ŭ���� �̱⶧���� ���ȭ�� �ʿ�.  13���ٶ����� ���� ����̱� ������ 20���ٿ� �����߻�
			@Override
			public void test() {
				//iv���� main�޼����� ���������̰�,
				//��������ũ�������� �����ϱ� ���ؼ��� ���ȭ �Ǿ���Ѵ�.
				System.out.println("iv=" + iv);
			}
		};
		i.test();
		//���ٷ� ����
		i = () -> System.out.println("iv=" + iv);
		i.test();
	}
}
package chap11;
/*
 * Object Ŭ���� : toString() => ��ü�� ���ڿ� ��ȯ
 *  => ������������ ����ϸ� �ڵ����� ȣ��Ǵ� �޼���
 *  => Ŭ������@16�����ؽ��ڵ� ����.
 *  => ��ü�� ������ ����ϱ� ���ؼ��� �������̵� �ʿ�
 */
class ToString {
	int value;
	ToString(int v){
		this.value=v;
	}
	@Override
	public String toString() {
		return "value="+value;
	}
}
public class ToStringEx1 {
	public static void main(String[] args) {
		ToString t1 = new ToString(10);
		ToString t2 = new ToString(20);
		System.out.println(t1);
		System.out.println(t2);
	}
}

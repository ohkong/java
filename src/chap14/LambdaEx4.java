package chap14;
/*
 * �Ű������� �ְ�, ���ϰ��� �ִ� ���
 */
@FunctionalInterface
interface LambdaInterface4{
	int method(int x,int y);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		LambdaInterface4 f = (x,y) -> {
			return x*y;
		};
		System.out.println("�μ��ǰ�:"+f.method(2, 5));
		f=(x,y) ->x+y;
		System.out.println("�μ�����:"+f.method(2, 5));
		f=(x,y) ->x-y;
		System.out.println("�μ�����:"+f.method(2, 5));
		f=(x,y) ->x%y;
		System.out.println("�μ��� ���� ������:"+f.method(2, 5));
		f=(x,y) ->(x>y)?x:y;
		System.out.println("�μ� �� ū��:"+f.method(2, 5));
		f=(x,y) ->(x>y)?y:x;
		System.out.println("�μ� �� ������:"+f.method(2, 5));
		f = (x,y)->sum(x,y);
		System.out.println("�μ��� ��:"+f.method(2, 5));
	}
	private static int sum(int x, int y) {
		return x+y;
	}
}

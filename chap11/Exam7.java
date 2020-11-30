package chap11;
/*
 * ����� �������� �Լ� �����ϱ�
 * double round(�Ǽ���,�Ҽ������� �ڸ���)
 * double truncate(�Ǽ���,�Ҽ������� �ڸ���)
 */
public class Exam7 {
	public static void main(String[] args) {
		System.out.println(round(3.1215,1)); //3.1
		System.out.println(round(3.1215,2)); //3.12
		System.out.println(round(3.1215,3)); //3.122
		System.out.println(round(3.1215,4)); //3.1214
		System.out.println(truncate(3.15345,1)); //3.1
		System.out.println(truncate(3.15345,2)); //3.15
		System.out.println(truncate(3.15345,3)); //3.153
		System.out.println(truncate(3.15345,4)); //3.1534
	}
	static double round(double d,int i) {
		String sf = String.format("%."+i+"f",d); // "%.if" => ���ڿ� ����̶�  i�� "" ������ ���� i�� �������Ѱ�.
		return Double.parseDouble(sf);
	}
	static double truncate(double d,int i) { 
		int num10 =1;
		for(int a= 0;a<i;a++) {
			num10*=10;
		}
		return (int)(d*num10)/(double)num10;
	}
}

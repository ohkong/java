package chap11;
/*
 * 결과가 나오도록 함수 구현하기
 * double round(실수형,소숫점이하 자리수)
 * double truncate(실수형,소숫점이하 자리수)
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
		String sf = String.format("%."+i+"f",d); // "%.if" => 문자열 취급이라  i를 "" 밖으로 빼서 i가 들어가도록한것.
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

package chap11;
/*
 * count �޼��� �����ϱ�
 * int count("���ڿ��ҽ�","ã�¹��ڿ�") : ���ڿ� �ҽ����� ã�� ���ڿ��� 
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","12")); //2	
		System.out.println(count("12345AB12AB345AB","AB"));	//3
		System.out.println(count("12345","6"));//0
	}

	private static int count(String s1, String s2) {
		int cnt=0,index=0;
		while(true) {
			index=s1.indexOf(s2,index);
			if(index<0)break;
			cnt++;
			index++;
		}
		return cnt;
	}
}

package chap11;
/*
 * switch �������� ���ǰ����� ����� �� �ִ� �ڷ��� : 9���� 
 *   byte short int char String
 *   Byte Short Integer Character
 */
public class WrapperEx3 {
	public static void main(String[] args) {
		int data = 65;
		switch(data) {
		default : System.out.println("switch �׽�Ʈ");
		}
	}
}

/*
	java.lang ��Ű���� Ŭ����
	  Object : ��� Ŭ������ �ֻ��� Ŭ����. 
	  String : ���ڿ�. ���Կ����ڷ� ��ü���� ����. +���갡��
	  StringBuffer : ���ڿ��� ����Ŭ����
	  				  ���� ���ڿ� Ŭ����. equals �޼��� �������̵� �ȵ�.
	  				  ����񱳸� ���ؼ��� String���� ��ȯ(toString())�� �ʿ���.
	  Math : ��ġ ����� ���� �޼��带 ����� ����. static �޼�����.
	  		 ��ü ���� �Ұ���.
	  Wrapper : 
	  		Boolean, Byte, Short, Integer, Long, Float, Double, Character
	  		�����Ͽ� ��Ī�ϴ� Ŭ����
	  		Boxing, unBoxing => �ڵ� ����ȯ
	  
*/
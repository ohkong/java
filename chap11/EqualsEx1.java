package chap11;
/*
 * Object Ŭ���� : equals �޼��� ����
 * 	
 * == : ���� ��ü���� ����
 * equals : ���� ���� ���� ����. Object Ŭ���������� equals �޼��嵵 ���� ��ü ���η� ����
 * 			=> ������ Ŭ�������� ���� �񱳸� ���� �������̵��� �ʿ���
 */
class Equal{
	int value;
	Equal(int value){
		this.value = value;
	}
}
public class EqualsEx1 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		if(e1==e2)System.out.println("e1�� e2�� ���� ��ü��");
		else System.out.println("e1�� e2�� �ٸ� ��ü��");
		if(e1.equals(e2))System.out.println("e1�� e2�� ���� ������ ��ü��");
		else System.out.println("e1�� e2�� �ٸ� ������ ��ü��");
		
	}

}

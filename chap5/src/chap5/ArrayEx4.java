package chap5;
/*
 * Command line���� �Ķ���͹ޱ�
 */
public class ArrayEx4 {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("Command ���ο� �Ķ���͸� �Է��ϼ���");
			System.out.println("java chap5.ArrayEx4 ȫ�浿 ���");
			return; //�޼��带 ����
		}
		for(String a: args) { //������ for ���� , index ��� �Ұ�
			System.out.println(a);
		}

	}

}

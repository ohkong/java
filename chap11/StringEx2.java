package chap11;
/*
 * String Ŭ������ �ֿ� �޼���
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		// s ���ڿ����� 4���ε���(5��°)���ڸ� ����
		System.out.println(s.charAt(4)); //E
		//'A' - 'a' = -32����. ���Ľ� ���Ǵ� �޼���
		System.out.println(s.compareTo("abc"));//-32
		// IgnoreCase :  ��ҹ��� �������
		System.out.println(s.compareToIgnoreCase("abcdefgh"));
		//s+"abc" �ǹ�
		System.out.println(s.concat("abc"));
		//s���ڿ��� ���� GH?
		System.out.println(s.endsWith("GH"));//true
		//s���ڿ��� ������ ABC?
		System.out.println(s.startsWith("ABC"));//true
		System.out.println(s.equals("ABCDEFGH"));//true
		System.out.println(s.equalsIgnoreCase("abcdEFGH"));//true
		
		s = new String("This is a String");
		//indexOf(����) : ������ ��ġ �ε����� ����
		System.out.println(s.indexOf('i')); //2
		//indexOf(����,�ε���) : �ε��� ���� ������ ��ġ �ε����� ����
		System.out.println(s.indexOf('i',15)); //-1 ���°��
		//indexOf(���ڿ�) : ������ ��ġ �ε����� ����
		System.out.println(s.indexOf("is"));
		//lastindexOf(���ڿ�) : is ���ڿ� �� �ʺ��� �˻��ϱ�
		System.out.println(s.lastIndexOf("is"));//5
		//length() : ���ڿ��� ����
		System.out.println(s.length());//16
		//replace(�������ڿ�,���湮�ڿ�)
		System.out.println(s.replace("is","QR"));
		//�κй��ڿ� : substring  5���ε��� ������ ���ڿ� ����
		System.out.println(s.substring(5));
		//5���ε������� 13���ε��� �ձ����� ���ڿ� ����
		System.out.println(s.substring(5,13)); //5~12
		//�ҹ��ڷ� ����
		System.out.println(s.toLowerCase());
		//�빮�ڷ� ����
		System.out.println(s.toUpperCase());
		//���� ���� ���� : trim()
		System.out.println("    ���ڿ�  trim�޼���    ".trim());
		System.out.println("    ���ڿ�  trim�޼���    ");
		//���ڿ� �и� : split()
		String[] sarr = "ȫ�浿,�̸���,���".split(",");
		for(String ss : sarr)System.out.println(ss);
		
	}
}

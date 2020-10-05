package chap6;
/*
 * �ʱ�ȭ �� ����
 * 		static �ʱ�ȭ ��
 * 			�ֿ��� : Ŭ���� ���� �ʱ�ȭ
 * 			������� : Ŭ���� ���� �ε�� �ѹ� ����.
 * 		�ν��Ͻ� �ʱ�ȭ ��
 * 			�ֿ��� : �ν��Ͻ� ���� �ʱ�ȭ. �����ڿ� ����� ��ħ.
 * 			������� : ��üȭ�� ������ ȣ������ ���� ����.
 */		
public class InitEx1 {
	static int cv;
	int iv;
	InitEx1(){
		System.out.println("5. ������ȣ���");
	}
	static {
		cv = (int)(Math.random()*100);
		System.out.println("1. static �ʱ�ȭ �� ����. cv= "+cv);
	}
	{
		iv = (int)(Math.random()*100);
		System.out.println("4. �ν��Ͻ� �ʱ�ȭ �� ����. iv= "+iv);
	}
	public static void main(String[] args) {
		System.out.println("2. main �޼��� ����");
		System.out.println("3. main �޼��忡�� init1 ��ü ����");
		InitEx1 init1 = new InitEx1();
		System.out.println("3. main �޼��忡�� init2 ��ü ����");
		InitEx1 init2 = new InitEx1();
		System.out.println(InitEx1.cv);
		System.out.println(init1.iv);
		System.out.println(init2.iv);
		
	}

}

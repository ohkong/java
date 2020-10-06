package chap8;
/*
 * ����Ÿ������ �������̽� ����ϱ�
 */
class LazerZet implements Printerable{
	@Override
	public void print() {
		System.out.println("������ printer���� �����");
	}
}
class InkZet implements Printerable{
	@Override
	public void print() {
		System.out.println("��ũ�� printer���� �����");
	}
}
class PrinterManager{
	public static Printerable getPrinter(String type) {
		if(type.equals("INK"))return new InkZet();
		else return new LazerZet();
	}
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		Printerable a = PrinterManager.getPrinter("INK");
		a.print();
		a = PrinterManager.getPrinter("LAZER");
		a.print();
		LazerZet ink = (LazerZet)PrinterManager.getPrinter("INK");
		ink.print();
	}

}

package chap7;

/*
 * Product Ŭ����
 * 	������� : ����, ����Ʈ
 * 	������ : ������ �Է¹ް�, ������ 10%�� ����Ʈ�� ����
 * 
 * Tv Ŭ����
 * 		������ : ������ 100�����ϱ�
 * 		toString : "Tv" ����
 * Computer Ŭ����
 * 		������ : ������ 200�����ϱ�
 * 		toString : "Computer" ����
 */
class Product {
	int price, point;

	Product(int price) {
		this.price = price;
		this.point = price / 10;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}
/*
 * Buyer Ŭ����
 * 		������� : money=500, point
 * 			Product[] items = new Product[5];
 * 			int cnt;
 * 		��� �޼���
 * 			void buy(Product p)
 * 			1.p ��ǰ�� ������ money���� ����
 * 			2.p ��ǰ�� point�� ���� point�� ����
 * 			3.items�� p ��ǰ�� �߰�. cnt����
 * 			4.p ��ǰ�� ���
 */
class Buyer{
	int money=500,point;
	Product[] items = new Product[5];
	int cnt;
	void buy(Product p) {
		money-=p.price;
		point +=p.point;
		items[cnt++]=p;
		System.out.println(p + "������");
	}
}
public class Exam3 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer cm = new Computer();
		Buyer b = new Buyer();
		b.buy(tv);
		b.buy(cm);
		System.out.println("���� �ܾ�:" + b.money);
		System.out.println("���� ����Ʈ:" + b.point);
		System.out.print("������ ��ǰ:");
		for(int i =0;i<b.cnt;i++) {
			System.out.print(b.items[i]+",");
		}
		System.out.println();
	}

}

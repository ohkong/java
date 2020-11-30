package chap11;
class Card2{
	String kind;
	int num;
	Card2(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	public Card2() {
		kind = "Spade";
		num = 1;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Card2) {
			Card2 c = (Card2)o;
			return kind.equals(c.kind) && num == c.num;
		}else return false;
	}
	@Override
	public String toString() {
		return "(" + kind + "," + num + ")";
	}
}

public class test2 {
	public static void main(String[] args) {
		Card2 c1 = new Card2("Spade",1);
        Card2 c2 = new Card2();
        if(c1==c2) {
             System.out.println("c1�� c2�� ���� ��ü�Դϴ�.");
        } else {
             System.out.println("c1�� c2�� �ٸ� ��ü�Դϴ�.");
        }
        if(c1.equals(c2)) {
             System.out.println("c1�� c2�� ���� ������ ī�� �Դϴ�.");
         } else {
             System.out.println("c1�� c2�� �ٸ� ������ ī�� �Դϴ�.");
         }
         System.out.println("c1 ī�� :" + c1);
         System.out.println("c2 ī�� :" + c2);
	}
}

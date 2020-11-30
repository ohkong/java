package chap11;

class Card {
	String kind;
	int num;
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	@Override
	public int hashCode() {
		return kind.hashCode() + num;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Card) {
			Card c = (Card)o;
			return kind.equals(c.kind) && num == c.num;
		}else return false;
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Card c1 = new Card("Spade", 1);
		Card c2 = new Card("Spade", 1);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println("c1�� ��¥ �ؽ��� :" + System.identityHashCode(c1));
		System.out.println("c2�� ��¥ �ؽ��� :" + System.identityHashCode(c2));
		if (c1.equals(c2))
			System.out.println("���� ī����");
		if (c1 != c2)
			System.out.println("�ٸ� ��ü��");
	}
}

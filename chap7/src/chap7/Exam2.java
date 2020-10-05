package chap7;

/*
 * SutdaCard Ŭ����
 * 		������� : int number,boolean isKwang
 * 		������ : ����Ŭ������ �µ��� ����
 * 		����޼��� : toString�� ����� �µ��� �������̵��ϱ�
 * SutdaDeck Ŭ���� �����ϱ�
 * 		������� : cards : SutdaCard 20���� ������ �迭
 * 		������ : Sutdacard 20���� �����Ͽ�
 * 		�޼��� : toString) �������̵��Ͽ� �ܰ��� ��µǵ��� ����
 * 			   shuffle() : cards 20���� ī�带����
 * 			SutdaCard pick(int index) : index �� �ش��ϴ� ī�� ���� ����
 * 			SutdaCard pick() : ������ ī�� ���� ����
 */
class SutdaCard {
	int number;
	boolean isKwang;

	SutdaCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return number + (isKwang?"k":"");
	}
}

class SutdaDeck{
	SutdaCard[] cards = new SutdaCard[20];
	
	SutdaDeck() {
		for(int i =0;i<cards.length;i++) {
			cards[i] = new SutdaCard((i%10+1),((i==0||i==2||i==7)?true:false));
		}
	}
	
	@Override
	public String toString() {
		String result="";
		for(SutdaCard s : cards)
			result += s + ",";
		return result;
	}
	
	void shuffle() {
		for(int i = 0;i<=1000;i++) {
			int f=(int)(Math.random() * cards.length);
			int t=(int)(Math.random() * cards.length);
			SutdaCard tmp = cards[f];
			cards[f]=cards[t];
			cards[t]=tmp;
		}
	}

	public SutdaCard pick(int i) {
		return cards[i];
	}

	public SutdaCard pick() {
		return cards[(int)(Math.random()*cards.length)];
	}

}

public class Exam2 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
		System.out.println("ù��° ī�� : " + deck.pick(0));
		System.out.println("���� ���� ī�� : " + deck.pick());
	}

}

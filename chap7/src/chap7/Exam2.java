package chap7;

/*
 * SutdaCard 클래스
 * 		멤버변수 : int number,boolean isKwang
 * 		생성자 : 구동클래스에 맞도록 구현
 * 		멤버메서드 : toString을 결과에 맞도록 오버라이딩하기
 * SutdaDeck 클래스 구현하기
 * 		멤버변수 : cards : SutdaCard 20장을 저장할 배열
 * 		생성자 : Sutdacard 20장을 생성하여
 * 		메서드 : toString) 오버라이딩하여 겨과가 출력되도록 구현
 * 			   shuffle() : cards 20장의 카드를섞기
 * 			SutdaCard pick(int index) : index 에 해당하는 카드 한장 리턴
 * 			SutdaCard pick() : 임의의 카드 한장 리턴
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
		System.out.println("첫번째 카드 : " + deck.pick(0));
		System.out.println("랜덤 선택 카드 : " + deck.pick());
	}

}

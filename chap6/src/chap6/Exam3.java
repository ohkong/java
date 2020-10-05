package chap6;
/*
 * 구동 클래스를 실행 했을 때 결과가 출력되도록 SutdaCard클래스 구현하기
 * 멤버 변수는 int number, boolean isKwang 가 있다.
 * [결과]
 * 3
 * 1k
 */
class SutdaCard{
	int number;
	boolean isKwang;
	SutdaCard(int n,boolean i){
		number = n;
		isKwang =i;
	}
	SutdaCard(){
		number = 1;
		isKwang =true;
	}
	public String toString() {
		return number + ((isKwang)?"k":"");
	}
	
}
public class Exam3 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1);  //3
		System.out.println(card2);	//1k
	}

}

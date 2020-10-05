package chap6;
/*
 * Coin Å¬·¡½º¸¦ ÀÌ¿ëÇÏ±â.
 * µÎ°³ÀÇ Coin °´Ã¼¸¦ »ý¼ºÇÏ±â myCoin, youCoin°´Ã¼ »ý¼ºÇÏ±â
 * ¾Õ¸éÀÌ ¿¬¼ÓÇØ¼­ 3¹ø ³ª¿À¸é ½Â¸®. => mycoin½Â¸®,youCoin½Â¸®, ºñ±è.
 */
class Coin2{
	int side;
	void flip() {
		side = (int)(Math.random()*2);
		//System.out.println(side==0?"¾Õ¸é":"µÞ¸é");
	}
}
public class Exam5 {

	public static void main(String[] args) {
		Coin2 myCoin = new Coin2();
		Coin2 youCoin = new Coin2();
		int mycount =0, youcount=0;
		while(true) {
			myCoin.flip();
			youCoin.flip();
			if(myCoin.side==0) {
				System.out.print("¾Õ¸é\t");
				mycount++;
			}else {
				System.out.print("µÞ¸é\t");
				mycount=0;
			}
			if(youCoin.side==0) {
				System.out.print("¾Õ¸é\t");
				youcount++;
			}else {
				System.out.print("µÞ¸é\t");
				youcount=0;
			}
			System.out.println();
			if(mycount==3||youcount==3)break;
		}
		
		if(mycount>youcount) {
			System.out.println("myCoin ½Â¸®");
		}else if(mycount<youcount) {
			System.out.println("youCoin ½Â¸®");
		}else {
			System.out.println("   ºñ±è");
		}
		
	}

}

package chap6;
/*
 * Coin Ŭ������ �̿��ϱ�.
 * �ΰ��� Coin ��ü�� �����ϱ� myCoin, youCoin��ü �����ϱ�
 * �ո��� �����ؼ� 3�� ������ �¸�. => mycoin�¸�,youCoin�¸�, ���.
 */
class Coin2{
	int side;
	void flip() {
		side = (int)(Math.random()*2);
		//System.out.println(side==0?"�ո�":"�޸�");
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
				System.out.print("�ո�\t");
				mycount++;
			}else {
				System.out.print("�޸�\t");
				mycount=0;
			}
			if(youCoin.side==0) {
				System.out.print("�ո�\t");
				youcount++;
			}else {
				System.out.print("�޸�\t");
				youcount=0;
			}
			System.out.println();
			if(mycount==3||youcount==3)break;
		}
		
		if(mycount>youcount) {
			System.out.println("myCoin �¸�");
		}else if(mycount<youcount) {
			System.out.println("youCoin �¸�");
		}else {
			System.out.println("   ���");
		}
		
	}

}

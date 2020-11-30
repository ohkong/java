package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * SutdaCard Ŭ���� �����ϱ�
 * 	��� ���� : int num, boolean isKwang;
 * 	������ : ��������� �η¹޾� ��ü ����
 * 			�Ű������� ���� ��� num=1, isKwang=true�� ��ü ����
 * 	����޼��� : toString() �������̵�
 * 			1k , 1, ,2 
 */
class SutdaCard{
	int num;
	boolean isKwang;
	SutdaCard(int num,boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	SutdaCard(){
		this(1,true);
	}
	public String toString() {
		return num + ((isKwang)?"K":"");
	}
}
/*
 * SutdaDeck Ŭ����
 * 	��� ���� :  List<SutdaCard> cards;
 * 			static Map<String, Integer> jokbo;
 * 	������ : �Ű����� ����
 * 		SutdaCard 20���� cards List ��ü�� ����
 * 		1~10 �� ���ڸ� ���� ī�尡 ���� 2�徿
 * 		���ڰ��� 1,3,8�� ī���� ������ isKwang�� true��.
 * 	�޼��� : SutdaCard pick()
 * 		     ù��° ī�带 �����Ͽ� ����.
 * 		  void shuffle()
 * 		  cards ���� �ִ� ���. Collections.shuffle �޼��� �̿� 
 */
class SutdaDeck {
	List<SutdaCard> cards;
	static Map<String, Integer> jokbo;
	static { //static �ʱ�ȭ �� : static ����� �ʱ�ȭ�� ���
		jokbo = new HashMap<>();
		jokbo.put("KK",4000);
		for(int i=1;i<=10;i++) {
			jokbo.put(""+i+i, 3000+(i*10));
		}
		jokbo.put("12",2060);
		jokbo.put("21",2060);
		jokbo.put("14",2050);
		jokbo.put("41",2050);
		jokbo.put("19",2040);
		jokbo.put("91",2040);
		jokbo.put("110",2030);
		jokbo.put("101",2030);
		jokbo.put("410",2020);
		jokbo.put("104",2020);
		jokbo.put("46",2010);
		jokbo.put("64",2010);
	}
	SutdaDeck(){
		cards = new ArrayList<SutdaCard>();
		for(int i=0;i<20;i++) {
			cards.add(new SutdaCard(i%10+1,(i==0||i==2||i==7)?true:false));
		}
		System.out.println(cards);
	}
	void shuffle() {
		Collections.shuffle(cards); //List ��ü�� ������ �������ִ� �޼���
		System.out.println(cards);
	}
	SutdaCard pick() {
		return cards.remove(0);
	}
}
/*
 * Gamer Ŭ����
 * 	��� ���� : String name
 * 			StudaCard c1,c2
 * 	������ : ����������� �Է¹޾� ��ü ����
 * 	������� : int getScore() : c1,c2 ī���� ���� ����
 * 			c1,c2 ī�尡 jokbo�� �ִ� ��� jokbo���� ����
 * 			jokbo�� ���� ��� (c1.num+c2.num)%10 ����
 * 			toString �������̵�
 * 			�̸��� ī�� 2���� ���ڿ��� ����
 */
class Gamer{
	String name;
	SutdaCard c1,c2;
	Gamer(String name, SutdaCard c1,SutdaCard c2){
		this.name=name;
		this.c1=c1;
		this.c2=c2;
	}
	int getScore() {
		Integer score =0;
		if(c1.isKwang&&c2.isKwang) {
			score=SutdaDeck.jokbo.get("KK");
		}else {
			score=SutdaDeck.jokbo.get(""+c1.num+c2.num);
			if(score==null) {
				score = (c1.num+c2.num)%10;
			}
		}
		return score;
	}
	public String toString() {
		return name + "("+c1+","+c2 + "):"+ getScore();
	}
}
public class Exam5 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		List<Gamer> list = new ArrayList<>();
		list.add(new Gamer("ȫ�浿",deck.pick(),deck.pick()));
		list.add(new Gamer("���",deck.pick(),deck.pick()));
		list.add(new Gamer("�̸���",deck.pick(),deck.pick()));
		for(Gamer g : list) {
			System.out.println(g);
		}
		System.out.println("deck�� ����ī���� ����:"+deck.cards.size());
		//Gamer �� ���� ���� ������ ���� Gamer�� �̸��� ����ϱ�
		// gamer.name + "�¸�"
		Collections.sort(list, new Comparator<Gamer>(){
			@Override
			public int compare(Gamer o1, Gamer o2) {
				return o2.getScore()-o1.getScore();
			}
		});
		if(list.get(0).getScore()==list.get(1).getScore())
			System.out.println("���");
		else
			System.out.println(list.get(0).name + "�¸�!");
	}
}

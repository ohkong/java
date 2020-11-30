package chap15;

import java.util.TreeMap;

/*
 * TreeMap 예제 : key값으로 정렬
 */
public class MapEx2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap();
		scores.put(87,"홍길동");
		scores.put(98,"이몽룡");
		scores.put(75,"임꺽정");
		scores.put(94,"김삿갓");
		scores.put(80,"성춘향");
		scores.put(88,"향단이");
		System.out.println(scores);
		System.out.println("첫번째 key:" +scores.firstKey());
		System.out.println("첫번째 entry:" +scores.firstEntry());
		System.out.println("첫번째 entry key:" +scores.firstEntry().getKey());
		System.out.println("첫번째 entry value:" +scores.firstEntry().getValue());
		System.out.println("마지막 entry:" +scores.lastEntry());
		System.out.println("94점아래 점수: "+scores.lowerEntry(94));
		System.out.println("95점위 점수 :"+scores.higherEntry(95));
		System.out.println("94점아래 점수 94점포함 :"+scores.floorEntry(94));
		System.out.println("94점위 점수 94점포함 :"+scores.ceilingEntry(94));
	}
}

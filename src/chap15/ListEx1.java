package chap15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * List 예제
 * List 인터페이스 : Collection 인터페이스의 하위 ㅇ니터페이스
 * 				   객체들을 저장할때 순서를 유지
 * 구현클래스 : ArrayList , Vector, LinkedList 등이 있다.
 */
public class ListEx1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> list = new Vector<Integer>();
//		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(0);
		list.add(0);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}

		//jdk8.0이후에 같은 자료형인 경우 <>표시로가능
//		List<Integer> list2= new ArrayList();
//		for(int i = 0;i<;i++) {	
//		}
	}
}

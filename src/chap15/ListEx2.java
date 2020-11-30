package chap15;

import java.util.List;
import java.util.Vector;

public class ListEx2 {

	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
//		List<Double> list = new Vector<>();
		list.add(0.3);
		list.add(Math.PI);
		list.addElement(5.0);//Vector의 원래 메서드. add() 와 같은 기능
		for(Double d :list) {
			System.out.println(d);
		}
		double num = 5.0;
		//list 객체에서 num객체의 위치 리턴
		int index = list.indexOf(num);
		if(index<0) {
			System.out.println(num+ "은 list에 없습니다.");
		}else {
			System.out.println(num + "의 위치:"+index);
		}
		num=0.3;
		System.out.println(list.indexOf(num));
		//contains : list의 내부에 num 객체 존재?
		if(list.contains(num)) {
			list.removeElement(num);
			System.out.println(num + "삭제됨");
		}
		list.remove(5.0);
		System.out.println(list);
		System.out.println(list.get(0)+", " + list.size());
	}
}

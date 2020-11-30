package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Data implements Comparable<Data>{
	int value;
	Data(int value){
		this.value=value;
	}
	@Override
	public int compareTo(Data d) {
		return value -d.value;
	}
	@Override
	public String toString() {
		return value+"";
	}
}
public class ListEx3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("9");
		list.add("8");
		list.add("7");
		list.add("6");
		list.add("5");
		list.add("0");
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(0));
		List<Data> list2 = new ArrayList<>();
		list2.add(new Data(10));
		list2.add(new Data(1));
		list2.add(new Data(5));
		list2.add(new Data(3));
		list2.add(new Data(0));
		Collections.sort(list2);
		System.out.println(list2);
	}
}

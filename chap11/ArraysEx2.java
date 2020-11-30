package chap11;

import java.util.Arrays;

class Value implements Comparable<Value>{
	int value;
	Value(int value){
		this.value=value;
	}
	@Override
	public int compareTo(Value o) {
		return value - o.value; //오름차순
		// o.value - value   //내림차순
		}
}
public class ArraysEx2 {
	public static void main(String[] args) {
		Value[] arr= {new Value(100),new Value(10),new Value(50)};
		Arrays.sort(arr);
		for(Value s:arr)System.out.println(s.value);
		String[] arr2 = {"a","b","A","Z","a"};
		Arrays.sort(arr2);
		for(String s:arr2)System.out.println(s);
	}
}

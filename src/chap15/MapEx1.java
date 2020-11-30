package chap15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map 인터페이스 : (Key,객체)쌍으로 객체를 모아서 저장하는 객체
 */
public class MapEx1 {
	public static void main(String[] args) {
		String[] names = { "홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓" };
		int[] nums = { 1234, 4567, 2350, 9670, 3456 };
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println("김삿갓의 전화번호:" + map.get("김삿갓"));
		System.out.println("홍길동의 전화번호:" + map.get("홍길동"));
		System.out.println("성춘향의 전화번호:" + map.get("성춘향"));
		// map key들만 조회
		Set<String> keys = map.keySet(); //키값은 중복불가라 set
		for (String k : keys) {
			System.out.println(k + "=" + map.get(k));
		}
		// map value들만 조회 
		Collection<Integer> values = map.values(); //value는 객체를 모아놓기만해서 Collection을 사용
 		for(Integer v : values) {
			System.out.println(v);
		}
		// map (key,value)쌍인 객체들을 조회
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m);
			System.out.println(m.getKey() + ":" + m.getValue());
		}
		//key가 홍길동인 객체 제거하기
		Integer value = map.remove("홍길동");
		System.out.println(value);
		System.out.println(map);
		System.out.println("map의 요소의 갯수:"+map.size());
	}
}

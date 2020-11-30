package chap15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 1. 대한민국=서울,캐나다=오타와,영국=런던 을 HashMap에 저장하고,
 * 	    화면에서 나라이름을 입력받아 해장나라의 수도를 출력하는 프로그램 구현하기
 * 	   만약 등록된 나라가 아닌 경우 등록된 나라가 아닙니다. 메시지 출력하기
 * 2. 종료 문자가 입력되면 , 현재 등ㄹ록ㄷ뢱ㄴ프로그램 종료하기
 * 3. 등록된 나라가 아닌경우 입력된 나라의 수도를 입력바당 MAP에 등록하기
 */
public class Exam4 {
	public static void main(String[] args) {
		String[] con = { "대한민국", "캐나다", "영국" };
		String[] city = { "서울", "오타와", "런던" };
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < con.length; i++) {
			map.put(con[i], city[i]);
		}

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("나라이름을 입력해 주세요(종료:종료)");
			String nara = sc.next();
			if (nara.equals("종료"))
				break;
			if (map.get(nara) == null) {
				System.out.println("등록된 나라가 아닙니다.");
				System.out.println("수도를 입력하세요");
				String ci = sc.next();
				map.put(nara, ci);
			} else {
				System.out.println(nara + "의 수도는 " + map.get(nara) + "입니다.");
			}
		}
		for(String k : map.keySet()) {
			System.out.println(k + "="+map.get(k));
		}
		for(Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey()+"="+e.getValue());
		}
		System.out.println("프로그램 종료");
	}
}

package chap15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map �������̽� : (Key,��ü)������ ��ü�� ��Ƽ� �����ϴ� ��ü
 */
public class MapEx1 {
	public static void main(String[] args) {
		String[] names = { "ȫ�浿", "���", "�̸���", "�Ӳ���", "���" };
		int[] nums = { 1234, 4567, 2350, 9670, 3456 };
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println("����� ��ȭ��ȣ:" + map.get("���"));
		System.out.println("ȫ�浿�� ��ȭ��ȣ:" + map.get("ȫ�浿"));
		System.out.println("�������� ��ȭ��ȣ:" + map.get("������"));
		// map key�鸸 ��ȸ
		Set<String> keys = map.keySet(); //Ű���� �ߺ��Ұ��� set
		for (String k : keys) {
			System.out.println(k + "=" + map.get(k));
		}
		// map value�鸸 ��ȸ 
		Collection<Integer> values = map.values(); //value�� ��ü�� ��Ƴ��⸸�ؼ� Collection�� ���
 		for(Integer v : values) {
			System.out.println(v);
		}
		// map (key,value)���� ��ü���� ��ȸ
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m);
			System.out.println(m.getKey() + ":" + m.getValue());
		}
		//key�� ȫ�浿�� ��ü �����ϱ�
		Integer value = map.remove("ȫ�浿");
		System.out.println(value);
		System.out.println(map);
		System.out.println("map�� ����� ����:"+map.size());
	}
}

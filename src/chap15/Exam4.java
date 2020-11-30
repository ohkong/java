package chap15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 1. ���ѹα�=����,ĳ����=��Ÿ��,����=���� �� HashMap�� �����ϰ�,
 * 	    ȭ�鿡�� �����̸��� �Է¹޾� ���峪���� ������ ����ϴ� ���α׷� �����ϱ�
 * 	   ���� ��ϵ� ���� �ƴ� ��� ��ϵ� ���� �ƴմϴ�. �޽��� ����ϱ�
 * 2. ���� ���ڰ� �ԷµǸ� , ���� ��Ϥ��p�����α׷� �����ϱ�
 * 3. ��ϵ� ���� �ƴѰ�� �Էµ� ������ ������ �Է¹ٴ� MAP�� ����ϱ�
 */
public class Exam4 {
	public static void main(String[] args) {
		String[] con = { "���ѹα�", "ĳ����", "����" };
		String[] city = { "����", "��Ÿ��", "����" };
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < con.length; i++) {
			map.put(con[i], city[i]);
		}

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�����̸��� �Է��� �ּ���(����:����)");
			String nara = sc.next();
			if (nara.equals("����"))
				break;
			if (map.get(nara) == null) {
				System.out.println("��ϵ� ���� �ƴմϴ�.");
				System.out.println("������ �Է��ϼ���");
				String ci = sc.next();
				map.put(nara, ci);
			} else {
				System.out.println(nara + "�� ������ " + map.get(nara) + "�Դϴ�.");
			}
		}
		for(String k : map.keySet()) {
			System.out.println(k + "="+map.get(k));
		}
		for(Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey()+"="+e.getValue());
		}
		System.out.println("���α׷� ����");
	}
}

package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * ȭ�鿡�� Ȧ������ ���ڸ� �Է¹޾� �Է¹��� ������ ��հ� �߰��� ����ϱ�
 * [���]
 * Ȧ������ ���ڸ� �Է��ϼ���(����:999)
 * 10 40 30 60 30
 * �Էµ������� �� : xxx
 * �߰��� : 30
 */
public class Exam1 {

	public static void main(String[] args) {
		System.out.println("Ȧ������ ���ڸ� �Է��ϼ���(����:999)");
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		double sum = 0;
		while(true) {
		int num = scan.nextInt();
		if(num == 999)break;
		list.add(num);
		sum += num;
		}
		//�Է¹��� �����Ͱ� ¦������ ��� ������ ������ �����ϱ�
		if(list.size()%2==0) {
			list.remove(list.size()-1);//÷�ڸ� �̿��Ͽ� ��ü ����
		}
		System.out.println("�Էµ�����:"+list);
		System.out.println("�ԷƵ������� ��:"+sum);
		//list ��ü�� ������ �����ϱ�
		Collections.sort(list);
		System.out.println("���ĵ� �Է� ������:"+list);
		System.out.println("�Էµ������� �߰���:"+list.get(list.size()/2));
		System.out.println("�Էµ������� ��հ�:"+sum/list.size());
	}

}

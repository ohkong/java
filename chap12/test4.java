package chap12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Ÿ�� ���� ���� ���α׷� �����ϱ�
 * String[] data =  { "�¿�","����","����","ȿ��","����","����","Ƽ�Ĵ�","���","����ī" };
 * List<String> words = new ArrayList<String>();
 * 3�ʿ� �ѹ��� words�� data �� ������ �̸��� �߰��ϱ�.  => ������(DataAddThread)�� �ۼ�.
 * ȭ�鿡 �Էµ� �̸���, 
 * words�� ����� �̸��� ���� ��� words���� �Էµ� �̸��� �����Ѵ�.
 * words�� ��� �����Ͱ� ���� �Ǹ� ���α׷��� �����Ѵ�. 
 *  
[���]
[�¿�]
>>�¿�
[����, ȿ��]
>>����
[ȿ��, Ƽ�Ĵ�, ȿ��]
>>ȿ��
[Ƽ�Ĵ�, ȿ��, ����, ����]
>>Ƽ�Ĵ�
[ȿ��, ����, ����]
>>ȿ��
[����, ����, ����ī]
>>����
[����, ����ī, ȿ��]
>>����
[����ī, ȿ��]
>>����ī
[ȿ��, ����ī]
>>ȿ��
[����ī, ���]
>>����ī
[���]
>>���
[Ƽ�Ĵ�]
>>Ƽ�Ĵ�
���α׷� ����
 */
class DataAddThread extends Thread{
	String[] data =  { "�¿�","����","����","ȿ��","����","����","Ƽ�Ĵ�","���","����ī" };
	List<String> words = new ArrayList<String>();
	public void run() {
		while(true) {
			words.add(data[(int)(Math.random()*data.length)]);
			
		try {
			sleep(3000);
		} catch (InterruptedException e) {}
		if(words.size()<=0)break;
	}
  }
}
public class test4 {
	public static void main(String[] args) {
		DataAddThread t1 = new DataAddThread();
		t1.words.add(t1.data[(int)(Math.random()*t1.data.length)]);
		Scanner scan = new Scanner(System.in);
		t1.start();
		while(t1.words.size()!=0) {
			System.out.println(t1.words);
			System.out.print(">>");
			String name = scan.nextLine();
			t1.words.remove(name);
		}
		System.out.println("���α׷� ����");
	}
}


//public class Test1 {
//	String[] data = { "�¿�", "����", "����", "ȿ��", "����", "����", "Ƽ�Ĵ�", "���", "����ī" };
//	List<String> words = new ArrayList<String>();
//	int interval = 3 * 1000; //3��
//		public static void main(String[] args) {
//			Test1 g = new Test1();
//			g.game();
//			System.out.println("���α׷� ����");
//		}
//		private void game() {
//			Scanner scan = new Scanner(System.in);
//			words.add(data[0]);
//			DataAddThread t1 = new DataAddThread(words,data,interval);
//			t1.setDaemon(true); //���� ������
//			t1.start();
//			while(true) {
//				System.out.println(words);
//				System.out.print(">>");
//				String input = scan.next().trim();
//				words.remove(input);
//				if(words.size()==0)break;
//			}
//		}
//	}
//class DataAddThread extends Thread{
//	List<String> words;
//	String[] data;
//	int interval;
//	public DataAddThread(List<String> words, String[] data, int interval) {
//		this.words = words;
//		this.data=data;
//		this.interval= interval;
//	}
//	@Override
//	public void run() {
//		while(true) {
//			try {
//				sleep(interval);
//			}catch(InterruptedException e) {}
//			words.add(data[(int)(Math.random()*data.length)]);
//		}
//	}
//}
package chap12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 타자 연습 게임 프로그램 구현하기
 * String[] data =  { "태연","유리","윤아","효연","수영","서현","티파니","써니","제시카" };
 * List<String> words = new ArrayList<String>();
 * 3초에 한번씩 words에 data 중 임의의 이름을 추가하기.  => 스레드(DataAddThread)로 작성.
 * 화면에 입력된 이름과, 
 * words에 저장된 이름이 같은 경우 words에서 입력된 이름을 삭제한다.
 * words에 모든 데이터가 삭제 되면 프로그램을 종료한다. 
 *  
[결과]
[태연]
>>태연
[윤아, 효연]
>>윤아
[효연, 티파니, 효연]
>>효연
[티파니, 효연, 유리, 서현]
>>티파니
[효연, 유리, 서현]
>>효연
[유리, 서현, 제시카]
>>유리
[서현, 제시카, 효연]
>>서현
[제시카, 효연]
>>제시카
[효연, 제시카]
>>효연
[제시카, 써니]
>>제시카
[써니]
>>써니
[티파니]
>>티파니
프로그램 종료
 */
class DataAddThread extends Thread{
	String[] data =  { "태연","유리","윤아","효연","수영","서현","티파니","써니","제시카" };
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
		System.out.println("프로그램 종료");
	}
}


//public class Test1 {
//	String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };
//	List<String> words = new ArrayList<String>();
//	int interval = 3 * 1000; //3초
//		public static void main(String[] args) {
//			Test1 g = new Test1();
//			g.game();
//			System.out.println("프로그램 종료");
//		}
//		private void game() {
//			Scanner scan = new Scanner(System.in);
//			words.add(data[0]);
//			DataAddThread t1 = new DataAddThread(words,data,interval);
//			t1.setDaemon(true); //데몬 스레드
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
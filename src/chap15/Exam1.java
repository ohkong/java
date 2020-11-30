package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 화면에서 홀수개의 숫자를 입력받아 입력받은 숫자의 평균과 중간값 출력하기
 * [결과]
 * 홀수개의 숫자를 입력하세요(종료:999)
 * 10 40 30 60 30
 * 입력데이터의 합 : xxx
 * 중간값 : 30
 */
public class Exam1 {

	public static void main(String[] args) {
		System.out.println("홀수개의 숫자를 입력하세요(종료:999)");
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		double sum = 0;
		while(true) {
		int num = scan.nextInt();
		if(num == 999)break;
		list.add(num);
		sum += num;
		}
		//입력받은 데이터가 짝수개인 경우 마지막 데이터 제거하기
		if(list.size()%2==0) {
			list.remove(list.size()-1);//첨자를 이용하여 객체 제거
		}
		System.out.println("입력데이터:"+list);
		System.out.println("입렵데이터의 합:"+sum);
		//list 객체의 내용을 정렬하기
		Collections.sort(list);
		System.out.println("정렬된 입력 데이터:"+list);
		System.out.println("입력데이터의 중간값:"+list.get(list.size()/2));
		System.out.println("입력데이터의 평균값:"+sum/list.size());
	}

}

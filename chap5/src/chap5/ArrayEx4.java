package chap5;
/*
 * Command line에서 파라미터받기
 */
public class ArrayEx4 {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("Command 라인에 파라미터를 입력하세요");
			System.out.println("java chap5.ArrayEx4 홍길동 김삿갓");
			return; //메서드를 종료
		}
		for(String a: args) { //개선된 for 구문 , index 사용 불가
			System.out.println(a);
		}

	}

}

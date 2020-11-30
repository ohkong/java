package chap14;

public class Exam2 {
	public static void main(String[] args) {
		System.out.println("두수(5,2)의 합:"+calc(5,2,(x,y)->x+y)); //7
		System.out.println("두수(5,2)의 곱:"+calc(5,2,(x,y)->x*y)); //10
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("arr 배열의 최대값"+calc(arr,(x,y)->(x>y)?x:y)); //10
		System.out.println("arr 배열의 최소값"+calc(arr,(x,y)->(x<y)?x:y)); //1
	}

	static int calc(int x, int y,LambdaInterface4 f) {
		return f.method(x,y);
	}
	static int calc(int[] arr,LambdaInterface4 f) {
		int result = arr[0];
		for(int i : arr) result = f.method(result,i);
		return result;
	}
}

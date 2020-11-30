package chap11;
/*
 * Object 클래스 : equals 메서드 예제
 * 	
 * == : 같은 객체여부 리턴
 * equals : 같은 내용 여부 리턴. Object 클래스에서는 equals 메서드도 같은 객체 여부로 리턴
 * 			=> 각각의 클래스에서 내용 비교를 위해 오버라이딩이 필요함
 */
class Equal{
	int value;
	Equal(int value){
		this.value = value;
	}
}
public class EqualsEx1 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		if(e1==e2)System.out.println("e1과 e2는 같은 객체임");
		else System.out.println("e1과 e2는 다른 객체임");
		if(e1.equals(e2))System.out.println("e1과 e2는 같은 내용의 객체임");
		else System.out.println("e1과 e2는 다른 내용의 객체임");
		
	}

}

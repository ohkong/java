package chap8;
interface Beta {
}
class Alpha implements Beta {
	String testIt() {
		return "Tested";
	}
}
class Gamma implements Beta {
	String testIt2() {
		return "Gamma";
	}
}
public class Test1 {
	static Beta getIt() {
		return new Alpha();
	}
	public static void main(String[] args) {
		
		Beta b = getIt();
	     System.out.println(((Alpha)b).testIt());
	}

}

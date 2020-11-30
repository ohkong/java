package chap11;

public class test4 {
	public static void main(String[] args) {
		String str = "°¡³ª´Ù";
        System.out.println(format(str, 7, 0));
        System.out.println(format(str, 7, 1));
        System.out.println(format(str, 7, 2));
        System.out.println(format(str, 2, 0));
	}

	private static String format(String str, int len, int align) {
		StringBuffer sb = new StringBuffer();
		
		if(align==0) {
			sb.append(" ");
		}else if (align==1) {
		//	sb.append
		}
		return str;
	}
	
}

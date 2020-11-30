package chap11;

public class test6 {
	public static void main(String[] args) {
		String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
        System.out.println(fillZero(null, 3));
	}

	public static String fillZero(String src, int length) {
		if (src==null) {
			return null;
		}else if (length<0) {
			return "";
			}
			else if(src.length()<length)
				return String.format("%0" + length + "d", Integer.parseInt(src));
			else {
				return String.format("%s",src.substring(0,length));
			}
		
		}
}

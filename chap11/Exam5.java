package chap11;
/*
 * HTML => ȫ�浿
 * css => ���
 * JavaScript => �̸���
 * java => ������
 * jsp => �Ӳ���
 * ������ => �����
 */
public class Exam5 {
	public static void main(String[] args) {
		String s1 = "HTML-CSS-JvaScript-JAVA-JSP-������";
		String s2 = "ȫ�浿, ���, �̸���, ������, �Ӳ���, �����";
		String[] arr1= s1.split("-");
		String[] arr2= s2.split(",");
		for(int i =0;i<arr1.length;i++) {
			System.out.println(arr1[i]+"=>"+arr2[i].trim());
		}
	}
}

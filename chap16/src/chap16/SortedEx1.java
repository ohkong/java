package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Stream Á¤·ÄÇÏ±â
 */
public class SortedEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList
				("È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ","ÀÓ²©Á¤");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("¿ª¼øÀ¸·Î Á¤·ÄÇÏ±â");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}

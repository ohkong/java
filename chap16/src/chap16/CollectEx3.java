package chap16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

/*
 * Collector 예제
 * 
 * Collector<supplier, accmulator, combiner>
 * Collector<String, StringBuilder, String>
 * =>string을 StringBuilder가 모아서 String으로 리턴
 */

public class CollectEx3 {
	public static void main(String[] args) {
		String[] strArr = {"aaa","bbb","ccc"};
		Stream<String> st = Stream.of(strArr);
		String result = st.collect(new ConcatCollector());
		System.out.println(Arrays.deepToString(strArr));
		System.out.println("result="+result);
	}
}
class ConcatCollector implements Collector<String, StringBuilder, String>{
	@Override
	public Supplier<StringBuilder> supplier() {
		System.out.println("supplier");
		return StringBuilder::new; //StringBuilder 객체로 생성
	}

	@Override
	public BiConsumer<StringBuilder, String> accumulator() {
		System.out.println("accumulator");
		return StringBuilder::append;
	}

	@Override
	public BinaryOperator<StringBuilder> combiner() {
		System.out.println("combiner");
		return (sb,sb2)->{
			sb.append(sb2);
			return sb;
		};
	}

	@Override
	public Function<StringBuilder, String> finisher() {
		System.out.println("finisher");
		return sb->sb.toString();
	}

	@Override
	public Set<Characteristics> characteristics() {
		return Collections.emptySet();
	} 
}

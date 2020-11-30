package chap16;

import java.util.function.Function;

public class AndThenEx2 {

	public static void main(String[] args) {
		//funA : Address apply(Member2)
		Function<Member2,Address> funA;
		//funb : String apply(Address)
		Function<Address,String> funB;
		//funAB : String apply(Member2)
		Function<Member2,String> funAB;
		String city;
		funA=(m)->m.getAddress();
		funB=(a)->a.getCity();
		//funA(Member2) -> Address리턴
		//funB(Address) -> String 리턴
		funAB = funA.andThen(funB);
		city=funAB.apply
				(new Member2("홍길동","hong",new Address("한국","서울")));
		System.out.println("거주도시: "+city);
		funAB = funB.compose(funA);
		city=funAB.apply
				(new Member2("김삿갓","kim",new Address("한국","부산")));
	    System.out.println("거주도시: "+city);
	}

}

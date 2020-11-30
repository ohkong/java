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
		//funA(Member2) -> Address����
		//funB(Address) -> String ����
		funAB = funA.andThen(funB);
		city=funAB.apply
				(new Member2("ȫ�浿","hong",new Address("�ѱ�","����")));
		System.out.println("���ֵ���: "+city);
		funAB = funB.compose(funA);
		city=funAB.apply
				(new Member2("���","kim",new Address("�ѱ�","�λ�")));
	    System.out.println("���ֵ���: "+city);
	}

}

package chap16;

import java.util.function.Consumer;

class Member2{
	private String name;
	private String id;
	private Address address;
	public Member2(String name, String id,Address address) {
		this.name=name;
		this.id=id;
		this.address=address;
	}
	public String getName() {return name;}
	public String getId() {return id;}
	public Address getAddress() {return address;}
}
class Address{
	private String country;
	private String city;
	public Address(String country,String city) {
		this.country=country;
		this.city=city;
	}
	public String getCountry() {return country;}
	public String getCity() {return city;}
}

/*
 * AndThen() :  함수적 인터페이스가 가지고 있는 디폴트 메서드
 * 				두개의 함수적 인터페이스를 순차적으로 연결하여 실행함
 * 				첫번째 리턴값을 두번째 매개값으로 제공해 최종 결과를 리턴함.
 * compose() :  함수적 인터페이스가 가지고 있는 디폴트 메서드
 * 				두개의 함수적 인터페이스를 순차적으로 연결하여 실행함
 * 				두번째 함수적객체의 리턴값을 첫번째 매개값으로 제공해 최종 결과를 리턴함
 */
public class AndThenEx1 {
	public static void main(String[] args) {
		Consumer<Member2> conA=(m)->{
			System.out.println("conA:"+m.getName());
		};
		Consumer<Member2> conB=(m)->{
			System.out.println("conB:"+m.getId());
		};
		Consumer<Member2> conAB=conA.andThen(conB);
		conAB.accept(new Member2("홍길동","hongkd",null));
	}
}

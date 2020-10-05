package chap7;

class Food{
	int price,point;
	Food(int price) {
		this.price = price;
		this.point = price / 10;
	}
}
class Fruit extends Food{
	double brix;
	Fruit(int price,double brix){
		super(price);
		this.brix=brix;
	}
}
class Apple extends Fruit{
	Apple(int price,double brix){	
		super(price,brix);
	}
	public String toString() {
		return "?���?";
	}
}
class Peach extends Fruit{
	Peach(int price,double brix){	
		super(price,brix);
	}
	public String toString() {
		return "복숭?��";
	}
}
class Drink extends Food{
	int ml;
	Drink(int price,int ml){
		super(price);
		this.ml=ml;
	}
}
class Cock extends Drink{
	Cock(int price,int ml){	
		super(price,ml);
	}
	public String toString() {
		return "콜라";
	}
}
class Sidar extends Drink{
	Sidar(int price,int ml){	
		super(price,ml);
	}
	public String toString() {
		return "?��?��?��";
	}
}
class Snack extends Food{
	int gram;
	Snack(int price,int gram){
		super(price);
		this.gram=gram;
	}
}
class Biscuit extends Snack{
	Biscuit(int price,int gram){	
		super(price,gram);
	}
	public String toString() {
		return "비스?��";
	}
}
class Cookie extends Snack{
	Cookie(int price,int gram){	
		super(price,gram);
	}
	public String toString() {
		return "쿠키";
	}
}

class Buyer2{
	int money=10000,point;
	Food[] cart = new Food[6];
	int cnt;
	void buy2(Food f) {
		if(money<f.price) {
			System.out.println(f+"구입?�� ?��?���?�? ");
		}
	else {
		money-=f.price;
		point +=f.point;
		cart[cnt++]=f;
		System.out.println(f+"�? "+f.price + "?�� 구입");
	}
	}
	void summary() {
		int fsum=0,dsum=0,ssum=0;
		int fnum=0,dnum=0,snum=0;
		Fruit fn[] = new Fruit[cnt];
		Drink dn[] = new Drink[cnt];
		Snack sn[] = new Snack[cnt];
		for(int i=0;i<cnt;i++) {
			if(cart[i] instanceof Fruit) {
				fn[fnum++]=(Fruit)cart[i];
				fsum += cart[i].price;
			}else if(cart[i] instanceof Drink) {
				dn[dnum++]=(Drink)cart[i];
				dsum += cart[i].price;
			}else if(cart[i] instanceof Snack) {
				sn[snum++]=(Snack)cart[i];
				ssum += cart[i].price;
			}
		}
		int totsum=fsum+dsum+ssum;
		System.out.println("�? 구매금액:" + totsum);
		System.out.print("?��?�� 구매 목록 :");
		for(int i=0;i<cnt;i++) {
			System.out.print(cart[i]+",");
		}
		System.out.println();
        System.out.print("과일 구매금액:" + fsum + " ");
        System.out.print("구매 목록:");
        for (int i = 0; i < fnum; i++) {
            System.out.print(fn[i] + " ");
        }
        System.out.println();
        System.out.print("?���? 구매금액:" + dsum + " ");
        System.out.print("구매 목록:");
        for (int i = 0; i < dnum; i++) {
            System.out.print(dn[i] + " ");
        }
        System.out.println();
        System.out.print("과자 구매금액:" + ssum + " ");
        System.out.print("구매 목록:");
        for (int i = 0; i < snum; i++) {
            System.out.print(sn[i] + " ");
        }
        System.out.println();
	}
}
public class test1 {

	public static void main(String[] args) {
		Apple apple = new Apple(1000,10.5);//�?�?, ?��?��(brix)

	       System.out.println("?���? �?�?:" + apple.price);

	System.out.println("?���? ?��?��:" + apple.brix);

	Peach peach = new Peach(1000,13.5);//�?�?, ?��?��(brix)

	Cock cock = new Cock(500,500); //�?�?, ?��?��(ml)

	Sidar sidar = new Sidar(1500,1000);//�?�?, ?��?��(ml)

	Biscuit bis = new Biscuit(10000,500);//�?�?, 무게(gram)

	Cookie cookie = new Cookie(500,5000);//�?�?, 무게(gram)

	Buyer2 b = new Buyer2();

	b.buy2(apple); b.buy2(peach);

	b.buy2(cock); b.buy2(sidar);

	b.buy2(bis); b.buy2(cookie);

	System.out.println("고객 ?��?��:" + b.money);

	System.out.println("고객 ?��?��?��:" + b.point);

	b.summary();

	}

}

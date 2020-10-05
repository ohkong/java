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
		return "?Ç¨Í≥?";
	}
}
class Peach extends Fruit{
	Peach(int price,double brix){	
		super(price,brix);
	}
	public String toString() {
		return "Î≥µÏà≠?ïÑ";
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
		return "ÏΩúÎùº";
	}
}
class Sidar extends Drink{
	Sidar(int price,int ml){	
		super(price,ml);
	}
	public String toString() {
		return "?Ç¨?ù¥?ã§";
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
		return "ÎπÑÏä§?Ç∑";
	}
}
class Cookie extends Snack{
	Cookie(int price,int gram){	
		super(price,gram);
	}
	public String toString() {
		return "Ïø†ÌÇ§";
	}
}

class Buyer2{
	int money=10000,point;
	Food[] cart = new Food[6];
	int cnt;
	void buy2(Food f) {
		if(money<f.price) {
			System.out.println(f+"Íµ¨ÏûÖ?ãú ?ûî?ï°Î∂?Ï°? ");
		}
	else {
		money-=f.price;
		point +=f.point;
		cart[cnt++]=f;
		System.out.println(f+"Î•? "+f.price + "?óê Íµ¨ÏûÖ");
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
		System.out.println("Ï¥? Íµ¨Îß§Í∏àÏï°:" + totsum);
		System.out.print("?ãù?íà Íµ¨Îß§ Î™©Î°ù :");
		for(int i=0;i<cnt;i++) {
			System.out.print(cart[i]+",");
		}
		System.out.println();
        System.out.print("Í≥ºÏùº Íµ¨Îß§Í∏àÏï°:" + fsum + " ");
        System.out.print("Íµ¨Îß§ Î™©Î°ù:");
        for (int i = 0; i < fnum; i++) {
            System.out.print(fn[i] + " ");
        }
        System.out.println();
        System.out.print("?ùåÎ£? Íµ¨Îß§Í∏àÏï°:" + dsum + " ");
        System.out.print("Íµ¨Îß§ Î™©Î°ù:");
        for (int i = 0; i < dnum; i++) {
            System.out.print(dn[i] + " ");
        }
        System.out.println();
        System.out.print("Í≥ºÏûê Íµ¨Îß§Í∏àÏï°:" + ssum + " ");
        System.out.print("Íµ¨Îß§ Î™©Î°ù:");
        for (int i = 0; i < snum; i++) {
            System.out.print(sn[i] + " ");
        }
        System.out.println();
	}
}
public class test1 {

	public static void main(String[] args) {
		Apple apple = new Apple(1000,10.5);//Í∞?Í≤?, ?ãπ?èÑ(brix)

	       System.out.println("?Ç¨Í≥? Í∞?Í≤?:" + apple.price);

	System.out.println("?Ç¨Í≥? ?ãπ?èÑ:" + apple.brix);

	Peach peach = new Peach(1000,13.5);//Í∞?Í≤?, ?ãπ?èÑ(brix)

	Cock cock = new Cock(500,500); //Í∞?Í≤?, ?ö©?üâ(ml)

	Sidar sidar = new Sidar(1500,1000);//Í∞?Í≤?, ?ö©?üâ(ml)

	Biscuit bis = new Biscuit(10000,500);//Í∞?Í≤?, Î¨¥Í≤å(gram)

	Cookie cookie = new Cookie(500,5000);//Í∞?Í≤?, Î¨¥Í≤å(gram)

	Buyer2 b = new Buyer2();

	b.buy2(apple); b.buy2(peach);

	b.buy2(cock); b.buy2(sidar);

	b.buy2(bis); b.buy2(cookie);

	System.out.println("Í≥†Í∞ù ?ûî?ï°:" + b.money);

	System.out.println("Í≥†Í∞ù ?è¨?ù∏?ä∏:" + b.point);

	b.summary();

	}

}

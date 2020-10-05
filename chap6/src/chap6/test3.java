package chap6;

class Animal2 {
	String name;
	int age;

	Animal2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Animal2(String name) {
		this(name,1);
	}
	Animal2(int age) {
		this("사람",age);
	}
	void info() {
		System.out.println(name + ":"+age+"살");
	}
}

class Circle {
	double r;
	int x, y, no;
	static int count;

	double area() {
		return r * r * Math.PI;
	}

	double length() {
		return 2 * r * Math.PI;
	}

	void move(int a, int b) {
		a = a + x;
		b = b + y;
	}

	void scale(double m) {
		r = r * m;
	}

	Circle(double r, int x, int y) {
		this.r = r;
		this.x = x;
		this.y = y;
		no = ++count;
	}

	Circle(int x, int y) {
		this(1, x, y);
	}

	Circle(double r) {
		this(r, 1, 1);
	}

	public String toString() {
		return no + "번원 : 반지름 : " + r + " 좌표 : (" + x + "," + y + "), 넓이 : " + area() + ", 둘레" + length();
	}
}

public class test3 {

	public static void main(String[] args) {
		// 1번
//		Animal2 a1 = new Animal2("원숭이", 26);
//		Animal2 a2 = new Animal2("사자");
//		Animal2 a3 = new Animal2(100);
//		a1.info();
//		a2.info();
//		a3.info();

		// 2번
//		Circle[] carr = new Circle[3];
//		carr[0] = new Circle(10, 10, 10);   //rxy
//		carr[1] = new Circle(20, 20); 		//1xy
//		carr[2] = new Circle(100); 			//r11
//		for (Circle c : carr) {
//			System.out.println(c);
//			c.move(10, 10);
//			System.out.println(c);
//			c.scale(3);
//			System.out.println(c);
//		}

		// 3번
		int arr[] = {50,7,5,8,1,33,16,2,28,25,29,17,44,15,13,9,31}; 
		int count=0;
		int arr2[][]=new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			boolean change = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					change = true;
				}
			}
			if (!change)
				break;
		}
		for(int i = 0;i<=arr2.length/2;i++) {
			for(int j=i;j<arr2.length-i;j++) {
			arr2[i][j]=arr[count++];
			}
		}
		for(int i=arr2.length/2+1;i<arr2.length;i++) {
			for(int j=arr2.length-i-1;j<=i;j++) {
				arr2[i][j]=arr[count++];
			}
		}
		for(int i =0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				if(arr2[i][j]==0) {
					System.out.print("   ");
				}else {
				System.out.printf("%3d",arr2[i][j]);
			}
				
		}
			System.out.println();
		}
		
	}

}

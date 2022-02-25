package chap03.book.exercise;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------------");
		x++; //10
		++x; //12
		System.out.println("x =" + x); //12
		
		System.out.println("----------------------");
		y--; //10
		--y; // 8
		System.out.println("y =" + y); //8
		
		System.out.println("----------------------");
		z = x++; 
		System.out.println("z = " + z);  //12
		System.out.println("x = " + x);  //13
		
		System.out.println("--------------------------");
		z= ++x;
		System.out.println("z = "+ z); //14
		System.out.println("x = " + x);  //14
		
		System.out.println("-------------------------");
		z = ++x + y++;
		System.out.println("z=" + z); // 14 +1 + 8 =23 // 증감연산자가 산술연산자보다 우선순위가 빠르다.
		System.out.println("x=" + x); // 15
		System.out.println("y=" + y); // 9
	}
}

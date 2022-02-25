package chap03.lecture.binary;

public class C02Arithmetic {
	public static void main(String[] args) {
		//정수 연산시 주의해야할 점
		int n1 = 2000000000;
		int n2 = 1000000000;
		System.out.println(n1+n2); // int의 범위를 넘어가는지 주의해서 계산해야함
								//-1294967296 overflow
		
		int n3 = -2000000000;
		int n4 = -1000000000;
		System.out.println(n3+n4);  // 1294967296  underflow
		
		long n5 = 2000000000;
		long n6 = 1000000000;
		System.out.println(n5+n6);
		
		long n7 = -2000000000;
		long n8 = -1000000000;
		System.out.println(n7+n8);

	}
}

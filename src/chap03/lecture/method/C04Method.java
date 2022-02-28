package chap03.lecture.method;

public class C04Method {
	public static void main(String[] args) {
//		myMethod01(); // x
//		myMethod01(3); // x
		myMethod01(3, 5);
		myMethod01(33, 55);
		myMethod01('가', 33);
		
		myMethod02(999, 888);
		
		
	}
	
	public static void myMethod01(int i, int j) {
		System.out.println(i);
		System.out.println(j);
	}
	
	
	// 파라미터 명 : lowerCamelCase
	public static void myMethod02(int age, int height) {
		System.out.println(age *2);
		System.out.println(height * 2);
	}
	
	public static void myMethod03(int i, boolean b, long l, double, d) {
		System.out.println(i);
	}
}

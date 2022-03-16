package chap07.lecture.p05promotion;

public class App02 {
	public static void main(String[] args) {
		SuperClass1 o1 = new SubClass1();
		
		SuperClass1 o3 = new SuperClass1();
		method1(o3); // 자동타입변환
		
		SubClass1 o2 = new SubClass1();
		method1(o2);
		
		method1(new SubClass1()); // 자동타입변환
	}
	
	public static void method1(SuperClass1 param) {
		
	}
}

package chap06.lecture.p05static;

public class MyClass02 {
	
	// 인스턴스 멤버 끼리 접근 가능
	int field1;
	void method1() {
		System.out.println(field1);
		method2(); // 다른 인스턴스 메소드 호출 가능
	}
	
	void method2() {
		// 인스턴스 멤에서 클래스 멤버에 접근 가능(클래스 멤버의 것을 사용 가능)
		System.out.println(field2);
		method3();
	}
	
	
	
	//클래스 멤버 끼리 접근 가능
	static int field2;
	static void method3() {
		System.out.println(field2);
	}
	static void method4() {
		// 클래스 멤버에서 인스턴스 멤버로 접근 불가능
//		System.out.println(field1); 에러 발생
	}
}

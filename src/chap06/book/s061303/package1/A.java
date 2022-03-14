package chap06.book.s061303.package1;

public class A {
	// 필드
	
	// 인스턴스 변수 생성
	public int field1; // 모두 접근가능
	int field2; // 같은 패키지만 접근 가능
	private int field3; // 같은 클래스만 접근 가능
	
	// 인스턴스 메소드 생성
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	//생성자
	public A() {
		// 멤버변수 초기화
		field1 = 1; // ok
		field2 = 1; // ok, 같은 패키지
		field3 = 1; // ok, 같은 클래스
		
		//멤버 메소드 호출
		method1();  // ok
		method2(); // ok, 같은 패키지
		method3(); // ok, 같은 클래스
	}
}

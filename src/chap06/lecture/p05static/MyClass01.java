package chap06.lecture.p05static;

public class MyClass01 {
	int age;   // 인스턴스 변수 = 인스턴스 필드
	
	void method01() {   // 인스턴스 메소드
	}
	
	//위 2개를 사용하려면 객체=인스턴스가 존재해야 함.
	MyClass01(){};
	
	
	///////////////////////////////////
	// 클래스 멤버
	// static : 클래스의 멤버로 정의함.
	static int height; // 클래스 필드 = 클래스 변수 = static 필드 = static 변수
	static void method02() { // 클래스 메소드 = static 메소드
		
	}
}

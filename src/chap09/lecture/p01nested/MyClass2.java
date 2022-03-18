package chap09.lecture.p01nested;

public class MyClass2 {
	// 특징 1. static 멤버에서 instance멤버에 접근할 수 없다.
	
	// static중첩클래스
	static class NestedClass1{
		//필드
		int field1; // 인스턴스 필드 작성 가능
		static int field2; // static필드 작성 가능
		
		//메소드
		void method1() { // 인스턴스 메소드 작성가능
		}
		
		static void method2() { // static메소드 작성 가능
		}
		
	}
	
	// 인스턴스 중첩 클래스
	class NestedClass2{
		// 필드
		int field1; //  인스턴스 필드 작성 가능
//		static field2; // static 필드 작성 불가
		static final int FIELD3 = 3; // 상수는 작성 가능
		
		
		// 메소드
		void method1() {  // 인스턴스 메소드 작성 가능
		}
	
//		static void method2() {  // static method 가질 수 없음
//		}
		
	}
}

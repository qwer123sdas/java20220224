package chap09.lecture.p01nested;

public class MyClass5 {
	void method1() {
		class  LocalClass1{
			// 인스턴스 멤버는 되지만, static 멤버는 사용 불가
			
			int field1; // 인스턴스 메소드 ok
//			static int field2; static 필드 xxxx
			
			void method1() { } // 인스턴스 메소드 ok
//			static void method2() {} // static 메소드 xx
		}
	}
}

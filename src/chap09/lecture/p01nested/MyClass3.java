package chap09.lecture.p01nested;

public class MyClass3 {
	// static 멤버에서는 인스턴스 멤버에 접근 할 수 없다.
	
	
	int field33 = 1;
	
	// static 중첩 클래스
	static class NestedClass1{
		void method(field3) {
			
		}
		
	}
	
	// 인스턴스 중첩 클래스
	class NestedClass2{
		
	}
	
	
	// 인스턴스 메소드
	 void method1() {
//		 MyClass3.NestedClass1 o1 = new MyClass3.NestedClass1();
		 NestedClass1 o1 = new NestedClass1(); // static ok
		 NestedClass2 o2 = new NestedClass2(); // instance ok
		 
	 }
	 
	 static void method2() {
		 NestedClass1 o1 = new NestedClass1(); // static ok
//		 NestedClass2 o2 = new NestedClass2(); // instance xxxx
	 }
	 
	 
	 // 인스턴스 필드
	 NestedClass1 field1 = new NestedClass1();
	 NestedClass2 field2 = new NestedClass2();
	 
	 // static 필드
	 static NestedClass1 field3 = new NestedClass1();
//	 static NestedClass2 field4 = new NestedClass2();
	 
	 
	 
}

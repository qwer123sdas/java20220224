package chap09.book.p090202;

public class A {

	// 인스턴스 멤버 클래스
	class B{
		B(){ }
		int field1;
//		static int field2; // 클래스 멤버 불가능
		void method1() { }
//		static void method2() {} // 클래스 멤버 불가능
		
	}
	
	// 정적멤버 클래스
	static class C{
		C(){ }
		int  field1;
		static int field2;
		void method1() { }
		static void method2(){ }
	}
	
	
//	public static void main(String[] args) {
//		A a = new A();
//		A.B b = a.new B();
//		b.field1 = 3;
//		b.method1();
//		
//		A.C c = new A.C();
//		c.field1 = 1;
//		c.method1();
//		A.C.field2 = 2; // 정적 필드 사용
//		A.C.method2(); // 정적 메소드 사용
//		
//	}
	
	//로컬 클래스
	void method() {
		class D{
			D(){}
			int field1;
//			static int field2;
			void method1() {};
//			static void method2();
		}
		// 메서드 내에서 객체를 생성하고 사용가능
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
}

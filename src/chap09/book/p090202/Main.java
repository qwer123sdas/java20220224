package chap09.book.p090202;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		// 인스턴스 중첩 클래스 객체 사용
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		
		// static 중첩 클래스 객체 사용
		A.C c = new A.C();
		c.field1 = 1;
		c.method1();
		A.C.field2 = 2; // 정적 필드 사용
		A.C.method2(); // 정적 메소드 사용
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}

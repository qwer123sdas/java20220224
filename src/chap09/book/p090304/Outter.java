package chap09.book.p090304;

public class Outter {
	String field = "outter-field";
	void method() {
		System.out.println("outter method");
	}
	
	class Nested{
		String field = "nested field";
		void method() {
			System.out.println("nested field");
		}
		void print() {
			//중첩 객체 참조
			// this는 중첩클래스를 가리킴.
			System.out.println(this.field);
			this.method();
			// 바깥 객체 참조
			// 바깥메소드명.this는 바깥 클래스의 멤버를 가리킴.
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}

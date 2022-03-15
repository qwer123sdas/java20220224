package chap07.book.s070601.package1;

public class B {
	public void method() {
		// 같은 패키지니까, protected여도 가능
		A a = new A();
		a.field = "value";
		a.method();
	}
}

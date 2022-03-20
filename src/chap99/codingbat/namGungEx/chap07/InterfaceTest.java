package chap99.codingbat.namGungEx.chap07;

class A{
	 public void method(B b) {
		 b.method();
	 }
}

class B{
	public void method() {
		System.out.println("b클래스의 메서드");
	}
}

class C{
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}
public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.method(new B());
	}
}

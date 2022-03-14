package chap06.book.s061302.package1;

public class A {
	//생성자
	public A(boolean b) {}  // 모두 접근 가능
	A(int b){}               // 같은 패키지에서만 접근 가능
	private A(String s) {}   // 같은 클래스 에서만 접근 가능
	
	//필드, 생성자 호출
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
}

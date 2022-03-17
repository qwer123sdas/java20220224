package chap08.lecture.p01interface;

public class App02 {
	public static void main(String[] args) {
		MyInterface4.method1();// 인터페이스명으로 스태틱 메소드 사용가능. 왜냐하면 클래스멤버라서. 인스턴스멤버는 객체를 만들고 선언했어야함.
		MyInterface4.method2();
	}
}

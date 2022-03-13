package chap06.lecture.p05static;

public class App01 {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		o1.age =3;
		o1.method01();
		
		MyClass01 o2 = new MyClass01();
		o2.age =3;
		o2.method01();
		
		// 클래스 멤버
		// 클래스 명으로 클래스 멤버에 접근 가능
		MyClass01.height = 100;  // 클래스 변수 초기화
//		MyClass01.age = 100; 불가능
		MyClass01.method02(); // 클래스 메소드 호출
//		MyClass01.method01(); // 불가능
		
	}
}

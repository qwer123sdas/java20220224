package chap09.lecture.p02anonymous;

public class App04 {
	public static void main(String[] args) {
		MyInterface2 o1 = new MyInterface2() {
			
			@Override
			public void method2() {
				System.out.println("인터페이스2 메소드 1 재정의 한 것");
			}
			
			@Override
			public void method1() {
				System.out.println("인터페이스2 메소드 2 재정의 한 것");
			}
		};
		
		o1.method1();
		o1.method2();
	}
}

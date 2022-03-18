package chap09.lecture.p02anonymous;

public class App05 {
	public static void main(String[] args) {
		MyAbstracClass1 o1 = new MyAbstracClass1() {
			@Override
			public void method1() {
				System.out.println("퍼블릭 메소드 재정의");
			}
			@Override
			protected void method2() {
				System.out.println("프로텍티드 메소드 재정의");
			}
			@Override
			void method3() {
				System.out.println("디폴트 메소드 재정의");
			}
			
			
		};
		
		o1.method1();
		o1.method2();
		o1.method3();
		
	}
}

package chap09.lecture.p02anonymous;

public class App02 {
	public static void main(String[] args) {
		// 메인 메소드 안에 잇는 지역 클래스
		class MyLocalClass1 implements MyInterface1{
			@Override
			public void method1() {
				System.out.println("마이로컬클래스1에서 재정의 메소드1 필요");
			}
			
		}
		
		MyInterface1 o1 = new MyLocalClass1();
		o1.method1();
	}
}

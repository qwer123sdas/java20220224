package chap08.lecture.p01interface;

public interface MyInterface4 {
	// static 메소드
	// 모두 public임
	// static메소드는 인스턴스를 생성하지 않아도 쓸 수 있기 때문이다.
	static void method1() {
		System.out.println("스태틱메소드1");
	}
	
	public static void method2() {
		System.out.println("스태틱 메소드2");
	}
	
}

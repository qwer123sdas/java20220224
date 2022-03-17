package chap08.book.s080701;

public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("마이 인터페이스 - 메소드2 실행");
	}
}

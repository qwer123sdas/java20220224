package chap08.book.s080601;

public class ImplementationC implements InterfaceC{

	@Override
	public void methoddA() {
		System.out.println("인터페이스C - 메소드ㅁA()실행");
	}

	@Override
	public void methodB() {
		System.out.println("인터페이스C - 메소드B() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("인터페이스C - 메소드C() 실행");
	}
	
}

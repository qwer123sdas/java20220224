package chap07.lecture.p01inheritance;

public class SubClass3 extends SuperClass3 {
	

	
	public SubClass3() {
//		super(); 
		super("param"); // 상위 클래스의 기본 생성자가 없으면, 파라미터가 있는 생성자를 명시적으로 호출해야 한다. 
		System.out.println("subclass 3 no - args constructor");
	}
	
	public SubClass3(int i) {
//		super();
		super("ppp");
		System.out.println("subclass 3 int-param constructor");
	}
}

package chap06.book.s061303.package1;

public class B {
	// 생성자
	public B() {
		//A클래스의 생성자 호출
		A a = new A();
		
		a.field1 = 1; // ok
		a.field2 = 1; // ok
//		a.field3 = 1; // 에러, private이므로 다른 패키지 + 다른 클래스 접근 불가능
		
		a.method1(); // ok
		a.method2(); // ok
//		a.method3(); // 에러, private이므로 다른 패키지 + 다른 클래스 접근 불가능
	}
}

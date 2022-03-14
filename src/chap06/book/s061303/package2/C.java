package chap06.book.s061303.package2;

import chap06.book.s061303.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 =1 ; // ok
//		a.field2 = 1; // 에러, default이므로 다른 패키지 접근 불가능
//		a.field3 = 1; // 에러, private이므로 다른 패키지 + 다른 클래스 접근 불가능
		
		a.method1(); // ok
//		a.method2(); // 에러, default이므로 다른 패키지 접근 불가능
//		a.method3(); // 에러, private이므로 다른 패키지 + 다른 클래스 접근 불가능
	}
}

package chap07.book.s070601.package2;

import chap07.book.s070601.package1.A;

public class C {
	public void method() {
		// 다 안됨. 왜냐하면 protected이므로, 같은 패키지이거나 자손클래스여야만 가능하기 때문
		A a = new A();
		a.field = "value";
		a.method();
	}
}

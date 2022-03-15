package chap07.book.s070601.package2;

import chap07.book.s070601.package1.A;

public class D extends A{

	
	public void method() {
		super.field = "value";
		super.method();
	}
	
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}

package chap07.lecture.p03protected.package2;

import chap07.lecture.p03protected.package1.SuperClass1;

public class SubClass1 extends SuperClass1 {
	public void subMethod() {
		super.publicMethod();
		super.protectedMethod();
//		super.defaultMethod();
	}

}

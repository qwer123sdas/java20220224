package chap99.codingbat.namGungEx.chap12;

class Parent{
	void parentMethod() {}
}

class Child extends Parent{
	@Override
	@Deprecated
	void parentMethod() {}
}

@FunctionalInterface
interface Testable{
	void test();
	//void check();//
}


public class Ex12_7 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod(); // deprecated한 메서드
	}
}

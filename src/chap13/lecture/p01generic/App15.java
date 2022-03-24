package chap13.lecture.p01generic;

import chap08.lecture.p01interface.example_class.*t;

public class App15 {
	public static void main(String[] args) {
		MyClass15 o1 =new MyClass15();
		o1.<String>method1("java");
		o1.method1("java");   // String 
		o1.method1(3);       // integer
		
		o1.<String, Integer>method2("java", 2);
		o1.method2("java", 3);
		o1.method2("java",3);
		
		o1.method4(new Cat());
		
		o1.method4(new Chihuahua());
		
//		o1.method4("java"); // String은 pet의 하위타입이 아니므로 xx
		
		
		
	}
	
	
}

class MyClass15{
	public <T> void method1(T param) {
		
	}
	
	public <T, U> void method2(T param, U param2) {
		
	}
	
	public <T,U> U method3(T param) {
		return null;
	}
	
	public <T extends Pet> void method4(T param) {
		
	}
}

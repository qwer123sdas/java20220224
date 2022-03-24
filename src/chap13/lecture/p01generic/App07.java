package chap13.lecture.p01generic;

public class App07 {
	public static void main(String[] args) {
		
	}
}

interface MyInterface7<T>{
	public void method(T param);
}

// generic type 상속(또는 구현)시 하위 클래스도 generic type
class MyClass1<T> implements MyInterface7<T>{
	@Override
	public void method(T param) {
		
	}
}


// 하위 클래스에 type parameter를 추가 가능(멀티 파라미터)
class MyClass2<T, U> implements MyInterface7<T>{
	private U field1;
	private T field2;
	
	@Override
	public void method(T param) {
		
	}
}

//결정된 상위 타입을 구현(또는 상속)하면 하위클래스에 generic type작성 안해도 됨. 
class MyClass3 implements MyInterface7<String>{ 
	@Override
	public void method(String param) {
		
	}
}
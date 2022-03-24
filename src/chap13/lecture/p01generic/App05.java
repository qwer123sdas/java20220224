package chap13.lecture.p01generic;

import chap08.lecture.p01interface.example_class.Cat;
import chap08.lecture.p01interface.example_class.Chihuahua;
import chap08.lecture.p01interface.example_class.Pet;

public class App05 {
	public static void main(String[] args) {
		Contatiner5<Chihuahua> o1 = new Contatiner5<>();
		o1.method(new Chihuahua());
		
		Contatiner5<Cat> o2 = new Contatiner5<>();
		o2.method(new Cat());
		
		
	}
}

// 제한된 타입 파라미터(bounded type parameter)
// T에 어떤 타입만 받고 싶다고 명시할 수 있음

class Contatiner5<T extends Pet>{
	public void method(T param) {
		param.toString(); // object타입의 메소드만 사용가능
		
		param.roll(); // 특정 클래스의 하위 메서드를 사용하고 싶으면<T extends 클래스명>
		
	}
}

package chap10.lecture.p01exception;

import chap08.lecture.p01interface.example_class.*;

public class App04 {
	public static void main(String[] args) {
		// ClassCastException
		Animal animal = new Cat();
		
		// 같은 상속끼리 인스턴스를 형성하는 것이 아니라서 생기는 에러
		Chihuahua chihuahua = (Chihuahua)animal; // exception 발생
		
	}
}

package chap13.lecture.p01generic;

import chap07.lecture.p07abstract.Chihuahua;
import chap08.lecture.p01interface.example_class.Animal;

public class App04 {
	public static void main(String[] args) {
		Container4<String> o1 = new Container4<String>();
		Container4<Integer> o2= new Container4<Integer>();
		Container4<Animal> o3 = new Container4<Animal>();
		
//		Container4<int> o4 = new Container4<int>(); // 기본타입은 type parameter로 사용 불가능
		// 참조타입만 가능하다. 따라서 8개의 wrapper class를 이용해야 한다.
		//(auto boxing, unboxing)이용
		
		// type parameter 생략가능 = diamond
		Container4<Chihuahua> o4 = new Container4<>();
		Container4<Integer> ii2= new Container4<>();
		
		
		
	}
}

class Container4<T>{
	public void method(T param) {
		
	}
}

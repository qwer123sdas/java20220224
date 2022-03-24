package chap13.lecture.p01generic;

import java.util.ArrayList;
import chap08.lecture.p01interface.example_class.*;

public class App11 {
	public static void main(String[] args) {
		ArrayList<Pet> list1 = new ArrayList<>();
		ArrayList<Canine> list2 = new ArrayList<>();
		ArrayList<Cat> list3 = new ArrayList<>();
		
		method(list1);
		method(list2);
		method(list3);
		
	}
	
	//
	// "in" variable을 쓰고 싶으면 extends   ,, in 멤버를 가지고 오는것
	// "out" variable :  super                ,,out 값을 주는것
	// "in" Object의 내부의 클래스들을 쓰고 싶다면 : ?
	// "in"과 "out"을 둘 다 쓸거면 쓰지마라?
	
	// 상하위 타입 그림
	public static void method(ArrayList<?> list) {
		Object o = list.get(0);
	}
	
	public static void method2(ArrayList<Cat> list) {
		list.add(new Cat());
		Cat cat = list.get(0);
	}
}

package chap13.lecture.p01generic;

import java.util.ArrayList;

import chap08.lecture.p01interface.example_class.Cat;
import chap08.lecture.p01interface.example_class.Chihuahua;
import chap08.lecture.p01interface.example_class.Pet;

public class App09 {
	public static void main(String[] args) {
		ArrayList<Pet> list1 = new ArrayList<>();
		list1.add(new Chihuahua());
		method(list1);
		
		ArrayList<Chihuahua> list2 = new ArrayList<>();
		list2.add(new Chihuahua());
		method(list2);
		
		ArrayList<Cat> list3 = new ArrayList<>();
		list3.add(new Cat());
		method(list3);
	}
	
	public static void method(ArrayList<? extends Pet> param) { // ? : wildcard
		param.get(0).roll(); // Pet의 roll메소드
	}
	
//	public static void method(ArrayList<Chihuahua> param) {
//		param.get(0).roll(); // Pet의 roll메소드
//	}
	
	//가 안되므로 와일드 카드라는 것이 필요함.
}

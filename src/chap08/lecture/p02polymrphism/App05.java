package chap08.lecture.p02polymrphism;

import chap08.lecture.p01interface.example_class.Animal;
import chap08.lecture.p01interface.example_class.Helper;
import chap08.lecture.p01interface.example_class.Pet;
import chap08.lecture.p01interface.example_class.Retriever;

public class App05 {
	public static void main(String[] args) {
		Retriever dog = new Retriever(); // 인스턴스 타입
		Helper helper = dog;             // 인터페이스 타입
		Pet pet = dog;                   // 인터페이스 타입
		Animal animal = dog;             // 상속타입
		
		helper.help();
		pet.roll();
		animal.cry();
	}
}

package chap08.lecture.p02polymrphism;

import chap08.lecture.p01interface.example_class.*;

public class App04 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		Pet pet1 = chihuahua;
		
		Cat cat = new Cat();
		Pet pet2 = cat;
		
		pet1.roll();
		pet2.roll();
		
		method(pet1);
		method(pet2);
		method(new Chihuahua());
		method(new Cat());
		
		Tiger tirger = new Tiger();
//		Pet pet3 = tiger; // implements가 안되어있으므로 안됨.
		Wolf wolf = new Wolf();
//		pet pet4 = wolf; // implements가 안되어있으므로 안됨
	}
	
	public static void method(Pet pet) {
		pet.roll();
	}
}

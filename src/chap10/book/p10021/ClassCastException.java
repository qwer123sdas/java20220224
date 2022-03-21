package chap10.book.p10021;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}


public class ClassCastException {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat); // 오류
	}
	
	public static void changeDog(Animal animal) {
		Dog dog = (Dog)animal;
		
	}
}

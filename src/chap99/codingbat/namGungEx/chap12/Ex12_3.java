package chap99.codingbat.namGungEx.chap12;

import java.util.ArrayList;

interface Eatable {
}

class Fruit implements Eatable {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

class FruitBox<T extends Fruit> extends Box<T> {
}

class Box<T> {
	ArrayList<T> list = new ArrayList<>(); // item을 저장할 list

	void add(T item) { list.add(item); }; // 박스에 item을 추가

	T get(int i) { return list.get(i);}; // 박스에 item을 꺼내 때
	
	int size() { return list.size(); };
	
	public String toString() {
		return list.toString();
	}

}

public class Ex12_3 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
//		FruitBox<Grape> fruitBox = new FruitBox<Apple>(); // 참조변수의 대입타입과 생성자의 대입타임이 달라서  에러 
//		FruitBox<Toy>> fruitBox = new FruitBox<>(); // FuitBox에는 제한이 있다.extends Fruit때문
		Box<Toy> toyBox2 = new Box<>(); // ok, 박스는 제약이 없기 때문에 타입 T면 다 가능

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); // Grape와 Apple은 자손이 아니기 때문
		grapeBox.add(new Grape());
		
		System.out.println("과일 박스 : " + fruitBox);
		System.out.println("사과박스 : " + appleBox);
		System.out.println("포도박스 : " + grapeBox);

	}
}

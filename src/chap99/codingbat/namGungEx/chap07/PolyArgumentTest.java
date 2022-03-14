package chap99.codingbat.namGungEx.chap07;

class Product01 {
	int price;
	int bonusPoint;

	Product01(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv01 extends Product01 {
	Tv01() {
		super(100); // 조상 클래스의 Product01클래스의 생성자를 호출
	}

	public String toString() { // Object클래스의 toString()을 오버라이딩한다.
		return "Tv01";
	}
}

class Computer01 extends Product01 {
	Computer01() {
		super(200); // 조상 클래스의 Product01클래스의 생성자를 호출
	}

	public String toString() { // Object클래스의 toString()을 오버라이딩한다.
		return "Computer01";
	}
}

class Audio01 extends Product01 {
	Audio01() {
		super(300); // 조상 클래스의 Product01클래스의 생성자를 호출
	}

	public String toString() { // Object클래스의 toString()을 오버라이딩한다.
		return "Audio01";
	}
}

// 사는 사람
class Buyer01 {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product01 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}
		money -= p.price;

		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		Product01[] p = new Product01[3];
		p[0] = new Tv01();
		p[1] = new Computer01();
		p[2] = new Audio01();

		Buyer01 b = new Buyer01();
		b.buy(p[0]);
		b.buy(p[1]);
		b.buy(p[2]);

		System.out.println(b.money);
		System.out.println(b.bonusPoint);
	}
}

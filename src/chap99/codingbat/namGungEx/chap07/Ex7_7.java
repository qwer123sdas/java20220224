package chap99.codingbat.namGungEx.chap07;

class Product{
	int price;
	int bounusPoint;
	Product(int price){
		this.price = price;
		bounusPoint = (int)(price / 10.0); // 왜 this안씀?
	}
}

class Tv extends Product{
	Tv(){
		// 조상 클래스의 생성자를 호출한다.
		super(100); 
	}
	
	public String toString() { // Object 클래스의 toString()을 오버라이딩
		return "TV";
	}
}

class Computer extends Product{
	Computer(){
		// 조상 클래스의 생성자를 호출한다.
		super(200); 
	}
	
	public String toString() { // Object 클래스의 toString()을 오버라이딩
		return "Computer";
	}
}

class Audio extends Product{
	Audio(){
		// 조상 클래스의 생성자를 호출한다.
		super(300); 
	}
	
	public String toString() { // Object 클래스의 toString()을 오버라이딩
		return "Audio";
	}
}

class Buyer{
	int money = 1000;
	int bounusPoint = 10;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price; // 가진 동에서 구입가격을 뺀 다.
		
		bounusPoint +=p.bounusPoint; // 제품의 보너스 점수를 추가
		System.out.println(p + "을/를 구입하였습니다.");
		// 여기서 p는 p.toStirng() + "을/를 구입하였습니다."과 똑같다.
		// 왜냐하면 참조변수 + String이라서이다. 그래서 "Tv"가 넘어온당.
	}
}
public class Ex7_7 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio aud = new Audio();
		
//		b.buy(new Tv()); // buy(Product p = new Tv())가되기 때문
		b.buy(tv);
		b.buy(com);
		b.buy(aud);
		
		System.out.println("현재 남은 돈은 " + b.money +"입니다.");
		System.out.println("현재 보너스 점수는 " + b.bounusPoint +"입니다.");
	}
}

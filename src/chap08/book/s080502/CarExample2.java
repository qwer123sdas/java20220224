package chap08.book.s080502;

public class CarExample2 {
	public static void main(String[] args) {
		Car2 myCar2 = new Car2();
		
		myCar2.run();
		
		myCar2.tires[0] = new KumhoTire();
		myCar2.tires[1] = new KumhoTire();
		myCar2.run();
		
	}
}

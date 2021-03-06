package chap07.book.s070702;

public class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 6);
	Tire backLeftTire = new Tire("뒤왼쪽", 6);
	Tire backRightTire = new Tire("enl왼쪽", 6);
	
	//생성자
	Car(){
		
	}
	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
}

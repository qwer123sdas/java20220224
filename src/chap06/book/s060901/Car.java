package chap06.book.s060901;

public class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	
	//
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 0; i<=50; i+=10) {
			this.setSpeed(i); // 메소드 호출
			System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h)");
		}
	}
}

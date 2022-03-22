package chap06.book.s060602;

public class Car {
	// 필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	public Car(){
	}
	//
	private String model2;
	
	public String getModel2() {
		return model2;
	}

	public void setModel2(String model2) {
		this.model2 = model2;
	}

	public Car(String model2) {
		this.model2 = model2;
	}
	
}

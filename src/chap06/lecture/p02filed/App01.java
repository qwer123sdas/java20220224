package chap06.lecture.p02filed;

public class App01 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();

		c1.speed = 30;
		c2.speed = 50;

		System.out.println(c1.speed);
		System.out.println(c2.speed);
		
		System.out.println(c1.color);
		System.out.println(c1.model);
		
		c1.color = "노랑색";
		c1.model = "기아자동차";
		System.out.println(c1.color);
		System.out.println(c1.model);
		
		
		Car c3 = new Car(200, "람보르기니", "yellow");
		System.out.println(c3.speed);
		System.out.println(c3.color);
		System.out.println(c3.model);
	}
}

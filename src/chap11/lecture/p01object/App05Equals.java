package chap11.lecture.p01object;

public class App05Equals {
	public static void main(String[] args) {
		Car car1 = new Car("kia", "k5");
		Car car2 = new Car("kia", "k5");
		
		System.out.println(car1.equals(car2));
	}
}

class Car{
	private String company;
	private String model;
	
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car c = (Car)obj;

			return c.company.equals(this.company) && c.model.equals(this.model);
		}
		
		return false;
	}
}

package chap08.book.s080502;

public class Car2 {
//	Tire[] tires = new Tire[4]
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
	
}

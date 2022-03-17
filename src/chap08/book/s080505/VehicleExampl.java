package chap08.book.s080505;

public class VehicleExampl {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run(); // 버스가 달립니다.
		
		
//		Bus bus1 = new Bus();
		
		if( vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		
		
		
	}
}

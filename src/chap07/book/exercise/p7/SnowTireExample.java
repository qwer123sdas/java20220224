package chap07.book.exercise.p7;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run(); // 스노우 타이어가 굴러갑니다.
		tire.run(); // 스노우타이어가 굴러갑니다.
	}
}

package chap07.book.s070702;

public class KumhoTire extends Tire{
	// 필드
	// 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRotaion;
		if(accumulatedRotaion < maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotation-accumulatedRotaion) + "회");
			return true;
		}else {
			System.out.println("***" + location + " KumhoTire 펑크***");
			return false;
		}
	}
}

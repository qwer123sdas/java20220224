package chap07.book.s070703;

public class Tire {
	// 필드
	public int maxRotation;
	public int accumulatedRotaion;
	public String location;
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	public boolean roll() {
		++accumulatedRotaion;
		
		if(accumulatedRotaion < maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumulatedRotaion) + "회");
			return true;
		}else {
			System.out.println("***" + location + "타이어 펑크 ***");
			return false;
		}
		
	}
}

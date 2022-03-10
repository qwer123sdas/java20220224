package chap06.book.s060702;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		// 기본생성자를 호출 하 수 없다.
//		System.out.println(myCar.color); // 필드가 없어서 오류
	}
}

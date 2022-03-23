package chap11.lecture.p03wrapper;

public class App07 {
	public static void main(String[] args) {
		Integer i1 = new Integer(9999);
		Integer i2 = new Integer(9999);
		int i3 = 9999;
		
		System.out.println(i1 == i2); // 참조값 비교. 가능한 사용 금지 ==> equals메소드 사용해야함.
		System.out.println(i1 == i3); // 기본형과 참조형을 같이 비교하면 자동 unboxing이 일어남
		
		Integer i4 = new Integer(8888);
		Integer i5 = new Integer(9999);
		
		System.out.println(i4 < i5); //  다만 부등호는 자동 unboxing이 일어남
		
		// 비교메소드
		//compareTo()
		// 결과는 int타입이므로 결과는 0, 양수, 음수 중에서 나옴
		// 0 : 같다는 결과
		// 음수 : 이 객체(앞에 있는 객체)가 작으면 나타나는 결과 = -1
		// 양수 : 이 객체(앞에 있는 객체)가 크면 나타나는 결과 = +1
		System.out.println(i4.compareTo(i5)); // 인스턴스 int형 메소드라서 인스턴스끼리 비교, 결과 : -1
		System.out.println(i5.compareTo(i4)); // r
		
		
	}
}

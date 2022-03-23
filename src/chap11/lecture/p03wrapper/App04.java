package chap11.lecture.p03wrapper;

public class App04 {
	public static void main(String[] args) {
		Integer i1 = new Integer(9999);
		Integer i2 = new Integer(9999);
		
		int i4 = i1;
		int i5 = i2;
		
		System.out.println(i4 == i5); // true
		System.out.println(i1 == i2); // false : 참조값비교를 하기 때문
		// 위와같이 실수하는 경우가 많다. 그래서 참조타입을 비교할 때는 타입을 변환시키거나 equals메소드 사용해야함. 
		System.out.println(i1.equals(i2)); // true; 
 		
	}
}

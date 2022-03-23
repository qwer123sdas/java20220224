package chap11.lecture.p03wrapper;

public class App03 {
	public static void main(String[] args) {
		// 참조타입을 기본형으로 변환시키는 방법
		
		Integer i1 = new Integer(333);
		int i2 = i1.intValue(); // unboxing : boxing된 int인 참조형을 꺼내서 기본형으로 만들어줌.
		
		//auto unboxing : 참조타입을 기본타입으로 자동 변환
		Integer i3 = new Integer(999); 
		int i4 = i3;  // auto unboxing이 일어남
		
		
	}
}

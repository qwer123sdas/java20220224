package chap11.lecture.p03wrapper;

public class App01 {
	public static void main(String[] args) {
		// java data type
		// primitive type(8개) : byte, char, short, int, long, float, double, boolean 
		// reference type(무한) : 배열, String, 객체 등등...
		
		Object[] arr= new Object[3];
		arr[0] = "java";  // 참조형
		arr[1] = 3;       // 기본형, int/ 기본형은 Object를 상속받지 않고 기본적으로 다른 데이터를 가짐
		       // 원래는 안되지만, java5부터 가능함. 자동으로 wrapper시켜줌
		
		arr[2] = new Integer(3); // 원래는 이렇게 해야함.이게 wrapper 클래스 - 기본타입을 참조타입으로 바꿔줌
		// 이런 wrapper class는 기본형 갯수처럼 8개가 있다.
		// 8개 : Byte, Short, Integer, Long, Character, Float, Double, Boolean
		// 
		
		
	}
}

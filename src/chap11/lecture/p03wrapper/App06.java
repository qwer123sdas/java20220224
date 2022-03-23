package chap11.lecture.p03wrapper;

public class App06 {
	public static void main(String[] args) {
		// String을 기본타입(또는 wrapper class)로 변경하는 방법
		String s1 = "365";
		int i1 = Integer.parseInt(s1); // auto unboxing이 아님. 
		System.out.println(i1);
		Integer i2 = Integer.valueOf(s1);  // auto unboxing이 아님.
		
		
		int i3 = Integer.valueOf(s1); // 대문자 Integer클래스가 int 기본형으로 들어가서 auto unboxing
		Integer i4 = Integer.parseInt(s1);// Inter.parseInt의 결과가 int기본형이므로 이게 Integer클래스의 참조형에 들어가므로 auto boxing 
		
	
	}
}

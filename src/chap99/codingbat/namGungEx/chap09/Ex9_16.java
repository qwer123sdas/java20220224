package chap99.codingbat.namGungEx.chap09;

public class Ex9_16 {
	public static void main(String[] args) {
		int i =10;
		
		// 기본형을 참조형으로 형변환
		Integer intg = (Integer)i; // Integer.valueOf(i)
		Object obj = (Object)i;    // (Object)Integer.valueOf(i)
		
		Long lng = 100L;  // Long lng = new Long(100L);
		
		int i2 = intg + 10; // 참조형과 기본형 간 연산 가능
		long l = intg + lng; // 참조형 간의 덧셈도 가능
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2; // 참조형을 기본형으로 형변환 가능
		
	}
}

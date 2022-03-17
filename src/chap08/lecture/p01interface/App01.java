package chap08.lecture.p01interface;

public class App01 {
	public static void main(String[] args) {
		System.out.println(MyInterface2.FIELD1);
		System.out.println(MyInterface2.FIELD2);
		
//		MyInterface2.FIELD1 = 33; // final이라서 할당 x
//		MyInterface2.FIELD2 = 99; // 재초기화 x
	}
}

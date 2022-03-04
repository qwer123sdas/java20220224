package chap05.lecture.reftype;

public class C07PrimitiveType {
	public static void main(String[] args) {
		int i1=3;
		method1(i1);

//		C07PrimitiveType mm =new C07PrimitiveType();
		C07PrimitiveType.method1(i1);
		System.out.println();
		
		
		System.out.println(i1);
	}
	
	static void method1(int i1) {
		i1=300;
	}
	// 클래스 메서드는 서로 호출이 가능함. 
}

package chap03.lecture.method;

public class C03Method {
	public static void main(String[] args) {
		myMethod01(300);
		myMethod01(900);
//		myMethod01(3.14); // x
		myMethod01('가'); // 자동 형변환
		myMethod01('a');
		
		int j = 999;
		myMethod01(j);
	}
	
	public static void myMethod01(int i) {
		System.out.println(i);
	}
}

package chap06.lecture.p04method;

public class App07 {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.call("donald");
		p1.call(8282);
		
		//메서드 오버 로딩
		// PrintStream이라는 out 객체가 가지는 메소드
		System.out.println();
		System.out.println(3);
		System.out.println("java");
		System.out.println(3.14);
		System.out.println('가');
	}
}

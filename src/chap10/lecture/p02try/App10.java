package chap10.lecture.p02try;

public class App10 {
	public static void main(String[] args) {
		// return명령문 실행되어도 finally block 실행됨.
		
		String s = "jva";
		
		try {
			System.out.println(s.length());
			System.out.println("try 블럭 실행");
			
			return;
		}catch(NullPointerException e) {
			System.out.println("널포인터익셉션 발생");
		}finally {
			System.out.println("리턴실행되어도 무조건 실행");
		}
		
		System.out.println("프로그램 계속 실행");
	}
}

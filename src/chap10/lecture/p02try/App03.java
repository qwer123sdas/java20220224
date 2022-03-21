package chap10.lecture.p02try;

public class App03 {
	public static void main(String[] args) {
		int i = 3;
		int j = 0;
		
		try {
			int k = i / j; // ArithmeticException
			System.out.println("몫 : " + k);
		}catch(ArithmeticException e) {
			// () 발생한 예외 객체의 타입과 변수명을 작성
			System.out.println("잘못 연산하였습니다.");
		}
		
		System.out.println("프로그램 계속 실행....");
		
		
		
	}
}

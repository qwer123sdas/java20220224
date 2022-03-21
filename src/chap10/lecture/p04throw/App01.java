package chap10.lecture.p04throw;

public class App01 {
	public static void main(String[] args) {
		// 예외발생시키기(던지기 throw)
		throw new NullPointerException();
		
		//예외 던진 후에는 메소드가 종료되서 더이상 실행되지 않는다.
		
		
		System.out.println("실행흐름 이어가기...");
	}
}

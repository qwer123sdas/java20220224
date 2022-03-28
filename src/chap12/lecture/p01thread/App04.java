package chap12.lecture.p01thread;

public class App04 {
	public static void main(String[] args) {
		
		System.out.println("스레드 실행중...");
		
		// static 메서드, sleep : 현재 쓰레드 실행을 millisecond만큼 멈춤
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("스레드 실행 계속");
	}
}

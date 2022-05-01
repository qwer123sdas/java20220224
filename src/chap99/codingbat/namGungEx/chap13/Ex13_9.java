package chap99.codingbat.namGungEx.chap13;

import javax.swing.JOptionPane;

public class Ex13_9 {
	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.println("입력한 값은 " + input + "입니다.");
		th1.interrupt();  // 호출하면 interrupted 상태가 true가 도니다.
//		System.out.println("isInterrupted() ; " + th1.isInterrupted()); // true
//		System.out.println("isInterrupted() ; " + th1.isInterrupted()); // true
//		
//		// main 쓰레드가 interrupted()되었는지 확인
//		// th1이 사실 Thread임 왜냐하면 main 쓰레드는 interrupt된적이 없기 떄문
//		System.out.println("interrupted() : " + th1.interrupted());
//		System.out.println("interrupted() : " + Thread.interrupted());
//				
	}
}

class ThreadEx9_1 extends Thread{
	public void run() {
		int i = 10;
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x = 0; x < 25000000000L; x++); // 시간 지연
		}
		System.out.println("isInterrupted() ; " + this.isInterrupted()); // true
		System.out.println("isInterrupted() ; " + this.isInterrupted()); // true
		// isInterrupted와 달리 interrupted는 interrupted라는 상태변수를 false로 초기화 시키지 않음
		
		System.out.println("interrupted() : " + Thread.interrupted());  // true
		System.out.println("interrupted() : " + Thread.interrupted());  // false
		
		
		System.out.println("카운트가 종료되었습니다.");
	}
	
	
}
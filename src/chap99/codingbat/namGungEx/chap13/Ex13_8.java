package chap99.codingbat.namGungEx.chap13;

public class Ex13_8 {
	public static void main(String[] args) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start();
		th2.start();
		
		delay(2*1000);
		System.out.println("메인 쓰레드 종료");
	}
	
	static void delay(long millis) {
		try {
			Thread.sleep(2000);
		}catch(Exception e){}
	}
}

class ThreadEx8_1 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i ++) {
			System.out.println("-");
		}
		System.out.println("th1종료");
	}
}

class ThreadEx8_2 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i ++) {
			System.out.println("|");
		}
		System.out.println("th2종료");
	}
}

package chap99.codingbat.namGungEx.chap13;

public class Ex13_1 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		
	  ThreadEx1_1 t1 = new ThreadEx1_1();
	 
	  Runnable r = new ThreadEx1_2(); Thread t2 = new Thread(r);
	  
	  t1.start(); t2.start();
	  startTime = System.currentTimeMillis();		 

	  // --------------
	  for (int i = 0; i < 500; i++) {
			System.out.println(0);
	  }
	
	  for (int i = 0; i < 500; i++) {
			System.out.println(1);
	  }
	  System.out.println("소요시간 : " + (System.currentTimeMillis() - startTime));
	}
}

class ThreadEx1_1 extends Thread {
	public void run() { // 쓰레드가 수행할 작업
		for (int i = 0; i < 500; i++) {
			System.out.println(this.getName());
		}
	}
}

class ThreadEx1_2 implements Runnable {
	public void run() { // 쓰레드가 수행할 작업
		for (int i = 0; i < 500; i++) {
			// Thread.currentThread() : 현재 실행중인 Thread를 반환
			System.out.println(Thread.currentThread().getName());
		}
	}
}

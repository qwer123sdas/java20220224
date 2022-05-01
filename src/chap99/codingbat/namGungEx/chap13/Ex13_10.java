package chap99.codingbat.namGungEx.chap13;

public class Ex13_10 {
	public static void main(String[] args) {
		MyThread th1 = new MyThread(r, "*");
		MyThread th2 = new MyThread(r, "**");
		MyThread th3 = new MyThread(r, "***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();
			
			Thread.sleep(2000);
			th2.suspend();
			
			Thread.sleep(3000);
			th1.resume();
			
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			
			Thread.sleep(2000);
			th3.stop();
		}catch(Exception e){
		}
	}
}

class MyThread implements Runnable{
	volatile boolean suspended = false;  // volatile : 쉽게 바뀌는 변수라는 말
	             // cpu의 코어들의 복사본을 사용하지 않도록 함. 즉 원본을 직접 가지고 오도록함.
	volatile boolean stopped = false;
	
	Thread th;
	
	public MyThread(String name) {
		th = new Thread(this, name); // Thread(Runnable r, String name)
	}
	
	void start() {
		th.start();
	}
	
	void stop() {
		stopped = true;
	}
	
	void resume() {
		suspended = false;
	}
	public void run() {
		while(!stopped) {
			if(!suspended) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			}
		}
	}
}

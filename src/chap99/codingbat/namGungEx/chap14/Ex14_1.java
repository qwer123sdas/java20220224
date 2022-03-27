package chap99.codingbat.namGungEx.chap14;

@FunctionalInterface
interface MyFunction1{
	void run();
}

public class Ex14_1 {
	static void execute(MyFunction1 f) { // 매개변수 타입 = 함수 인터페이스인 메서드
		f.run();
	}
	
	static MyFunction1 getMyFunction1() { // 반환타입이 함수 인터페이스인 메서드
		/* MyFunction1 f = new MyFunction1(){
		 * 		@Override	
		 * 		public void run(){
		 * 			System.out.println("f3.run()");
		 *		} 	
		 * } 
		 * return f;
		 * 가 아래의 람다식을 풀어서 쓴 것.
		 */
		MyFunction1 f = ()->System.out.println("f3.run()");
		return f;
		
//	위는	return ()->System.out.println("f3.run()"); 와 같다.
	}
	
	public static void main(String[] args) {
		// 람다식으로 MyFunction1의 익명객체생성 + 그 익명객체의 메소드를 익명 메소드인 람다식으로 표현하여 run()을 구현
		MyFunction1 f1 = () -> System.out.println("f1.run()");
		
		MyFunction1 f2 = new MyFunction1() { // 익명클래스로 run 구현
			@Override
			public void run() { // public을 반드시 붙여야함
				System.out.println("f2.run()");
			}
		};
		
		MyFunction1 f3 = getMyFunction1();
		// 위는 MyFunction1 f3 = ()->System.out.println("f3.run()");와 같다.
		
		// 즉 f1 ,f2, f3는 똑같이 익명클래스가된 run()을 오버라이딩한   ()->System.out.println("f3.run()");를 받는다.
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( ()-> System.out.println("run()") );
		//
		;
	}
	
}

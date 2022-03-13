package chap06.lecture.p04method;

public class App03 {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		
		c1.execute("game");
		// 반복해서 호출 가능 = 중복을 줄일 수 있다
		c1.execute("excel");
		
		c1.update("calculator");
		c1.update("windows");
		
		c1.add(3, 5);
//		c1.add(3.14, 1.0); int 타입이라서 오류
		c1.add('c', 'a'); // 196
	}
}

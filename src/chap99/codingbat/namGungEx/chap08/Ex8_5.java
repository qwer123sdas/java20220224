package chap99.codingbat.namGungEx.chap08;

public class Ex8_5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외 발생! -> 해당 예외 객체 생성
			System.out.println(4);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("예외 메시지 : " + e.getMessage());
			System.out.println();
		}
		
		System.out.println(6);
	}
}

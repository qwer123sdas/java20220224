package chap10.lecture.p04throw;

public class App03 {
	public static void main(String[] args) {
		method1();

		System.out.println("프로그램 실행 계속...");
	}

	private static void method1() {
		method2();
		System.out.println("메소드1 실행 계속...");
	}

	private static void method2() {
//		method3(); // exception이 발생할 수 있는 코드
		
		try {
			method3(); // exception이 발생할 수 있는 코드	
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("메소드2 실행 계속...");
	}

	private static void method3() throws Exception{
		// checked exception
		throw new Exception(); // 예외를 처리하지 않았다. 
		// 그런데 try catch로 해결 잘 안함.
		

	}
}

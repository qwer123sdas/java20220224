package chap10.lecture.p04throw;

public class App02 {
	public static void main(String[] args) {
		method1();
	}
//		try {
//			method1(); // NullpointerException이 발생가능한 코드
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("프로그램 실행 흐름 계속");
//	}
	
	private static void method1() {
		method2(); // NullpointerException이 발생가능한 코드
		System.out.println("메소드 1이 계속 실행...");
	}
	private static void method2() {
		method3(); // NullpointerException이 발생가능한 코드. 오류가 났기 때문에 밑으로 진행되지 않음.
		System.out.println("메서드 2이 계속 실행...");
	}
	private static void method3() throws NullPointerException{
		throw new NullPointerException();
	}
}

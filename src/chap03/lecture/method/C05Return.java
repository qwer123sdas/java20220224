package chap03.lecture.method;

public class C05Return {
	public static void main(String[] args) {
		System.out.println("명령문1");
		System.out.println("명령문2");
		int i =myMethod02();
		System.out.println("명령문3");
		System.out.println(i);
	}
	
	public static void myMethod01() {
		System.out.println("my method01 명령문1");
		System.out.println("my method02 명령문2");
		//return : 1. 메소드 종료, 2. 오른쪽에 있는 값을 호출한 곳으로 반환한다(=return)
		
		return;
		
//		System.out.println("my method01 명령문 3"); //도달 x
	}
	
	
	public static int myMethod02() {
		// 메소드 명 앞에 리턴하는 값의 타입 명시해야 함.
		// 만약,  리턴하는 값이 없으면  void로 명시
		
		System.out.println("my method02 명령문1");
		
		return 3;
	}
}

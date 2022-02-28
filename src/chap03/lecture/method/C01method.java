package chap03.lecture.method;

public class C01method {
	public static void main(String[] args) { // main 메소드 생성
		
		System.out.println("명령문 1");
		mymethod01();
		
		System.out.println("명령문 2");
		mymethod01(); // 메소드 호출
		
		System.out.println("명령문 3");
	}
	
	
	public static void mymethod01() {  //mymethod01 메소드 생성
		System.out.println("마이 메소드 1");
		System.out.println("마이 메소드 2");
	}
}

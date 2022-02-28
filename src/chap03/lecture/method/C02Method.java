package chap03.lecture.method;

public class C02Method {
	public static void main(String[] args) {
		
		System.out.println("명령문1");
		myMethod01(300);
		System.out.println("명령문2");
		myMethod01(3); // parameter가 있다면 꼭 넣어줘야함
		System.out.println("명령문3");
	}
	
	
	//메소드 이름 : lowerCamelCase
	
	//()에 파라미터 타입과 파라미터 이름 작성 가능 
	//= 매개변수(parameter)=지역변수
	public static void myMethod01(int i) {
		System.out.println("마이메소드 1");
		System.out.println("파라미터 i의 값 : " + i);
	}
}

package chap06.lecture.p04method;

public class Student {
	String name;      //  필드
	
	Student(String name){  // 생성자
		this.name = name;
	}
	
	
	// (instance) method = 이 클래스에 의해 만들어진 인스턴스(객체)의 기능&행동
	// 작성법 : 
	// 리턴타입 메소드명(파라미터타입 파라미터명...){ 실행할 명령문들...}
	void study(){
		// 실행할 명령문 들...
		System.out.println("공부합니다.");
	}
	
}

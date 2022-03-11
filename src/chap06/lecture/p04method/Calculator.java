package chap06.lecture.p04method;

public class Calculator {
	// 매소드 return 
	// 메소드명 앞에 return값의 타입을 반환타입으로 명시해야함.
	// return할 값이 없다면 void로 명시
	
	int plus1(int a, int b){
		int result = a+b;
		return result;
		
//		System.out.println("실행되지 않는다.");
	}

	
	void powerOn(){
		
	}
	
	//자동 형변환을 감안하고 작성해야 한다.
	long plus2(int a, int b){
		int result = a+b;
		return result;
	}
	
	// return : 1. 메소드 종료
	//          2. 오른쪽에 있는 값을 반환
}

package chap06.lecture.p04method;

public class Phone {
	// method overloading
	// 메소드이름이 같은 메소드를 여러개 만드는 것 = 메소드 오버 로딩
	// 같은 메소드명을 가져도 파라미터의 타입, 개수, 순서로 구분됨.	
	
	// * 참고 : 7장에서 배우는 method overriding과 용어가 비슷해서 면접에서 자주 물어봄 ㅋㅋ
	void call(String name){
		System.out.println(name + "에게 전화검" );
	}
	
	void call(int number) {
		System.out.println(number + "로 전화검");
	}
	
	void call(String name, int number) {
		System.out.println();
	}
	
	void call(int number, String name) {
		
	}
	
//	int call(int number) {    리턴타입이 달라도 오버로딩이 아니라서 사용못함.
//		return 0;
//	}
}

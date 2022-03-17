package chap08.lecture.p01interface.example_class;

public interface Pet {
	// 인터페이스명 : UpperCamelCase
	// interface 키워드 사용
	
	void roll(); // public abstract void 메소드임.
	
	
	// default method
	default void sit() {
		//인터페이스에 정의된 코드블럭이 있는 인슽ㄴ스 메소드
		// 모두 public이다.
		
		System.out.println("반려동물이 앉습니다.");
	}
	
	
	
}

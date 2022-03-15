package chap07.lecture.p02override;

public class SubClass1 extends SuperClass1{
	
	// 어노테이션( @ ) : 컴파일러, 프레임워크, 또는 어떤 프로그램에게 의미있는 정보를 주는 주석 
	// 문법 : @어노테이션이름
	
	// @Override : 메소드 앞에 작성 가능함
	//             컴파일러에게 이 메소드가 재정의된 메소드인지 검증하도록 해줌.
	@Override 
	public void method1() {
		
	}
	
	@Override // 이렇게 주석을 달아놓으면, 컴파일할 때 오류를 잡아준다.
	public void method2() {
		//오류가 생긴이유 ; @Override 어노테이션이 붙어서 컴파일러가 재정의한 메소드인지(오버로드한 건지) 확인해보았더니, 재정의한 메소드가 아니라서 컴파일 오류가 낫다.
		
	}
}

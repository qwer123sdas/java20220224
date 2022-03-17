package chap08.lecture.p03extends;

public interface MySubInterface1 extends MySuperInterface1, MySuperInterface2{
	void subMethod1();
	
	//superMethod를 재정의할 의무는 없음, 만약 하고 싶다면 default메소드로 하기?
	
	
	@Override
	default void superDefaultMethod1() {
		System.out.println("서브인터페이스에서 재정의한 디폴트 메소드!");
	}
}

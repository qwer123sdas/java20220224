package chap07.lecture.p02override;

public class SubClass2 extends SuperClass2{
	
	@Override
	public void method1() {
		System.out.println("서브 클래스2의 메소드 1이 하는 일");
		
		// super : 부모클래스 맴버에 접근하기 위해 사용됨.
		super.method1(); // super는 부모 클래스를 가리킴. + 거기에 있는 메소드
		          // super()과는 다르게 순서나 위치는 중요하지 않다.
		
		System.out.println(" 또 다른 일.....");
	}
	
}

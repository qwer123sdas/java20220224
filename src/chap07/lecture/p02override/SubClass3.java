package chap07.lecture.p02override;

public class SubClass3 extends SuperClass3{
	public void subMethod1() {
		System.out.println("서브메소드1");
		super.superMethod1();
		System.out.println("서브메소드2");
		super.superMethod2();
		System.out.println("서브메소드 3");
//		super.superMethod3(); // private 멤버는 접근 불가능
	}
}

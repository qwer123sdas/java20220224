package chap08.lecture.p03extends;

public class MyClass1 implements MySubInterface1{
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		MySubInterface1 sub1 = o1;
		MySuperInterface1 super1 = o1;
		
		sub1.subMethod1();
		o1.subMethod1();
//		super1.method1(); // super인터페이스에는 method1()이 없기 때문에 안됨
		
		sub1.superMethod1();
		o1.superMethod1();
		super1.superMethod1();
		
		MySuperInterface2 super2 = o1;
//		supereMethod2()호출
		o1.superMethod2();
		sub1.superMethod2();
		super2.superMethod2();
//		super1.superMethod2();
		
		// 슈퍼 디폴트메소드
		o1.superDefaultMethod1();
		sub1.superDefaultMethod1();
		super1.superDefaultMethod1();
		
		
	}
	
	@Override
	public void subMethod1() {
		System.out.println("서브 인터페이스 메소드 재정의!");
	}
	
	@Override
	public void superMethod1() {
		System.out.println("슈퍼인터페이스 메소드 재정의");
	}
	
	@Override
	public void superMethod2() {
		System.out.println("슈퍼인터페이스22 메소드 재정의222");
	}
	
	@Override
	public void superDefaultMethod1() {
		System.out.println("마이클래스에서 재정의한 슈퍼디폴트 메소드!");
	}
	
}

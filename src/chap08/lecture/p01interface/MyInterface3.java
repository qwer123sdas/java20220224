package chap08.lecture.p01interface;

public interface MyInterface3 {
	// (인스턴스) 메소드 작성하면 모두 public abstract만 사용가능하다
	// 즉 코드블럭만없으면 됨.
	void method1(); // 코드블럭이 있으면 안된다.
	public abstract void method2();
	public void method3();
	abstract void method4();
	
}

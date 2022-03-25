package chap14.lecture.p01lambda;

public class App03 {
	public static void main(String[] args) {
		
		/*
		MyInterface3 o1 = new MyInterface3() {
			@Override
			public void method2() {
			}
			@Override
			public void method1() {
			}
		};
		*/
		
		MyInterface3 o3 = ()->{
			
		};
		// 이 몸통이 metho1의 몸통인지 method2의 몸통인지 구분을 하지 못하기 때문에 사용 불가능하다.
		
		
		
		
	}
}

interface MyInterface3{
	void method1();
	void method2();
}

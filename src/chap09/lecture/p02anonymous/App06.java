package chap09.lecture.p02anonymous;

public class App06 {
	public static void main(String[] args) {
		int var1 = 3; // 사전에 final로 명시하거나 , effectively final이 되어야함.
		
		// 이를 로컬 클래스에서 지역변수를 사용할수 있는데
		class MyLocalClass1 implements MyInterface1{
			@Override
			public void method1() {
				System.out.println(var1);
			}
		}
		
		MyInterface1 o1 = new MyLocalClass1();
		o1.method1();
	}
	
	
}

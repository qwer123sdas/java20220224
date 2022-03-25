package chap14.lecture.p01lambda;

public class App06 {
	public static void main(String[] args) {
		
		int local = 0; // final or effectively final
		MyInterface6 o1 = new MyInterface6() {
			@Override
			public void method1() {
				System.out.println(local);
			}
		};
		
		// local = 4; 재정의안됨. 왜냐면 상수니까
		// 따라서 람다식에서도 변수를 재정의 하면 안된다.(일단 메인 메소드 안이니까)
		MyInterface6 o2 = ()-> System.out.println(local);
	}
}

@FunctionalInterface
interface MyInterface6{
	void method1();
}
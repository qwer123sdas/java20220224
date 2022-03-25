package chap14.lecture.p01lambda;

public class App02 {
	public static void main(String[] args) {
		MyInterface2 o1 = (int a, int b)->{
				System.out.println(a);
				System.out.println(b);
		};
	}
}


interface MyInterface2{
	void method1(int a, int b);
}

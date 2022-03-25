package chap14.lecture.p01lambda;

public class App07 {
	public static void main(String[] args) {
		
//		args = null; // final이거나 effectively final이어야함.
		
		MyInterface7 o1 = () -> System.out.println(args.length);
	}
}

@FunctionalInterface
interface MyInterface7{
	void method();
}

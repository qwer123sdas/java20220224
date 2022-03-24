package chap13.book.p130501;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b"); // xxx
		
		int result1 = Util.compare(10, 20); // 자동 boxing
		System.out.println(result1);
	}
}

package chap11.book.p111202;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// 자동 Boxing
		Integer obj = 100;
		System.out.println(obj.intValue());
		
		// 대입시 자동 unboxing
		int value = obj;
		System.out.println(value);
		
		//연산시 자동 unboxing
		int result = obj + 100;
		System.out.println(result);
	}
}

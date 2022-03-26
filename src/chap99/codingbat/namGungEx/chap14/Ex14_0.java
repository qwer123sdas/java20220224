package chap99.codingbat.namGungEx.chap14;

public class Ex14_0 {
	public static void main(String[] args) {
////		(a, b) -> a > b ? a : b // 람다식, 이는 익명객체이므로 참조변수가 있어야함.
////		Object obj = (a, b) -> a > b ? a : b 
//		// 하지만 이렇게 하면 오류가 남
//		// 왜냐하면 
//		Object obj = new Object() {
//			int max(int a, int b) {
//				return a>b ? a : b;
//			}
//		}
//		int value = obj.max(3,5);
//		// 에서 obj의 참조변수는 max라는 메소드를 가지고 잇지 않기 때문이다.
//		// 그래서 필요한 것이 함수형 인터페이스이다.
		
		MyFunction f = new MyFunction() {
			@Override
			public int max(int a, int b) {
				return a>b? a : b;
			}
		};
		int value1 = f.max(3, 5);
		
		
		MyFunction f2 = (a,b) -> a>b?a:b;
		int value2 = f2.max(3, 5)
		
	}
}

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상메서드만 가져야 함.
interface MyFunction {
	int max(int a, int b);
}
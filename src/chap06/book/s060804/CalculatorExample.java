package chap06.book.s060804;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		
		// 직사각형 넓이 구하기
		double result1 = c1.areaRectangle(10);
		double result2 = c1.areaRectangle(10, 20);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}
}

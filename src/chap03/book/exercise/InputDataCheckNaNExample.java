package chap03.book.exercise;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val; /// 10000.0 + NaN = NaN
		
		System.out.println(currentBalance);
	}
}

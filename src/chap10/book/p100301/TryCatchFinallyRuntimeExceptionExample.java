package chap10.book.p100301;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = "a";
			data2 = "3";
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행매개값의수가 부족합니다.");
			System.out.println("실행방법");
			System.out.println("java TryCatcjFinallyRuntimeException num1 um2");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}
	}
}	

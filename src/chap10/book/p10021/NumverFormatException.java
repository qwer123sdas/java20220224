package chap10.book.p10021;

public class NumverFormatException {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a110";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(result);
	}
}

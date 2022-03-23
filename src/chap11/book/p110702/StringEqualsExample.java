package chap11.book.p110702;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열");
		}else {
			System.out.println("다른 문자열");
		}
	}
}

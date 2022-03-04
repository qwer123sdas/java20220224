package chap05.book;

public class StringEqulasExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철"; // 이미 있는 것을 재사용. 항상 그런 것은 또 아님;;
		
		if(strVar1 == strVar2) {
			System.out.println("서로 참조변수 값이 같음");
		}else {
			System.out.println("서로 참조변수 값이 다름");
		}
		
		if(strVar1.contentEquals(strVar2)) {
			System.out.println("서로 문자열이 같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		if(strVar3 == strVar4) {
			System.out.println("서로 참조변수 값이 같음");
		}else {
			System.out.println("서로 참조변수 값이 다름");
		}
		
		if(strVar3.contentEquals(strVar4)) {
			System.out.println("서로 문자열이 같음");
		}
	}

}

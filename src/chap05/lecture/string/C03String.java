package chap05.lecture.string;

public class C03String {
	public static void main(String[] args) {
		String s1 = "spring";
		String s2 = "java";
		String s3 = "우크라이나";

		// length()
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());

		//charAt(int) : 파라미터로 받은 인덱스의 문자(char)로 리턴
		System.out.println(s1.charAt(0));
		System.out.println(s2.charAt(0));
		System.out.println(s3.charAt(0));

		System.out.println(s1.charAt(s1.length() - 1));
		System.out.println(s2.charAt(s2.length() - 1));
		System.out.println(s3.charAt(s3.length() - 1));

		// equals(Object) : 파라미터로 받은 객체와  이 객체의 문자열을 비교한다. 결과값은 boolean
		String s4 = "spr";
		String s5 = "ing";
		String s6 = s4 + s5;
		System.out.println(s1); // spring
		System.out.println(s6); // spring
		System.out.println(s1 == s6); // false
		System.out.println(s1.equals(s6)); // true

		// indexOf(String) : 파라미터로 받은 문자열이 처음발견된 위치(index)를 리턴
		String s7 = "이 책을 통해 무엇을 배울 수 있죠";
		System.out.println(s7.indexOf("책을")); // 2
		System.out.println(s7.indexOf("을")); // 3
		System.out.println(s7.indexOf("자바")); // -1
		
		// substring(int, int) : 첫번째 파라미터는 시작index, 두번째 파라미터는 종료index 전까지의 문자열의 부분 문자열을 리턴한다.
		System.out.println(s7.substring(8, 11)); // 무엇을
		System.out.println(s7.substring(12, 16));  // 배울 수
		// substring(int) : 이 문장의 부분 문자열을 첫번재 파라미터부터 시작하여 끝까지 리턴한다.
		System.out.println(s7.substring(8));
		System.out.println(s7.substring(12));

	}
}

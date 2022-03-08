package chap05.lecture.string;

public class C06RagEx {
	public static void main(String[] args) {
		// regular expression
		// 정규식(정규표현식)
		// 문자열의 패턴을 표현한 문자
		
		// 한 문자
		System.out.println("a".matches("a"));
		System.out.println("a".matches("b")); // matches안에 있는 것이 regex, 
		System.out.println("aa".matches("a"));
	}
}

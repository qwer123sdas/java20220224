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
		System.out.println("abc".matches("a"));
		
		// 여러문자 중 하나
		System.out.println("a".matches("[abc]")); // [abc] a또는 b 또는 c라는 중에서 한개 의미
		System.out.println("b".matches("[abc]"));
		System.out.println("c".matches("[abc]"));
		System.out.println("d".matches("[abc]"));
		System.out.println("abc".matches("[abc][abc][abc]"));
		System.out.println("bbbb".matches("[abc][abc][abc]"));
		
		
		
	}
}

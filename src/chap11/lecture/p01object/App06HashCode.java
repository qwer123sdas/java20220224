package chap11.lecture.p01object;

public class App06HashCode {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.hashCode());
		System.out.println(o1.hashCode());
		
		String s1 = new String("java");
		String s2 = new String("java");
		
		// String에는 hashcode가 재 정의되어있어서  문자열을 기준으로 인트로 바꿔서  보내줌
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
	}
}

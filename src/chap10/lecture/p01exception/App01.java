package chap10.lecture.p01exception;

public class App01 {
	public static void main(String[] args) {
		// NullPointerException
		
		String s = "java";
		System.out.println(s.length());
		
		String t = null;
		System.out.println(t.length()); // 이때 에러 발생 : Null일 때 사용할려고해서 나는 오류다 = nullpointexception
		
 	}
}

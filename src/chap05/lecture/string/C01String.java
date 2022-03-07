package chap05.lecture.string;

public class C01String {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(s1 == s2); // 참조값을 비교하므로 false
		
		System.out.println(s1.equals(s2)); // 각 참조값의 내용을 비교하므로 true
		
		String s3 = "java";
		String s4 = "java";
		String s5 = "java";
		System.out.println(s3 == s4); // true,,, 왜냐하면 이미 리터럴한 똑같은 값이 있으므로
		System.out.println(s3 == s5);
		// 서로 같은 참조값을 가짐.
		
		// 따라서 String을 비교할 때는 항상 equals를 사용해야한다.
	}
	
	
}

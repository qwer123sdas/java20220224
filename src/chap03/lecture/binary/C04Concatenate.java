package chap03.lecture.binary;

public class C04Concatenate {
	public static void main(String[] args) {
		// +의 피연산자가 하나라도 String이면 연결연산자
		
		String s1 = "hello";
		String s2 = "java";
		
		System.out.println(s1+s2);
		
		String s3 = s1+s2;
		System.out.println(s3);
		
		int i1 = 9999;
		int i2 = 8888;
		System.out.println(i1+i2); // 산술연산자
		System.out.println(i1+s1); // 연결연산자
		
		String s4 = "8888";
		System.out.println(i1+s4); // 연결연산자
		System.out.println(i1+i2+s1); // 연산방향 때문에, i1+i2이후에 연결연산자
		System.out.println(s1+i1+i2); // 연산방향 때문에, s1+i1는 연결연산자, 그 이후도 연결연산자
		
		char c1 = 'a';   // 97
		System.out.println(c1+s1); // 연결연산자
		
		System.out.println(c1+i1);  
		
		
	}
}

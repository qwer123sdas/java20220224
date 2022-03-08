package chap05.lecture.reftype;

public class C08Null {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = "java";
		int[] a1= new int[] {3,4};
		int[] a2 = {3,6};
		
		String s3 = null; // 가리키는 인스턴스(객체)가 없다는 의미
		String[] a3 = new String[3];
		System.out.println(a3[0]); //null
		System.out.println(a3[1]); //null
		System.out.println(a3[2]); //null
		
		int[][] a03 = new int[3][];
		
		//null인 참조변수 사용하는 경우
		System.out.println(a3[0].equals("java")); // 오류가 뜬다. == NullPointerException, 가리키는 참조값이 없는 참조변수를 사용했다는 말.
		System.out.println("프로그램 진행.....");
		
		
	}
}

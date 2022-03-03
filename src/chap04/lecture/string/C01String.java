package chap04.lecture.string;

public class C01String {
	public static void main(String[] args) {
		String str1 = "java";

		System.out.println(str1);
		System.out.println(str1.equals("spring"));
		System.out.println(str1.equals("java"));

		System.out.println(str1.substring(0)); // java
		System.out.println(str1.substring(1)); // ava

		System.out.println(str1.substring(0, 2)); // ja
		System.out.println(str1.substring(2, 4)); // va
//		System.out.println(str1.substring(1, 5)); // error
		System.out.println(str1.length()); // 4

	}


}

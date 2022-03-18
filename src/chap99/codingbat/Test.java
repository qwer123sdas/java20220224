package chap99.codingbat;

public class Test {
	public static void main(String[] args) {
		String[] arr1 = method();
		System.out.println(arr1.length);
		
		String str1 = "java is a program language";
		String[] arr2 = str1.split(" ");
	}
	
	public static String[] method() {
		return new String[] {"a", "b"};
		
		
	}
}

package chap05.lecture.array;

public class C06Array {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 5, 1};
		method1(arr1);
		
		int[] arr2 = {10, 20, 30};
		method1(arr2);
		
		int[] param = {-1, -5, -6};
		System.out.println("배열param의 [0]값은 " + param[0]);
		method1(param);
		System.out.println("배열param의 바뀐 [0]값은 " + param[0]);
		
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
	
	public static void method1(int[] param) {
		param[0] *= 2;
	}
}

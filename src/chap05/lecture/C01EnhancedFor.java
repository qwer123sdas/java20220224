package chap05.lecture;

public class C01EnhancedFor {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			System.out.println("그냥 for문");
		}
		
		int[] arr1 = {100, 200, 300, 400};
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for(int itemArr1 : arr1) {
			System.out.println("코드반복!!" + itemArr1);
		}
	}
}

package chap10.lecture.p01exception;

public class App02 {
	public static void main(String[] args) {
		// ArrayIndexOutOFBoundException
		
		int[] arr1 = new int[] {5, 6, 7};
		// 여기서 0, 1, 2의 인덱스를 넘어 갈 때 생기는 오류
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		/* exception 발생하는 예시
		System.out.println(arr1[-1]);
		System.out.println(arr1[3]);
		*/
	}
}

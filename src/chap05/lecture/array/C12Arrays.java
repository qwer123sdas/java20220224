package chap05.lecture.array;

import java.util.Arrays;

public class C12Arrays {
	public static void main(String[] args) {
		int[] a = {-1, 9, 2, 3, 10};
		System.out.println(a); // 참조값 인출
		
		System.out.println(Arrays.toString(a));  //  배열 값 인출
		Arrays.sort(a);  //  오름 차순 배열
		System.out.println(Arrays.toString(a));
		
		int[] b = new int[10];
		// 모두 5로 채우기
		Arrays.fill(b, 5);
		System.out.println(Arrays.toString(b));
	}
}

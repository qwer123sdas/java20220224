package chap05.lecture.array;

import java.util.Arrays;

public class C10Array {
	public static void main(String[] args) {
		int[] a = {3, 4, 5, 7};
		int[] b = a; // 참조값 복사
		System.out.println(b[0]);
		
		int[] c = new int[a.length];
		for(int i=0; i<a.length; i++) {
			c[i] = a[i];
		}
		c[0] = 30;
		System.out.println(a[0]);
		System.out.println(c[0]);
		
		int[] arr3 = Arrays.copyOf(a, 5);
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}

		
		
	

	}
}

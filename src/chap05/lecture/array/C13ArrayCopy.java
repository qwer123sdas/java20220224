package chap05.lecture.array;

import java.util.Arrays;

public class C13ArrayCopy {
	public static void main(String[] args) {
		int[][] a = {{3, 5}, {10, 11, 12}, {20, 10}};
		int[][] b = a;
		
		b[0][0] = 99;
		System.out.println(a[0][0]);
		
		int[][] c = Arrays.copyOf(a,  3);
		
		System.out.println(c[0][0]);
		
		c[0][0] = 999;
		System.out.println(c[0][0]); // 999
		System.out.println(a[0][0]); // 999
		// a와 c의 참조값은 다르지만, 안의 item들의 참조값이 같기 때문이다.
		System.out.println();
		c[0] = new int[] {22, 23};
		System.out.println(c[0][0]);   // 22
		System.out.println(a[0][0]);  // 999
		System.out.println(a[0][1]);  // 5
	}
}

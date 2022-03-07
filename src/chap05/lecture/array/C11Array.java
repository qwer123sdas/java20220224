package chap05.lecture.array;

import java.util.Arrays;

public class C11Array {
	public static void main(String[] args) {
		int[] a = {9, 5, 2, 1};
		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		// Arrays 메소드
		int[] c = Arrays.copyOf(a, 6);
		
		// System 메소드
		int[] d = new int[a.length];
		System.arraycopy(a, 0, d, 0, a.length);
		//각 0 은 시작위치,, a의 0에서 시작 d도 0시작 하여 a.length만큼 복사
		
		System.arraycopy(src, srcPos, dest, destPos, length);
 	}
}

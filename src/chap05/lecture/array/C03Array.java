package chap05.lecture.array;

public class C03Array {
	public static void main(String[] args) {
		// 배열 안의 배열, 2차원 배열
		int[][] arr1 = new int[][] { { 2, 3 }, { 10, 20, 30 }, { 11, 22 } };
		
		System.out.println(arr1[0][0]);  // 2
		System.out.println(arr1[0][1]);  // 3
		
		System.out.println(arr1[1][1]);  // 20
		System.out.println(arr1[2][0]);

		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);  // 배열을 to String한 결과  @뒤에 있는 값이 주소값.
			for(int j=0; j<arr1[i].length; j++) {
				System.out.println(arr1[i][j]);
			}
		}
		
	}
}

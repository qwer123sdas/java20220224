package chap05.lecture.array;

public class C04Array {
	public static void main(String[] args) {
		// 첫번째 부분만 명시하면 됨.
		int[][] arr1 = new int[3][];
		
		System.out.println(arr1.length);  // 3
		System.out.println(arr1[0]);  //null 왜냐하면 참조 타입이니까.
		System.out.println(arr1[1]);  // null
		System.out.println(arr1[2]);  // null
		
		// arr1[n]은 참조변수
		arr1[0] = new int[3];
		System.out.println(arr1[0][0]); // 0
		System.out.println(arr1[0][1]); // 0
		System.out.println(arr1[0][2]); // 0
		
//		System.out.println(arr1[1][0]); //  null이지만 다른 오류
		
		arr1[1] = new int[3];
		arr1[2] = new int[4];
		
		// 한번에 다 정해주기
		int[][] arr2 = new int[3][4];   // 3행 4열의 행렬과 비슷
		System.out.println(arr2.length); //3
		System.out.println(arr2[0].length); // 4
		System.out.println(arr2[1].length); // 4
		System.out.println(arr2[2].length); // 4
		
		arr2[0][0] = 3;
		arr2[0][1] = 4;
		arr2[0][2] = 5;
		arr2[0][3] = 6;
		
		arr2[1][0] = 7;
		arr2[1][1] = 8;
		arr2[1][2] = 9;
		arr2[1][3] = 10;
		
		arr2[2][0] = 11;
		arr2[2][1] = 12;
		arr2[2][2] = 13;
		arr2[2][3] = 14;
		
		System.out.println("3행 4열 탐색");
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
				
				
				
	
		
		
	}
}

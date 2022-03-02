package chap04.lecture.forloop;

public class C06Array {
	public static void main(String[] args) {
		// 배열(Array)
		// 여러 값을 가진 자료구조(data structure)
		// 특징 : 순서가 있음. 그 순서에 번호를 하나씩 매김(index)
		// 
		
		int i1 = 3; // 하나의 변수에 하나의 값을 대입
		
		int[] arr1 = {10, 20, 30};  // int 배열 타입 : arr1에 여러개의 int 대입
		
		System.out.println(arr1[0]);  // 첫번째 값은 0번 index
		System.out.println(arr1[1]);  // 두번째 값은 1번 index
		System.out.println(arr1[2]);  // 세번째 값은 2번 index
		
		arr1[0] = 100; // 값 재설정
		arr1[2] = 300;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		// 배열의 길이
		System.out.println(arr1.length); // 3
		
		
		
	}
}

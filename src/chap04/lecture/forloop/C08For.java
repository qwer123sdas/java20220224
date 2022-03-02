package chap04.lecture.forloop;

public class C08For {
	public static void main(String[] args) {
		int[] arr1 = {3,1,9,0,7};
		//arr1에 있는 모든 값을 더해서 출력해보시오
		
		int sum = 0;
		for(int i=0; i<arr1.length; i++) {
			sum +=arr1[i];
		}
		System.out.println(sum);
		
		
		
		System.out.println("가장 큰 값 : ");
		// arr1의 값 중, 가장 큰 값을 구해서 출력
		int max = arr1[0];
		for(int i=1; i<arr1.length; i++) { // i=0을 안하는 이유 : 이미 max = arr1[0]이니까
			if(max<arr1[i]) {
				max = arr1[i];
			}
		}
//		for(int i=1; i<arr1.length; i++) {
//			max = (max<arr1[i])? arr1[i] : max;
//		}
		
		System.out.println(max);
		
		
		
		
		System.out.println("가장 작은 값 : ");
		// arr1의 값 중, 가장 작은 값을 출력
		int min = arr1[0];
//		for(int i=1; i<arr1.length-1; i++) {
//			if(min>arr1[i]) {
//				min = arr1[i];
//			}
//		}
		for(int i =0; i<arr1.length; i++) {
			min = (min>arr1[i])? arr1[i] : min;
		}
		System.out.println(min);
		
		
		
	}
}

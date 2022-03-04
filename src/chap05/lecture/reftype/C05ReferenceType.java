package chap05.lecture.reftype;

public class C05ReferenceType {
	public static void main(String[] args) {
		int i1 = 3;
		method1(i1);
		System.out.println("main 메소드 출력");
		System.out.println(i1);   //바뀐 값이 출력 안됨.
		

		int[] arr1 = new int[] {3,2,1};
		method2(arr1);
		System.out.println("main 메소드 배열출력");
		System.out.println(arr1[0]);   //바뀐 값이 출력됨
	}
	
	public static void method2(int[] arr) {  // arr1의 주소를 전달함.
		arr[0] = 30;
		System.out.println("method2 메소드 배열출력");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
	
	public static void method1(int i) {
		i = 5;
		System.out.println("static method1 메소드 출력");
		System.out.println(i);
	}
	

}

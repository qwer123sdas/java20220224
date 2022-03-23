package chap11.lecture.p03wrapper;

public class App05 {
	public static void main(String[] args) {
		Integer i1 = null;
		int i2 = i1; // 자동unboxing : NullpointException이 일어남.
		
		System.out.println("프로그램 계속 실행");
		
		int[] arr =new int[3];
		arr[0]  =3; // int <= int로 들어간 것
		Integer i3 = new Integer(999);
		arr[1] = i3; // auto unboxing
		
		
		// 배열에 double long int을 넣고 싶다.
		double[] arr1= new double[3];
		arr1[0] = 3.15;
		arr1[1] = 2974327L;
		arr1[2] = 12345;
		// 자동형변환 된것.
		
		
		//--------------------------------------------------------------
		// 배열에 Double, Long Integer을 넣고 싶다.
		Number[] arr2 = new Number[3];
		arr2[0] = 3.14;         // auto boxing
		arr2[1] = 294665456L;   //auto boxing
		arr2[2] = 12345;        // auto boxing
		
//		double d1 = arr[0];
		double d1 = (Double)arr2[0]; // auto unboxing
		long i9 = (Long) arr2[1]; // auto unboxing
		int i2 = (Integer)arr[2];// auto unboxing
		
		
	}
}

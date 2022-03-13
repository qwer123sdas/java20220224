package chap06.lecture.p06final;

public class App01 {
	final int i =1; // field
	
	
	public static void main(String[] args) {
		// final : 변수 선언시, 작성하면,  값을 한번만 할당할 수 있도록 함.
		int i =0;
		i =3;
		
		final int j =0;
//		j=2;// 에러 발생
		
		final int k;
		k =9;
//		k=1;에러 발생
		
		method1(3); // 이때만 할당 가능
		method1(10);
	}
	
	public static void method1(final int i) {
//		i = 30; //에러 발생
	}
}

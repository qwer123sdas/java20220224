package chap02.lectur;

public class C14TypeConversion {
	public static void main(String[] args) {
		//정수와 실수끼리 연산한 결과는 실수이다.
		int i1 = 99;
		double d1 = 3.14;
		
//		int i2 = i1+d1; // i1 + d1의 결과가 double이기 때문
		int i2 = (int)(i1+d1);
		double d2 = i1 +d1;
		System.out.println(i2);
		System.out.println(d2);
		
		// 
		int i3 = 7;
		int i4 = 2;
		int i5 = i3 / i4;
		System.out.println(i5); //3
		
		double d3 = i3/i4; //연산의 결과가 이미 3
		System.out.println(d3);  // 3
		
		double d4 = (double)(i3)/(double)(i4);
		System.out.println(d4);
		
	}
}

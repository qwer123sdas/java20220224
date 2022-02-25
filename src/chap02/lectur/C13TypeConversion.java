package chap02.lectur;

public class C13TypeConversion {
	public static void main(String[] args) {
		//실수끼리 연산결과는 큰 타입을 따른다.
		float f1 = 3.14F;
		float f2 = 9.1F;
		float f3 = f1+f2;
		System.out.println(f3);
		
		double d1 = 3.14;
		double d2 = 9.1;
		double d3 = d1+d2;
		System.out.println(d3);

//		뒤에 소수점이 더 붙는 것 근사치로 저장하기 때문에 어쩔 수 없음
		
		float f4 = 3.14F;
		double d4 = 9.1;
//		float f5 = f4 + d4;//오류 , 왜냐하면 f4+d4의 결과가 double이므로 double값을 float에 넣었기 때문
		float f5 = (float)(f4+d4);
		double d5 = f4+d4;
		System.out.println(f5);
		System.out.println(d5);
		
		
		
		
	}
}

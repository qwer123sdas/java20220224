package chap02.lectur;

public class C12TypeConversion {
	public static void main(String[] args) {
		// 산술연산자
		// 정수끼리 연산
		int i1 = 30;
		int i2 = 20;
		
		int i3 = i1+i2;
		
		System.out.println(i1+i2);
		System.out.println(i3);
		
		//정수(byte, short, int)끼리 연산은 결과가 int타입으로 나온다.
		byte b1 = 3;
		byte b2 = 4;
//		byte b3 = b1+b2; // b1+b2의 연산결과가 int이기 때문이다.
		byte b3 = (byte)(b1+b2);
		System.out.println(b1+b2);
		System.out.println(b3);
		
		short s1 = 1000;
		short s2 = 2000;
//		short s3 = s1+s2; // s1+s2의 연산결과가 int이기 때문
		short s3 = (short)(s1+s2);
		int i4 = s1+s2;
		
		System.out.println(s3);
		System.out.println(i4);
		
		//정수 long타입의 연산 결과는 long
		long l1 = 2000000000;
		long l2 = 1000000000;
		long l3 = l1+l2;
		System.out.println(l3);
		
		//서로 다른 타입 끼리 연산할 시, 연산 결과는 큰 타입으로 나온다.
		long l4 = 1000000000;
		int i5 = 100000000;
//		int i6 = l4+i5;
		long l5 = l4 + i5;
		int i6 = (int)(l4+i5);
		System.out.println(l5);  //  300000000
		System.out.println(i6);  // 
		System.out.println(l4*i5);
		
		
		//각 타입의 최소값 최대값
		//byte
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		//short
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		//int
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		//long
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		//float
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(-Float.MIN_VALUE);
		System.out.println(-Float.MAX_VALUE);
		
		//double
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(-Double.MIN_VALUE);
		System.out.println(-Double.MAX_VALUE);
		
		
	}
}

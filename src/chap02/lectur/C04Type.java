package chap02.lectur;

public class C04Type {
	public static void main(String[] args) {
		
//		int v1 = 3.14; // error
		double v1 = 3.14;
		
		//데이터 타입( = 자료형)
		//기본타입(primitive type) : 총 8개 
		
		// 1. 정수 : 0, 1, 33 ,-1, -33
		// byte, short, int, long
		
		// 2. 실수 : 0.123, 13.123
		// float, double
		
		// 3. 논리  : true, false
		// boolean
		
		// 4. 문자(정수)
		//char
		
		
		//참조형 타입(reference type) 위 8개 빼고 다
		//챕터 5에서 설명
		
		//////////////////////////////////////////////
		
		// 1. 정수(byte(1byte), short(2byte), int(4byte), long(8byte))
		int var1 = 30;
		int var2 = Integer.MAX_VALUE;
		System.out.println(var2);  // int의 최대값
		int var3 = 2147483647;
		
		
		int var4 = Integer.MIN_VALUE;
		System.out.println(var4);  // 최소값
		int var5 = -2147483648;
		
//		short var6 = 2147483648; // error
		System.out.println(Short.MAX_VALUE);
		short var7 = 32767; // 최대값
		System.out.println(Short.MIN_VALUE);
		short var8 = -32767; // 최소박
		
		byte var9 = 127; //최대값
		byte var10 = -128; // 최소값
		
		System.out.println(var9);  // 127
		byte var11 = (byte)(var9 +1);
		System.out.println(var11);  // -128
		
		System.out.println(var3+1); //overflow라고함
		
		long var12 = 923874927;
		System.out.println(Long.MAX_VALUE); //9223372036854775807
//		long var13 = 9223372036854775807;
		System.out.println(Long.MIN_VALUE); // -9223372036854775808
//		long var14 = -9223372036854775808;
//		위 2개가 오류인 이유 : int를 넘어 갔기 때문에(기본값을 넘음)
//		그래서 integer 범위보다 큰literal은 끝에 L (이나 l)을 붙여야함.
		long var13 = 9223372036854775807L;
		long var14 = -9223372036854775808L;
		
		//큰 정수 사용시 '_'와 조합 가능
		int var15 = 21_3876_1234;
		int var16 = 2_138_761_234;
		
		
		

		
		
		
	}
}

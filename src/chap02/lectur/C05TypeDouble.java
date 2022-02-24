package chap02.lectur;

public class C05TypeDouble {
	public static void main(String[] args) {
		//실수형 : float(4byte), double(8byte)
		
		double var1 = 3.14;
		System.out.println(var1);
		
//		float var2 = 3.14; //오류
//		이유는 아까 정수형의 long과 비슷하다. 실수 literal은 double이기 때문이다.
//		값이 크기 때문에 float에 들어가지 않는다.
//		long은 넘치기 때문에
//		float도 넘치기 때문
		float var3 = 3.14F; 
		
		double var4 = 5E3; // 5*10^3
		double var5 = 5e3; // 5*10^3
		double var6 = 53-3; //5*10^-3
		
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);  // 0.005
		
	}
}

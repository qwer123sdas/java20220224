package chap02.lectur;

public class C10typeConversion {
	public static void main(String[] args) {
		float f1= 9000.123F;  
		double d1 = 1200000000.1234;
		
		System.out.println(f1);
		System.out.println(d1);
		
		float f2;
		double d2;
		
		f2=f1;
		d2=f1;
		System.out.println(f2);
		System.out.println(d2); // 9000.123보다 더 큰 9000.123046875으로  근사치로 나옴
		
		f2=(float)d1; // type casting
		d2=d1;
		System.out.println(f2);
		System.out.println(d2);
		
		
		
	}
}

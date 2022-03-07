package chap99.codingbat.namGungEx;

public class FactorialTest {
	public static void main(String[] args) {
		System.out.println(factorial01(4));
		System.out.println(factorial02(5));
	}
	
	static long factorial01(int n) {
		long result;
		if(n==1) {
			result = 1;
		}else {
			result = n* factorial01(n-1); // 재귀호출
		}
		
		return result;
	}
	
	static long factorial02(int n) {
		return (n==1) ? 1 : n*factorial02(n-1) ;
		
	}
}

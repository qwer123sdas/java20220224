package chap04.book;

public class ForSumFrom1To10Example {
	public static void main(String[] args) {
		//1부터 100까지의 합을 출력
		int sum =0;
		for(int i=0; i<=100; i++) {
			sum +=i;
		}
		System.out.println(sum);
	}
}

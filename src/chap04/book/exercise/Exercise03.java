package chap04.book.exercise;

public class Exercise03 {
	public static void main(String[] args) {
		//1부터 100까지의 정수 중에서 3의 배수의 총합을 수하는 코드를 작성하기
		int sum =0;
		for(int i=0; i<=100; i++) {
			if((i%3)==0) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}
}

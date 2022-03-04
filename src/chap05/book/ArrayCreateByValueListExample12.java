package chap05.book;

public class ArrayCreateByValueListExample12 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };

		System.out.println("socres[0] : " + scores[0]);
		System.out.println("socres[1] : " + scores[1]);
		System.out.println("socres[2] : " + scores[2]);

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		//add 메소드 활용
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합 : " + sum2);
	}
	
	public static int add(int[]scores) {
		int sum=0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}

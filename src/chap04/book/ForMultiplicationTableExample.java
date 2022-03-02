package chap04.book;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		//구구단 출력
		for(int i=2; i<=9; i++) {
			System.out.println("***" + i + "단 ***");
			for(int j=1; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
		
		
		System.out.println("");
//		9단 ~ 2단
		for(int i=9; i>=2; i--) {
			System.out.println("***" + i + "단 ***");
			for(int j=1; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
		
			
		System.out.println("");
//			9x9 9x8 ~~~2x1로 만들기
		for(int i=9; i>=2; i--) {
			System.out.println("***" + i + "단 ***");
			for(int j=9; j>=1; j--) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
	}
}

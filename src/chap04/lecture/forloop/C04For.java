package chap04.lecture.forloop;

public class C04For {
	public static void main(String[] args) {
		System.out.println("0~4까지 출력");
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
	
		
		System.out.println("1~5까지 출력");
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println("0~10까지 짝수만 출력");
		for(int i=0; i<=10; i+=2) {
			System.out.println(i);
		}
		//if문 사용하기.
		for(int i=0; i<=10; i++) {
			if((i%2)==0) {
				System.out.println(i);
			}
		}
		System.out.println("1~9까지 홀수만 출력");		
		for(int i=1; i<10; i+=2) {
			System.out.println(i);
		}
		//if문 사용하기.
		for(int i=0; i<=10; i++) {
			if((i%2)==1) {
				System.out.println(i);
			}
		}
				
		System.out.println("5~1까지 출력");		// 5 4 3 2 1 
		for(int i=5; i>0; i--) {
			System.out.println(i);
		}
		System.out.println("4~0까지 출력");
		for(int i=4; i>=0; i--) {
			System.out.println(i);
		}
		System.out.println("10~0까지 짝수만 출력");  //10 8 6 4 2 0
		for(int i=10; i>=0; i-=2) {
			System.out.println(i);
		}
		System.out.println("9~1까지 홀수만 출력");  // 9 7 5 3 2 1
		for(int i=9; i>0; i-=2) {
			System.out.println(i);
		}
		
	}
}

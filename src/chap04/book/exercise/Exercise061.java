package chap04.book.exercise;

public class Exercise061 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for(int j=0; j<(i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		// *****
		// ****
		// ***
		// **
		// *
		for(int i=0; i<5; i++) {
			for(int j=5; j>=i+1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		// *****
		//  ****
		//   ***
		//    **
		//     *
		for(int i=0; i<5; i++) {
			for(int k=0; k<i+1; k++){
				System.out.print(" ");
			}
			
			for(int j=5; j>=i+1; j--) {
			
				System.out.print("*");
			}
			
			System.out.println();
		}
			
		
		System.out.println();
			
		//     *
		//    **
		//   ***
		//  ****
		// *****
		for(int i=0; i<5; i++) {
			
			for(int k=5; k>=i+1; k--) {   //int k=0; k<(4-i); k++ 로 할 수 있음
				System.out.print(" ");
			}
			
			for(int j=0; j<(i+1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}

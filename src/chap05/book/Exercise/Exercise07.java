package chap05.book.Exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		int max = array[0]; // Integer.MIN_VALUE;
		
		for(int i=0; i<array.length; i++) {
			if(max< array[i]) {
				max = array[i];
			} else if(max>array[i] )
				max = max +0;
			}
		
		
		
		System.out.println("max : " + max);
		}
		
	}


package chap04.lecture.switchcase;

public class C01Switch {
	public static void main(String[] args) {
		
		System.out.println("stmt 1");
		
		switch (2) {   //(key)의 key값에서부터 시작한다.
		case 1:
			System.out.println("stmt2");   
		case 2:
			System.out.println("stmt3");  //
		case 3:	
			System.out.println("stmt4");
		}
		
		System.out.println("stmt 5");
	}
}

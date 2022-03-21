package chap10.lecture.p02try;

public class App08 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,0};
		
		try {
			int r1 = arr1[0] / arr1[1];
			int r2 = arr1[0] / arr1[2];
			System.out.println(r1);
			
		}catch(ArithmeticException | NullPointerException e) {
			System.out.println("아리스메틱익셉션 또는 널포인터 익셉션발생");
			System.out.println(e.getMessage());
			System.out.println(e instanceof ArithmeticException);
			System.out.println(e instanceof NullPointerException);
			//
			e.printStackTrace(); // 익셉션객체의 타입 ,메세지, 발생된 코드가 어디인지 알려주는 메소드.
		}
		// catch블럭 여러개 작성시, 하위타입보다 상위타입을 아래에 작성해야한다ㅣㅣ.
		
		System.out.println("프로그램 실행 계속");
	
	}
}

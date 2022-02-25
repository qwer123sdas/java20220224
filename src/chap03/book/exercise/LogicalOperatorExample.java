package chap03.book.exercise;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		System.out.println(charCode + 0);
		
		//비교연산자의 기본형은 int타입이라서 char타입이 자동형변환이 된 것
		if( (charCode>=65) & (charCode<=90) ) {
			 System.out.println("대문자입니다");
		}
		
		
		if( (charCode>=97) && (charCode<=122)) {
			System.out.println("소문자 입니다.");
		}
		
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2또는 3의 배수 입니다.");
		}
		
		if((value%2==0)||(value%3==0)) {
			System.out.println("2또는 3의 배수입니다.");
		}
		
		
		
		
	}
}

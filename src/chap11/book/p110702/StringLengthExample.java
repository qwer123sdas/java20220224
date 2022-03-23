package chap11.book.p110702;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞다");
		}else {
			System.out.println("주민번호 자리ㅏ수가 아니다");
		}
	}
}	

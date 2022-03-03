package chap04.lecture.scanner;

import java.util.Scanner; //

public class C01Scanner {
	public static void main(String[] args) {
		// 키보드 입력준비
		Scanner scanner;
		scanner = new Scanner(System.in); // 생성자 : Systme.in : 컴퓨터에 있는 기본 입력장치(=키보드)
		
		String line = scanner.nextLine(); //enter를 만날 때까지 키보드에 입력한 값이 문자열로 리턴된다는 메소드
		
		System.out.println(line);
		System.out.println(123);
		// 스캐너 닫기
		scanner.close(); 
	}
}

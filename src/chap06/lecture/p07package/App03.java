package chap06.lecture.p07package;


// 같은 패키지에 있는 클래스는 import키워드 생략 가능함.
// java.lang 패키지에 있는 클래스는 import 생략 가능함.

import java.util.Scanner;

public class App03 {
	public static void main(String[] args) {
		chap06.lecture.p07package.App01 a1;
		// import키워드 조차 생략 가능함
		App01 a2;
		
		
		// java.lang 패키지에 있는 클래스
		java.lang.String str1 = "java";
		String str2 = "spring";
		
		java.util.Scanner scanner1;
		Scanner scanner2;  // 애는 import시켜주어야 함.  ctrl + shift + o
		
	}
}

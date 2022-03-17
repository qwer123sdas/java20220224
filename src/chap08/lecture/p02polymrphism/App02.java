package chap08.lecture.p02polymrphism;

import java.io.Closeable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Scanner;



public class App02 {
	public static void main(String[] args) {
		String str = "java";
		Object o1 = str; // 자동형변환(참조값으로)
		Serializable s1 =str; // 참조값이 자동형변환
		CharSequence c1 = str; // 참조값이 자동형변환
		Comparable<String> com1 = str; // 참조값이 자동형변환
		
		Serializable s2 = "spring"; // 참조값이 자동형변환
		CharSequence c2 = "hello"; // 참조값이 자동형변환
		Comparable<String> com2 = "jsp"; // 참조값이 자동형변환
		
		// Scanner
		Scanner scanner = new Scanner("");
		Object o2 = scanner;
		Closeable ccl = scanner;
		AutoCloseable ac= scanner;
		Iterator<String> iter = scanner;
		
	}
}

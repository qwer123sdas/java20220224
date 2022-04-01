package chap18.lecture.p01inputstream;

import java.io.*;

public class App01 {
	public static void main(String[] args) throws Exception{
		// InputStream : 데이터 입력 처리 클래스
		// 이는 추상클래스여서 자식클래스로 객체 구현
		String fileName = "src/chap18/lecture/p01inputstream/App01.java";
		
		InputStream is = new FileInputStream(fileName);
		
		// read메소드 : 한 바이트 읽는 메소드
		int byte1 = is.read();
		int byte2 = is.read();
		int byte3 = is.read();
		
		System.out.println(byte1); // file 내용물
		System.out.println(byte2); // 한 개의 파일이 여러개이 byte로 되어있기 떄문
		System.out.println(byte3);
		
		
		
	}
}

package chap18.lecture.p05file;

import java.io.*;

public class App01 {
	public static void main(String[] args) {
		// File : file관련 기능이 있는 클래스 
		String path = "src/chap18/lecture/p05file/App01.java";
		File file = new File(path);
		
		// exists() 메소드 : file이 존재하는지 여부 확인, 리턴타입 boolean
		System.out.println(file.exists());
		
		// isDirectory() : directory 인지 여부 확인,  리턴타입 boolean
		System.out.println(file.isDirectory());
		
		// isFile() : file인지 여부 확인, 리턴타입 boolean 
		System.out.println(file.isFile());
		
		// length() : file의 크기
		System.out.println(file.length());
		
	}
}

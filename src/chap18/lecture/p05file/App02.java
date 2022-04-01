package chap18.lecture.p05file;

import java.io.*;

public class App02 {
	public static void main(String[] args) {
		String path = "output/참조타입01_copy.png";
		File file1 = new File(path);
		
		System.out.println(file1.exists()); // true'
		// 있는 파일 지우기 메소드
		file1.delete();
		
		System.out.println(file1.exists()); // false
		
		path = "output/other";
		File file2 = new File(path);
		// 하나의 폴터를 만드는 메소드
		file2.mkdir();
		
		// 폴더 안에 여러 폴더 만드는 메소드
		path = "output/othe1/other2/other3";
		File file3 = new File(path);
		file3.mkdirs();
		
		
	}
}

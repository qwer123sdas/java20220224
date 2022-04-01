package chap18.book.p180402;

import java.io.FileInputStream;

public class FileInputsStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/JavaProgramming/source/chap18/src/sec04/exam02_fileinputstream/FileInputStreamExmple.java");
			int data;
			while( (data = fis.read()) != -1) {
				System.out.println(data);
			}
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

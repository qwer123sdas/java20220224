package chap18.book.p180403;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/JavaProgramming/source/chap18/src/sec04/exam03_fileoutputstream/house.jpg";
		
		String targetFileName = "C:/Temp/house.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readyByteNo;
		byte[] readByte = new byte[100];
		while( (readyByteNo = fis.read(readByte)) != -1) {
			fos.write(readByte, 0, readyByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사 완료");
		
	}
}

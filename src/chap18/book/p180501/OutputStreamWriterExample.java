package chap18.book.p180501;

import java.io.*;

public class OutputStreamWriterExample {
	public static void main(String[] args) throws Exception{
		
		String file = "output/file_temp.txt";
		FileOutputStream fos = new FileOutputStream(file);
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일 저장 완료");
		
	}
}

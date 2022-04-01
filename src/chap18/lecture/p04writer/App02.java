package chap18.lecture.p04writer;

import java.io.*;

public class App02 {
	public static void main(String[] args) {
		// 텍스트 파일 복사
		
		// 원본 파일
		String origin = "src/chap18/lecture/p04writer/App02.java";
		// 복사 파일
		String des = "output/WriterEx02.txt";
		
		try(Reader rd = new FileReader(origin);
				Writer wr = new FileWriter(des);) {
			int data = 0;
			while((data = rd.read()) != -1){
				wr.write(data);
			}
			
			wr.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("복사완료");
	}
}

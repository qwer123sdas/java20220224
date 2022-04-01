package chap18.lecture.p04writer;

import java.io.*;

public class App03 {
	public static void main(String[] args) {
		// 그림파일 복사
		
		// Reader, Writer사용하지마세요.
		String origin = "picture/다형성01.png";
		String copy = "output/다형성01_copy.png"; 
		
		try(Reader rd = new FileReader(origin);
				Writer wr = new FileWriter(copy)) {
			int data = 0;
			while((data = rd.read()) != -1){
				wr.write(data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}
}

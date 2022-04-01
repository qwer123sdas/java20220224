package chap18.lecture.p02outstream;

import java.io.*;

public class App04 {
	public static void main(String[] args) {
		String inputFile = "picture/다형성01.png";
		String outputFile = "output/다형성01복사.png";
		
		int data = 0;
		try(InputStream is = new FileInputStream(inputFile);
				OutputStream os = new FileOutputStream(outputFile);){
			while((data = is.read()) != -1) {
				os.write(data);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}

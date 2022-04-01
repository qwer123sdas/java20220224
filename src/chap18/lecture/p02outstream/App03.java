package chap18.lecture.p02outstream;

import java.io.*;

public class App03 {
	public static void main(String[] args) {
		String inputFile = "src/chap18/lecture/p02outstream/App03.java";
		String outputFile = "output/OutputStreamEx03.txt";
		
		try(InputStream is = new FileInputStream(inputFile);
				OutputStream os = new FileOutputStream(outputFile);){
			int data = 0;
			while((data = is.read()) != -1) {
				os.write(data);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료!");
	}
}

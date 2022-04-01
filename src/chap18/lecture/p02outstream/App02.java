package chap18.lecture.p02outstream;

import java.io.*;

public class App02 {
	public static void main(String[] args) {
		
		String inputFile = "src/chap18/lecture/p02outstream/App02.java";
		String outputFile = "output/OutputStreamEx02.txt";
		
		try(InputStream is = new FileInputStream(inputFile);
				OutputStream os = new FileOutputStream(outputFile);){
			
			int data1 = is.read();
			os.write(data1);
			
			int data2 = is.read();
			os.write(data2);
			
			int data3 = is.read();
			os.write(data3);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료!");
	}
}

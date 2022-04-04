package chap18.lecture.p06filter;

import java.io.*;

public class App06 {
	public static void main(String[] args) {
		// BufferedReader, BufferedWriter 사용해서
		// output/FilterExample51.txt
		// output/FilterExample6.txt로 복사
		
		String path = "output/FilterExample51.txt";
		String ot = "output/FilterExample6.txt";
		
	
		try(Reader rd = new FileReader(path);
				Writer writer = new FileWriter(ot);
				BufferedReader br = new BufferedReader(rd);
				BufferedWriter bw = new BufferedWriter(writer);){
			
			int len = 0;
			while((len = br.read()) != -1) {
				bw.write(len);
			}

		}catch (Exception e){
			e.printStackTrace();
		}
		
		
	}
	

}

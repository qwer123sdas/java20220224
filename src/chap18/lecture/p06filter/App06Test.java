package chap18.lecture.p06filter;

import java.io.*;


public class App06Test {
	public static void main(String[] args) {
		copyNormal();
		copyBuffered();
		
	}
	
	private static void copyNormal() {
		String path = "output/FilterExample51.txt";
		String ot = "output/FilterExample6-1NormalTest.txt";
		
		try(Reader rd = new FileReader(path);
				Writer wr = new FileWriter(ot);){
			
			int len = 0;
			
			long start = System.currentTimeMillis();
			while((len = rd.read()) != -1) {
				wr.write(len);
			}
			long end = System.currentTimeMillis();
			System.out.println(end - start);
			
			

		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	private static void copyBuffered() {
		String path = "output/FilterExample51.txt";
		String ot = "output/FilterExample6-2BufferedTest.txt";
		
	
		try(Reader rd = new FileReader(path);
				Writer writer = new FileWriter(ot);
				BufferedReader br = new BufferedReader(rd);
				BufferedWriter bw = new BufferedWriter(writer);){
			
			int len = 0;
			
			long start = System.currentTimeMillis();
			while((len = br.read()) != -1) {
				bw.write(len);
			}
			long end = System.currentTimeMillis();
			System.out.println(end - start);

		}catch (Exception e){
			e.printStackTrace();
		}
	}
}

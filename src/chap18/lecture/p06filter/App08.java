package chap18.lecture.p06filter;

import java.io.*;

public class App08 {
	public static void main(String[] args) {
		String out = "output/FilterExample8.txt";
		
		try(OutputStream os = new FileOutputStream(out);
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));){
			
			for(int i=0; i<100000000; i++) {
				bw.write('가');
			}
//			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("끝남");
		
		
		// 문자 단위 출력단위 스트림으로 변환
	}
}	

package chap18.lecture.p01inputstream;

import java.io.*;

public class App02 {
	public static void main(String[] args) throws Exception{
		String path = "src/chap18/lecture/p01inputstream/App02.java";
		
		InputStream is =new FileInputStream(path);
		
		int read = 0;
		
		int cnt = 0;
		while((read = is.read()) != -1){
			System.out.println(read);
//			is.read(); // read할 범위를 넘으면 -1이 뜸  if the end of thestream is reached.
			cnt++;
		}
		
		System.out.println(cnt);
		
	}
}

package chap18.book.p180502;

import java.io.*;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception{
		long start = 0;
		long end = 0;
		
		String path = "src/chap18/book/p180501/InputStreamReaderExample.java";
		FileInputStream fis1 = new FileInputStream(path);
		
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때 : " + (end -start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		System.out.println("사용했을 때 : " + (end -start) + "ms");
		
		bis.close();
		fis2.close();
		
	}
}

package chap18.book.p180502;

import java.io.*;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		String path = "picture/다형성01.png";
		String endF = "output/다형성01임시00.png";
		fis = new FileInputStream(path);
		fos = new FileOutputStream(endF);
		
		start = System.currentTimeMillis();
		while( (data=fis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		
		fos.close();
		fis.close();
		fis.close();
		System.out.println("사용하지 않을 때 : " + (end-start) + "ms");
		
		//
		
		String path1 = "picture/다형성01.png";
		String endF1 = "output/다형성01임시01.png";
		fis = new FileInputStream(path1);
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream(endF1);
		bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		while( (data = bis.read())!= -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close(); fos.close(); bis.close(); fis.close();
		System.out.println("사용할 때 : " + (end-start) + "ms");
		
		
		
	}
}

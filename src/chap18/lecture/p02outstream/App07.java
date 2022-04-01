package chap18.lecture.p02outstream;

import java.io.*;


public class App07 {
	public static void main(String[] args) {
		// 원본파일 : "picture/참조타입01.png"
		// 복사파일 : "output/참조타입01_copy.png"
		
		String in = "picture/참조타입01.png";
		String out =  "output/참조타입01_copy.png";
		
		try(InputStream is = new FileInputStream(in);
				OutputStream os = new FileOutputStream(out);){
			byte[] datas = new byte[100];
			int len = 0;
			while((len = is.read(datas)) != -1) {
				os.write(datas, 0, len);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

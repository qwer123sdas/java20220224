package chap18.lecture.p02outstream;

import java.io.*;

public class App06 {
	public static void main(String[] args) throws Exception{
		String in = "src/chap18/lecture/p02outstream/App06.java";
		String out = "output/OutputStreamEx06.txt";
		
		InputStream is = new FileInputStream(in);
		OutputStream os = new FileOutputStream(out);
		
		byte[] datas = new byte[100];
		int len =0;
		
		while((len = is.read(datas)) != -1) {
			os.write(datas, 0, len);
		}
		
		os.close();
		is.close();
		
	}
}

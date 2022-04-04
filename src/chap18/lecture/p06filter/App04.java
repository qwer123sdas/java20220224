package chap18.lecture.p06filter;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class App04 {
	public static void main(String[] args) throws Exception{
		String path = "output/FilterStream04.txt";
		
		OutputStream os = new FileOutputStream(path);
		Writer wirter = new OutputStreamWriter(os);
		
		os.write('a');
		wirter.write('가');
		
		
		wirter.close();
		os.close();
		
	}
}

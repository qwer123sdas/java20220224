package chap18.book.excercise;

import java.io.*;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
		//정확한 경로로 수정
		String filePath = "src/chap18/book/excercise/BufferedReaderExample.java";
		
		// 작성위치
		InputStream rd = new FileInputStream(filePath);
		InputStreamReader is = new InputStreamReader(rd);
		BufferedReader br = new BufferedReader(is);
		
		String line = "";
		int lineNumber = 1;
		while( (line = br.readLine())!= null) {
			System.out.println(lineNumber + ": " + line);
			lineNumber++;
		}
		
		br.close(); is.close(); rd.close();
		
	}
}

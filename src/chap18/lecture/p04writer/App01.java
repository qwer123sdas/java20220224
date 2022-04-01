package chap18.lecture.p04writer;

import java.io.*;

public class App01 {
	public static void main(String[] args) {
		// Writer : 문자단위 출력 스트림
		String path = "output/WriterEx1.txt";
		try(Writer wr = new FileWriter(path);) {
			wr.write('a');
			wr.write('z');
			wr.write('한');  // 2byte
			wr.write('글');  // 2byte
			
			wr.write("우크라이나");
			
			wr.write(new char[] {'자', '바', '스', '프', '링'});
			wr.write(8800);
			wr.write('\u2260');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램종료");
	}
}

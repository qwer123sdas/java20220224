package chap18.lecture.p03reader;

import java.io.*;
import java.util.Arrays;

public class App05 {
	public static void main(String[] args) {
		String file = "src/chap18/lecture/p03reader/App05.java";
		
		try(Reader rd = new FileReader(file);) {
			char[] datas = new char[10];
			int len = 0;
			while((len = rd.read(datas))!= -1) {
				System.out.println(Arrays.toString(datas));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//텍스트데이터를파일에저장할때사용하는문자기반스트림이다
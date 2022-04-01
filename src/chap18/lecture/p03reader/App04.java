package chap18.lecture.p03reader;

import java.io.*;
import java.util.Arrays;

public class App04 {
	public static void main(String[] args) {
		String name = "src/chap18/lecture/p03reader/App04.java";
		
		try (Reader rd = new FileReader(name);){
			char[] datas = new char[10];
			
			rd.read(datas);
			System.out.println(Arrays.toString(datas));
			rd.read(datas);
			System.out.println(Arrays.toString(datas));
			rd.read(datas);
			System.out.println(Arrays.toString(datas));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

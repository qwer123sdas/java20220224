package chap10.lecture.p04throw;

import java.io.FileReader;
import java.io.IOException;

public class App09 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void method1() throws Exception{  // Exception으로 퉁치는 것.
		FileReader fr = new FileReader(""); // FileNotFoundException
		fr.read(); // IOException
		
		Class.forName(""); // ClassNotFOundException
	}
}

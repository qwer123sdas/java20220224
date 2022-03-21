package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App05 {
	public static void main(String[] args) {
		FileReader fr;
//		fr = new FileReader("");
//		fr.read();
		
		
		try {
			fr = new FileReader("");
			fr.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		


		

	}
}

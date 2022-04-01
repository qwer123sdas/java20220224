package chap18.lecture.p02outstream;

import java.io.*;

public class App05 {
	public static void main(String[] args) {
		String path = "output/OutputStreamEx05.txt";
		try(OutputStream os = new FileOutputStream(path);
				) {
			byte[] datas = {3, 9, -120, 127, 99, 98, 12};
//			write(쓸 정보, 배열시작위치, 배열종료위치); 
			os.write(datas, 0, 3); // 3, 9, -120
			os.write(datas, 1, 4);  // 9,-120, 127, 99
			                       // 총 7byte 생성
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("쓰기종료");
		
		try(InputStream is = new FileInputStream(path) ){
			System.out.println((byte)is.read());
			System.out.println((byte)is.read());
			System.out.println((byte)is.read());
			System.out.println((byte)is.read());
			System.out.println((byte)is.read());
			System.out.println((byte)is.read());

		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}

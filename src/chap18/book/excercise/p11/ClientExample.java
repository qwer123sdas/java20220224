package chap18.book.excercise.p11;

import java.io.*;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception{

		Socket socket = new Socket("localhost", 5001);
		OutputStream os = socket.getOutputStream();

		String filePath = "picture/다형성01.png";
		File file = new File(filePath);

		String fileName = file.getName();
		

		System.out.println("[파일보내기 시작]" + fileName);
		
		//  
		
		BufferedOutputStream fis = new BufferedOutputStream(os);
		fis.write(fileName.getBytes());
		fis.flush();
		
		
		System.out.println("파일보내기 완료");
		
		fis.close();
		os.close();
		socket.close();

	}
}

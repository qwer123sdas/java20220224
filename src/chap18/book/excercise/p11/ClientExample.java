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
		
		//  글씨 보내기
		BufferedOutputStream fis = new BufferedOutputStream(os);
		fis.write(fileName.getBytes());
		fis.flush();
		
		//파일 데이터 보내기
		// write나 output은 저장 할 때 쓰는 것이고, reader나 Input은 기존 파일을 읽어 오는 것 아닌가
		// 그러면 서버-클라이언트 사이에서, 클라이언트의 파일을 서버에서 읽는 것이 reader, input이고
		// 보내는게 write output???????????
		InputStream is = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(is);
		int data = 0;
		byte[] bytes = new byte[100];
		while((data = bis.read()) != -1) {
			fis.write(bytes);
		}
		
		
		
		
		
		
		
		System.out.println("파일보내기 완료");
		
		
		is.close();
		//
		fis.close();
		os.close();
		socket.close();

	}
}

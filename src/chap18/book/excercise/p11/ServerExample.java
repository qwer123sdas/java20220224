package chap18.book.excercise.p11;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception {

		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("localhost", 5001));

		System.out.println("[서버시작]");

		try {
			Socket socket = serverSocket.accept();
			InputStream is = socket.getInputStream();
			BufferedInputStream br = new BufferedInputStream(is);
			
			// 글씨 받기
			byte[] bytes = new byte[1000];
			int readByteCount = -1;

			String fileName = "";
			if ((readByteCount = br.read(bytes)) != -1) {
				fileName = new String(bytes, 0, readByteCount);
			}
			fileName = fileName.trim();		
			
			
			
			System.out.println("[파일받기 시작] : " + fileName);
			// 파일 받기
			String path = "output/p11확인문제사진.jpg";  // 파일 데이터를 받고  이 폴더에 저장
			OutputStream os = new FileOutputStream(path);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			
			byte[] bytes2 = new byte[1000];
			readByteCount = -1;
			while((readByteCount = br.read(bytes))!= -1) {
				bos.write(bytes2);
			}
			System.out.println("[파일받기완료]");
			
			bos.close();
			os.close();
			//
			br.close();
			is.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("서버종료");

	}
}

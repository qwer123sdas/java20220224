package chap18.book.excercise.p11;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

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

			String name = "";
			if ((readByteCount = br.read(bytes)) != -1) {
				name = new String(bytes, 0, readByteCount);
			}
			System.out.println("[파일받기 시작] : " + name);
			
			
			// 파일 받기
			byte[] bytes2 = new byte[1000];
			readByteCount = -1;
			if((readByteCount = br.read(bytes))!= -1) {
				
			}
			
			

			//				fileName = fileName.trim();
			//				System.out.println("[파일받기 시작]" + fileName);

			System.out.println("[파일받기완료]");

			br.close();
			is.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("서버종료");

	}
}

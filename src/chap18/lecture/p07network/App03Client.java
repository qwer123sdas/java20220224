package chap18.lecture.p07network;

import java.io.*;
import java.net.*;

public class App03Client {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket();
		socket.connect(new InetSocketAddress("172.30.1.27", 38080));
		
		System.out.println("[서버와 연결 성공]");
		
		// 받기
		System.out.println("[서버로 파일 보내기 시작]");
		String path = "picture/참조타입06.png";
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		
		// 쓰기
		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		byte[] datas = new byte[1042];
		int len = 0;
		while((len = bis.read(datas))!=-1) {
			bos.write(datas, 0, len);
		}
		System.out.println("[서버로 파일 전송 종료]");
		
		bos.close();
		os.close();
		bis.close();
		fis.close();
		socket.close();
		System.out.println("클라이언트프로그램 종료");
	}
}

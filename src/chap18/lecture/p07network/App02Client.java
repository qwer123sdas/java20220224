package chap18.lecture.p07network;

import java.io.*;
import java.net.*;

public class App02Client {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket();
		socket.connect(new InetSocketAddress("172.30.1.21", 38080), 5000);
		System.out.println("[서버로 연결 성공]");
		
		OutputStream os = socket.getOutputStream();
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(wr);
		
		System.out.println("[서버로 메세지 전송]");
		bw.write("서버님 반갑습니다.");
		bw.newLine();
		
		bw.close(); wr.close(); os.close(); 
		socket.close();
		System.out.println("클라이언트 프로그램 종료");
	}
}

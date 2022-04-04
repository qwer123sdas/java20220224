package chap18.lecture.p07network;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.io.*;
import java.net.Socket;

public class App01Server {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.21", 38080));
		
		System.out.println("[연결 기다림]");
		Socket socket = serverSocket.accept();
		
		System.out.println("[서버쪽 소켓 생성됨]");
		
		OutputStream os = socket.getOutputStream();
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(wr);
		
		bw.write("클라이언트님 반갑습니다.");
		
		
		bw.close();
		wr.close();
		os.close();
		socket.close();
		serverSocket.close();
		
		
		System.out.println("프로그램 종료");
	}
}

package chap18.lecture.p07network;

import java.io.*;
import java.net.*;

public class App04Server {
	public static void main(String[] args) {
		
		try (ServerSocket serverSocket = new ServerSocket();){
			serverSocket.bind(new InetSocketAddress("172.30.1.21", 38080));
			
			System.out.println("[클라이언트 연결 기다림]");
			Socket socket = serverSocket.accept();
			
			System.out.println("[클라이언트와 연결 성공]");
			
			
			try(InputStream is = socket.getInputStream();
					Reader rd = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(rd);){
				
				String data = "";
				while(!(data = br.readLine()).equals("exit")) {
					System.out.println("[클라이언트] : " + data);
				}
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}
}

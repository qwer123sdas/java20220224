package chap18.lecture.p07network;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class App04Client {
	public static void main(String[] args) {
		
		try(Socket socket = new Socket();
) {
			socket.connect(new InetSocketAddress("172.30.1.21", 38080), 5000);
			System.out.println("[서버와 연결 성공]");
			
			OutputStream os = socket.getOutputStream();
			Writer wr = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(wr);
			
			Scanner scanner = new Scanner(System.in);
			String data = "";
			while(true) {
				
				System.out.print("입력 > ");
				data = scanner.nextLine();
				bw.write(data);
				bw.newLine();
				bw.flush();
				if(data.equals("exit")) {
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("클라이언트 프로그램 종료!");
		
	}
}

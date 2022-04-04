package chap18.lecture.p07network;

import java.io.*;
import java.net.*;

public class App05Server {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.21", 38080));
		
		// 여러 클라이언트와 연결할 것
		boolean run = true;
		while(run) {
			Socket socket = serverSocket.accept();
			Thread thread = new Thread( ()-> {
			try(InputStream is = socket.getInputStream();
					Reader rd = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(rd);){
				
				String data = "";
				while(!(data = br.readLine()).equals("exit")) {
				System.out.println(socket.getRemoteSocketAddress() + "[클라이언트왈] : " + data);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			});
		}
	}
}





package chap18.lecture.p07network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.Socket;

public class App01Client {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket();
		
//		socket.connect(endpoint, timeout);
//		                           위치
		socket.connect(new InetSocketAddress("172.30.1.21", 38080), 5000);
		System.out.println("[클라이언트쪽 소켓 생성됨]");
		
		InputStream is = socket.getInputStream();
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		char[] datas = new char[1042];
		int len = br.read(datas);
		System.out.println(new String(datas, 0, len));
		
		br.close(); rd.close(); is.close();
		
		
		if(socket != null) {
			socket.close();
		}
		
		System.out.println("프로그램 종료");
	}
}

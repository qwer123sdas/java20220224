package chap18.book.p180703;

import java.net.*;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		
		try{
			socket = new Socket();
			System.out.println("[연결요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결성공]");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

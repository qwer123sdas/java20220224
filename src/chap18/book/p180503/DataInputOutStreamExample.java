package chap18.book.p180503;

import java.io.*;

public class DataInputOutStreamExample {
	public static void main(String[] args) {
		
		String path = "output/primitive.txt";
		try(FileOutputStream fos = new FileOutputStream(path);
				DataOutputStream dos = new DataOutputStream(fos);){
			
//			dos.writeUTF("홍길동");
			dos.writeDouble(95.5);
			dos.writeInt(1);
			
//			dos.writeUTF("감자바");
			dos.writeDouble(90.3);
			dos.writeInt(2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream(path);
				DataInputStream dis = new DataInputStream(fis);){
			
			for(int i=0; i<2; i++) {
//				String name = dis.readUTF();
				double score = dis.readDouble();
				int order = dis.readInt();
//				System.out.println(name + " : " + score + " : " + order);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

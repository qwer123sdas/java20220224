package chap11.book.p110701;

import java.io.IOException;
import static java.lang.Math.*;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException{
		byte[] bytes = new byte[100];
		System.out.println("입력 : ");
		int readByteNo = System.in.read(bytes);
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
		
		System.out.println(PI);
	}
}

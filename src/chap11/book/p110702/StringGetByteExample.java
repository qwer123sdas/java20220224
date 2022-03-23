package chap11.book.p110702;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes.length : " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("byte->String : " + str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("byte2.length : " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String : " + str2);
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}

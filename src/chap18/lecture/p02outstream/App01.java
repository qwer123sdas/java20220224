package chap18.lecture.p02outstream;

import java.io.*;

public class App01 {
	public static void main(String[] args) {
		// OutputStream : byte 단위 출력할 때 사용하는 클래스
		String fileName = "output/OutputStreamEx01.txt";
		
		try(OutputStream os = new FileOutputStream(fileName);){
			os.write(99); // 1byte를 쓰기(int는 4byte이기 떄문에 마지막 1 byte의 값만 처리)
			os.write(999999999); // 1byte쓰기
			os.write(98798798); // 1byte쓰기
		}catch(IOException e) {
			e.printStackTrace();
		}
//		os.close();
		
		System.out.println("프로그램 종료....");
	}
}

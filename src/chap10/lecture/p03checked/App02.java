package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App02 {
	public static void main(String[] args) {
		String s = "10 a";

		int i = Integer.parseInt(s); // NumberFormatException이 발생할 수도 있는 코드
		// NumberFormatException은 RuntimeException(unchecked exception)이어서 컴파일러가 검사안함.

		try {
			FileReader file = new FileReader("");
			// FileNotFoundException 발생할 수도 있는 코드
			// FileNotFoundException은 RuntimeException을 상속받지 않았으므로, checked exception이다.
			// 그래서 컴파일러가 검사함.(check)

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

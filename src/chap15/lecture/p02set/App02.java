package chap15.lecture.p02set;

import java.util.*;

public class App02 {
	public static void main(String[] args) {
		// 로또 : 1~45의 임의의 값 6개
		// 임의의 값 6개를 중복없이 출력하는 코드 작성

		Set<Integer> set = new HashSet<>();

		while(set.size()<6) {
			int num = (int) (Math.random() * 45) + 1;

			set.add(num);
		}
		
		

		int i = 1;
		for (int item : set) {
			System.out.println("로또번호" + i + " : " + item);
			i++;

		}

	}
}

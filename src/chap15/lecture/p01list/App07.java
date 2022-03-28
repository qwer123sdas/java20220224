package chap15.lecture.p01list;

import java.util.*;

public class App07 {
	public static void main(String[] args) {
		// ArrayList만들고
		//  0~99까지 integer를 element로 추가하는 코드 만들기
		List<Integer> list1 = new ArrayList<>();
		for(int i=0; i<100; i++) {
			list1.add(i);
		}
		System.out.println(list1);
		
		
		// 99부터 0까지의 Integer를 element로 추가
		List<Integer> list2 = new ArrayList<>();
		for(int i =99; i>=0; i--) {
			list2.add(i);
		}
		System.out.println(list2);
		 
	}
}

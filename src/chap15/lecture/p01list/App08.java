package chap15.lecture.p01list;

import java.util.*;

public class App08 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i =0; i<10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		//  각 element를 2배 값으로 변경
		for(int i = 0; i<10; i++) {
			list.set(i, list.get(i)*2);
		}
		System.out.println(list);
		
		list.replaceAll(e -> e *2);
		System.out.println(list);
	}
}

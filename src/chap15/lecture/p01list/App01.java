package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Collections;

public class App01 {
	public static void main(String[] args) {
		// List : 순서가 있고, 중복 저장 가능
		// 구현 클래스 : ArrayList
		ArrayList<String> list1 = new ArrayList<>();
		// 1. add(E e) : element 를 추가 + 순서가 있는 클래스라서 넣은 순서대로 값이 들어감
		// 넣을 때 마다 길이가 늘어나서 배열처럼 미리 길이를 지정안해줘도 됨
		list1.add("java");  // [0]
		list1.add("Spring");  // [1]
		list1.add("jsp");     // [2]
		
		//2. get(int index) : 꺼낼 땐 E의 타입
		String e1 = list1.get(0);
		String e2 = list1.get(1);
		String e3 = list1.get(2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		// 3. 길이를 리턴
		int length = list1.size();
		System.out.println(length);
		
		//for문으로 탐색
		for(int i = 0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		// 향상된 포문 사용
		for(String str : list1) {
			System.out.println(str);
		}
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("");
		list2.add("");
		list2.add("");
		Collections.copy(list2, list1);
		System.out.println(list2);
		
	}
}

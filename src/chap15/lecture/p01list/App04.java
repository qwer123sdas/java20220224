package chap15.lecture.p01list;

import java.util.*;

public class App04 {
	// List : 순서가 있고 중복허용 가능
	// 구현 클래스 : ArrayList, Vector, LinkedList
	// 주로 ArrayList사용
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		
		// element추가
		list1.add("jimin"); // index 0
		list1.add("v");     // index 1
		list1.add("jungkuk"); // index 2
		
		// element 탐색
		String s1 = list1.get(0);
		String s2 = list1.get(1);
		String s3 = list1.get(2);
//		String s4 = list1.get(3); // 예외 발생
		System.out.println(s1 +" "+ s2+ " " + s3);
		
		// element 변경
//		list1.set(index, element);
		list1.set(0, "suga");
		System.out.println(list1);
		
		// element 삭제
//		list1.remove(index);
		list1.remove(1);

		System.out.println(list1);
		System.out.println("바뀐get(1) : " + list1.get(1));
	}
	
}

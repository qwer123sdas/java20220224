package chap15.lecture.p02set;

import java.util.*;

public class App01 {
	public static void main(String[] args) {
		// Set : 순서 없고, 중복허용 x
		// 대표적 구현 클래스 : HashSet
		
		Set<String> set = new HashSet<>();
		
		//add : element추가
		set.add("jimin");
		set.add("suga");
		set.add("jin");
		set.add("rm");
		
		// size : 크기
		System.out.println(set.size());  // 4 
		
		set.add("rm");
		System.out.println(set.size());  // 4, 왜냐하면 중복허용을 안하기 때문
		
		// 탐색
		// index가 없기 때문에 getter 메소드가 없음
		// 따라서 1. 향상된 for문을 써야함
		for(String item : set) {
			// 순서가 보장이 안되서 내가 저장시킨 순서랑 다를 수 있음.
			System.out.println(item);
		}
		
		// 2. Iterator
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		// 삭제 : remove
		set.remove("rm");
		System.out.println(set.size());
		set.remove("winter");
		System.out.println(set.size()); // 없는 걸 지웠기 때문에 그대로
		
		// element 있는지 확인
		System.out.println(set.contains("rm")); // false
		System.out.println(set.contains("jin")); // true
		
		
		
	}
}

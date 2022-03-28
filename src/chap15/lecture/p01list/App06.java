package chap15.lecture.p01list;

import java.util.*;

public class App06 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("spring");
		list.add("java");
		list.add("hello");
		list.add("lunch");
		
		// List 탐색 방법
		// 그냥 for
		System.out.println(" ");
		System.out.println("# 그냥 for문");
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}

		
		// 향상된 for
		System.out.println("");
		System.out.println("# 향상된 for문");
		for(String element : list) {
			System.out.println(element);
		}
		
		// forEach
		System.out.println("");
		System.out.println("# forEach문");
		list.forEach(e -> System.out.println(e));
		
		// Iterator
		// Interface Iterator<E>
		System.out.println(" ");
		System.out.println("#Iterator 문");
		Iterator<String> iter = list.listIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}

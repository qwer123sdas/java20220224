package chap15.book.p150201;

import java.util.*;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value : list2) {
			System.out.println(value);
		}
		
		List<String> list = new ArrayList<>();
		list.add("spring");
		list.add("java");
		list.add("hello");
		list.add("lunch");
		
		// forEach
		System.out.println("# forEach문");
		list.forEach(e -> System.out.println(e));
	}
}

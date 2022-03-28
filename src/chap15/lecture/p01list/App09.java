package chap15.lecture.p01list;

import java.util.*;
import java.util.function.*;

public class App09 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		// 홀수  element 삭제
		
		// 방법 1
//		int i = 0;
//		while(i < list.size()) {
//			Integer elem = list.get(i);
//			if(elem%2 == 1) {
//				list.remove(i);
//				continue;
//			}
//			i++;
//		}
//		
//		// 방법 2
//		list.removeIf(e -> (e%2) == 1);
//		System.out.println(list);
//		
//		// 방법 3
//		Iterator<Integer> liter = list.iterator();
//		while(liter.hasNext()) {
//			if(liter.next() % 2 == 1) {
//				liter.remove();
//			}
//		}
		
		
		// 방법 4 
		Predicate<Integer> p = i -> i%2 == 1 ;



		evenNum(p, list);
		System.out.println(list);
	}

	static <T> void evenNum(Predicate<T> p, List<T> list) {
		for (T i : list) {
			if (p.test(i)) {
				list.remove(i);
			}
		}
	}
}

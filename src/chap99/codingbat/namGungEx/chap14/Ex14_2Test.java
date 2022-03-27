package chap99.codingbat.namGungEx.chap14;

import java.util.*;
import java.util.function.*;

public class Ex14_2Test {
	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)(Math.random() * 100) +1;
		Consumer<Integer> c = (i) -> System.out.print(i + ", ");
		Predicate<Integer> p = i -> i%2 == 0;
		Function<Integer, Integer> f = i -> i/10 * 10;
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list);
		System.out.println(list);
		
		printEventNum(p, c, list);
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
		
	}
	



	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i = 0; i<10; i++) {
			list.add(s.get());
		}
	}
	
	//짝수 출력
	static <T> void printEventNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i)) {
				c.accept(i);
			}
		}
		System.out.println("]");
	}
	
	// 1의 자리 없애기
	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());
		
		for(T i : list) {
			newList.add(f.apply(i));
		}
		return newList;
	}
}

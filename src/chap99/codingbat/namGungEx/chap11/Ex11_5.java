package chap99.codingbat.namGungEx.chap11;

import java.util.*;

public class Ex11_5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

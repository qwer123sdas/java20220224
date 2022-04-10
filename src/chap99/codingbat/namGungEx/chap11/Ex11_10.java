package chap99.codingbat.namGungEx.chap11;

import java.util.*;

public class Ex11_10 {
	public static void main(String[] args) {
		Set set = new HashSet();
		System.out.println(set.size());
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45) +1;
			set.add(num);
		}
		System.out.println(set);
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}
}

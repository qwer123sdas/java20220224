package chap99.codingbat.namGungEx.chap12;

import java.util.ArrayList;

public class GenericTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10); // list.add(new Integer(10)); 자동 박싱됨.
		list.add(20);
		list.add("30");
		
		Integer i  = (Integer)list.get(2);
		
		System.out.println(list);
		
		
	}
}

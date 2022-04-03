package chap99.codingbat.namGungEx.chap09;

import java.util.*;

public class RountTest {
	public static void main(String[] args) {
		System.out.println("i = " + Integer.parseInt("100"));
		System.out.println("i = "+ Integer.parseInt("100", 10));
		System.out.println("i = " + Integer.parseInt("100", 2));
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);   // 오토방식. 원래는 list.add(new Integer (10)); 써야함
		System.out.println(list.get(0));
		
		int value = list.get(0).intValue(); // 오토언박싱, int value = list.get(0).intValue();로 써야함.
		System.out.println(value);
		
	}
}

package chap99.codingbat.namGungEx.chap11;

import java.util.*;

public class Ex11_13 {
	public static void main(String[] args) {
		Set set = new TreeSet(new TestComp()); // 범위 검색과 정렬에 유리(정렬 필요없음)
		

		set.add(new Test());
		set.add(new Integer(3));

		
		System.out.println(set);
	}
}

class Test {}

class TestComp implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return 1;
	}
}
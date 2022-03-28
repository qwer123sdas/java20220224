package chap99.codingbat.namGungEx.chap11;

import java.util.*;

public class Ex11_1 {
	public static void main(String[] args) {
		// 기본 길이(용량, capacity)가 10인 ArrayList
		// ArrayList에는 객체만 저장가능
		// autoboxinf에 의해서 기본형이 참조형으로 바뀜
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5)); //
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// ArrayList(Collection c)
		// subList는 읽기만 가능
//		List sub = list1.subList(1, 4);
//		ArrayList list2 = new ArrayList(sub);
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		print(list1, list2);
		
		// Collection은 인터페이스 Collections는 util클래스
		System.out.println("오름차순으로 정렬");
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		// list1에 list2의 모든 요소를 포함하고 있는지 물어보는것
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		
		// 추가
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		// set은 변경하는 메소드
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0, "1");
//		list1.indexOf()는 저장된 위치의 index를 알려준다.
		System.out.println("index = " + list1.indexOf("1"));
		System.out.println("index = " + list1.indexOf(1));
//		System.out.println("index = " + list1.indexOf(new Integer(1)));
		// 이유 : "1"로 저장한 것은 String, 뒤의 1은 Integer의 1이라서 뒤의 Integer 1의 위치를 찾은 것
		
		
		list1.remove(new Integer(1));
		print(list1, list2);
		
		list1.remove(0);
		print(list1, list2);
		
		list1.remove(4);
		print(list1, list2);
		
		
		
		
	}

	private static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println("");
		
	}
}

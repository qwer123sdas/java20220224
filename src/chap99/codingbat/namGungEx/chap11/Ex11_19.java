package chap99.codingbat.namGungEx.chap11;

import java.util.*;
import	static java.util.Collections.*;

public class Ex11_19 {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		rotate(list, 2);  // 반시계방향으로 2번 회전
		System.out.println(list);
		
		swap(list, 0, 2); // index 0과  2위치에 있는 것 교환
		System.out.println(list);
		
		shuffle(list); // 위치 랜덤 변경
		System.out.println(list);
		
		sort(list, reverseOrder()); // (내림차순)역순 정렬
		System.out.println(list);
		
		sort(list); // 오름차순 정렬
	 	System.out.println(list);
	 	
	 	int idx = binarySearch(list, 3); // 3이 저장된 위치값(index)를 반환
	 	System.out.println("idx : " + idx);
	 	
	 	System.out.println("max = " + max(list));  // 최대값
	 	System.out.println("min = " + min(list));  // 최소값
	 	System.out.println("min = " + max(list,reverseOrder()));  // 최대값의 반대  = 최소값
	 	
	 	fill(list, 9); // list를 9로 채운다.
	 	System.out.println(list);
	 	
	 	// list와 같은 크기의 새로운 list를 생성하고 2로 채운다, 단 결과는 변경 불가
	 	List newList = nCopies(list.size(), 2);
	 	System.out.println("newList = " + newList);
	 	
	 	// 공통요소가 없는지 확인, 없으면 true, 있으면 false
	 	System.out.println(disjoint(list, newList));
	 	
	 	// list에 newList를 복사
	 	copy(list, newList);
	 	System.out.println("list : " + list);
	 	System.out.println("newList : " + newList);
	 	
	 	// list 안에 있는 2는 모두 1로 바꿈
	 	replaceAll(list, 2, 1);
	 	System.out.println("list : " + list);
	 	
	 	// Iterator와 같음.,
	 	Enumeration e = enumeration(list);
	 	ArrayList list2 = list(e);
	 	System.out.println("list2 : " + list2);
	}
}

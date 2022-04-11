package chap99.codingbat.namGungEx.chap11;

import java.util.*;

public class Ex11_17 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			int i = (Integer)it.next();
			total += i;
		}
		System.out.println("총점 : " + total);
		System.out.println("총점 : " + total/set.size());
		
		it = values.iterator();
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;
		while(it.hasNext()) {
			int temp = (Integer)it.next();
			maxNum = Math.max(maxNum, temp);
			minNum = Math.min(minNum, temp);
		}
		
		System.out.println("최고점수 : " + maxNum);
		System.out.println("최저점수 : " + minNum);
		
	}
}

package chap15.book.exercise.p9;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("bong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<String> keyset = map.keySet();
		Iterator<String> keyIterator = keyset.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key);

			// 최고점수 받은 아이디
			// 최고점수 저장
			if(value > maxScore) {
				name = key;
				maxScore = value;
			}
			// 점수 합계
			totalScore += value;

		}
		System.out.println("평균점수 : " + totalScore / map.size());
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고점수 받은 아이디 : " + name);


	}
}

package chap15.lecture.p03map;

import java.util.*;

public class App01 {
	public static void main(String[] args) {
		// Map : key, value 쌍으로 저장
		// (key, value) : entry, entry는 순서가 없음
		// key는 중복안됨
		
		Map<String, String> map = new HashMap<>();
		
		// put : entry 추가
		map.put("bts", "boy group");
		map.put("aespa", "girl group");
		map.put("tesla", "car");
		
		
		// size : entry 수
		int size = map.size();
		System.out.println(size);
		
		map.put("tesla", "elon musk");
		// 덮어쓴거라서 여전히 값은 3
		
		// get : key를 사용해서 value를 얻음
		String val1 = map.get("bts");
		String val2 = map.get("aespa");
		String val3 = map.get("tesla");
		
		String val4 = map.get("bitcoin"); // 없어서  null도출
		
		System.out.println(val1 + val2 + val3);
		System.out.println(val4);
		
		// keySet : key를 Set타입으로 리턴
		Set<String> keys = map.keySet();
		System.out.println(keys);   // 순서 보장x
		
		// 전체탐색1 : keySet과 get메소드 활용
		Set<String> keyset = map.keySet();
		
		for(String key: keyset) {
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		// 전체탐색2 : entrySet
		// Set타입이지만 , Map.Entry에 있음
		Set<Map.Entry<String, String>> entries = map.entrySet();
		
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		// 지우기 : key로 entry 삭제
		map.remove("tesla");
		System.out.println(map.size());
		System.out.println(map);
		
		// containsKey : key가 있는지 확인
		System.out.println(map.containsKey("aespa"));
		System.out.println(map.containsKey("tesla"));
		
		
		
		
		
		
	}
}

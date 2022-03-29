package chap15.lecture.p02set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class App04 {
	@Test
	public void test() {
		Set<Integer> r1 = solution(new int[] {1, 2, 2, 3, 4});
		assertEquals(1, r1.size());
		assertTrue(r1.contains(2));
		
		Set<Integer> r2 = solution(new int[] {4, 5, 6, 7});
		assertEquals(0, r2.size());
		
		Set<Integer> r3 = solution(new int[] {3, 3, 4, 4, 4, 5});
		assertEquals(2, r3.size());
		assertTrue(r3.contains(3));
		assertTrue(r3.contains(4));
		
		
	}
	
	public Set<Integer> solution(int[] nums){
		// nums 배열에 중복되어 2개 이상 있는 값을 set에 넣어서 리턴
		
//		방법 1
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] == nums[j]) {
					set.add(nums[i]);
				}
			}
		}
		
		
		// 방법2
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> result = new HashSet<>();
		
		for(int num : nums) {
			if(set1.contains(num)) {
				result.add(num);
			}else {
				set1.add(num);
			}
		}
		
		// 방법 3
		for(int num : nums) {
			if(!set1.add(num)) {
				result.add(num);
			}
		}
		
		return set;
	}
}

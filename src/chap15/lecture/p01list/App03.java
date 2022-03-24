package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(85);
		list.add(86);
		list.add(83);
		list.add(92);
		list.add(96);
		list.add(78);
		list.add(83);
		list.add(93);
		list.add(87);
		list.add(88);
		
		// 합계 + 평균
		int sum = 0;
//		for(int a : list) {
//			sum += a;
//		}
		int leng = list.size();
		for(int i = 0; i<leng; i++) {
			sum += list.get(i);
		}
		System.out.println("합계 : " + sum);
		
		System.out.println("평균 : " + sum/(double)leng);
	}
}

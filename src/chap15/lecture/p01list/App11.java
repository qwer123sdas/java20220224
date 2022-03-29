package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App11 {
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(95, 86));
		list.add(Arrays.asList(83, 92, 96));
		list.add(Arrays.asList(78, 83, 93, 87, 88));
		
		// 합계, 평균
		
//		System.out.println(list.get(0).get(0));
		
		int sum = 0;
		double num = 0;
		for(int i=0; i<list.size(); i++) {
			for(int j=0; j<list.get(i).size(); j++) {
				sum += list.get(i).get(j);
				num++;
			}
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/num);
		
		
		int sum1 = 0;
		double num1 = 0;
		for(List<Integer> row : list) {
			for(Integer score : row) {
				sum1+= score;
				num1++;
			}
		}
		System.out.println("합계 : " + sum1);
		System.out.println("평균 : " + sum1/num1);
	}
}

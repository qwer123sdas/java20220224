package chap15.lecture.p01list;

import java.util.ArrayList;

public class App02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(8);
		list.add(2);
		
		//최대값, 최소값
		int maxInt = Integer.MIN_VALUE;
		int minInt = Integer.MAX_VALUE;
		
//		for(int i=0; i<list.size(); i++) {
//			if(maxInt < list.get(i)) {
//				maxInt=list.get(i);
//			}
//			if(minInt > list.get(i)) {
//				minInt = list.get(i);
//			}
//		}
		
		for(int temp : list) {
			maxInt = Math.max(temp, maxInt);
			minInt = Math.min(temp, minInt);
			
//			if(maxInt < temp) {
//				maxInt=temp;
//			}
//			if(minInt > temp) {
//				minInt = temp;
//			}
		}
		
		System.out.println("최대값 : " + maxInt);
		System.out.println("최소값 : " + minInt);
				
	} 
	
}

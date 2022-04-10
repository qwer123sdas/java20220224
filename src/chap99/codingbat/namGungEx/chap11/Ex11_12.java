package chap99.codingbat.namGungEx.chap11;

import java.util.*;

public class Ex11_12 {
	public static void main(String[] args) {
		Set setA = new HashSet();
		Set setB = new HashSet();
		Set setHab = new HashSet();
		Set setKyo = new HashSet();
		Set setCha = new HashSet();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = " + setB);
		
		// 교집합
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp)) {
				setKyo.add(tmp);
			}
		}
//		setA.retainAll(setB); // 교집합, 공통된 요소만 남기고 삭제
//		System.out.println(setA);
		
		// A의 차집합
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) {
				setCha.add(tmp);
			}
		}
		// setA.removeAll(setB); // 차집합, setB와 공통 요소를 제거
//		System.out.println(setA);
		
		
		// 합집합
		it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
//		setA.addAll(setB);   // 합집합, setB의 모든 요소를 추가(중복 제외)
//		System.out.println(setA);
		
		System.out.println("A 교집합 B : " + setKyo);
		System.out.println("A 합집함 B : " + setHab);
		System.out.println("A-B : " + setCha);
	}
}

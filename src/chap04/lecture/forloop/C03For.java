package chap04.lecture.forloop;

public class C03For {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			System.out.println(i); // 조건식의 i활용, i=index
		}
		
		for(int i=0; i<5; i++) {   // 조건식 끼리 변수의 명이 같아도됨. 사용된 코드블럭 안에서만 사용되고 사라지기 때문
			System.out.println(i);
		}
		
//		System.out.println(i); //error
		
		//for 문 종료 후에도 사용하기 원할 때 for문 이전에 선언하면됨.
		int j;
		for(j=0; j<5; j++) {
			System.out.println(j);
		}
		System.out.println(j); // 5
		
		int a;
		for(a=0; a<5; ++a) {
			System.out.println(a);
		}
		System.out.println(a); // 5
	}
}

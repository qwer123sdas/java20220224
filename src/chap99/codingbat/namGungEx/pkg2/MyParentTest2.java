package chap99.codingbat.namGungEx.pkg2;

import chap99.codingbat.namGungEx.pkg1.MyParent;

class Mychild extends MyParent {

	public void printMembers() {
//		System.out.println(prv); // 오류 왜냐하면 private는 같은 클래스만 접근 가능
//		System.out.println(dft); // 오류 default로 같은 패키지만 접근 가능
		System.out.println(prt); // ok 왜하면 protected는 자손클래스까지 범위이기 때문 
		System.out.println(pub); // ok
	}
}

public class MyParentTest2 {
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv);  // 오류, 완전히 다른 패키지의 다른 클래스이기 때문
//		System.out.println(p.dft);  // 오류, 완전히 다른 패키지의 다른 클래스이기 때문
//		System.out.println(p.prt);  // 오류, 완전히 다른 패키지의 다른 클래스이기 때문
		System.out.println(p.pub);  // ok
	}
	
}

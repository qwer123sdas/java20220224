package chap99.codingbat.namGungEx.pkg1;

public class MyParent{   // 접근제어자가 default라서 pkg2.MyParentTest02클래스에 접근 x
	private int prv;  // 같은 클래스
			int dft;  // 같은 패키지    
	protected int prt;  // 같은 패키지 + 다른 패키지의 자손클래스
	public int pub;   // 접근 제한 없음.
	
	public void printMemebers() {
		System.out.println(prv);  // ok
		System.out.println(dft);  // ok
		System.out.println(prt);  // ok
		System.out.println(pub);  // ok
	}
	

}

class MyParentTest {
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv);  // 에러 발생, 접근 범위가 안맞음.
		System.out.println(p.dft);  // ok
		System.out.println(p.prt);  // ok
		System.out.println(p.pub);  // ok
	}
}

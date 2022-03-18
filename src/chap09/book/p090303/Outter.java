package chap09.book.p090303;

public class Outter {
	public void method2(int arg) {
		int localVariable = 1;
//		arg = 100;
//		localVariable = 100;
		
		// 로컬 클래스
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}

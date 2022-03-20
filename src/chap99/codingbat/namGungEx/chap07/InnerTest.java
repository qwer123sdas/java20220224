package chap99.codingbat.namGungEx.chap07;
class AAA{
	int i = 100;
	BBB b = new BBB();
	
	class BBB{
		void method() {
			System.out.println(i); // 객체생성없이 외부 클래스의 멤버에 접근 가능
	}
	
}

//class BBB{
//	void method() {
//		AAA a = new AAA();
//		System.out.println(a.i);
//	}
//}
class CCC{
//	BBB b = new BBB();
}
public class InnerTest {
	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();
		AAA a = new AAA();
		BBB b = a.new BBB();
		b.method();
	}
}

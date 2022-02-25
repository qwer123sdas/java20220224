package chap03.lecture.unary;

public class c03LogicalNot {
	public static void main(String[] args) {
		// 논리 연산자 not
		// !
		// 피연산자가 1개이고 타입은 boolean
		// 연산결과는 boolean이고 값은 피연산자와 반대가 된다(true->false가 false-> true가 됨)
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(!b1); // false
		System.out.println(!b2); // true
		
		boolean b3;
		b3 = !b2;
		System.out.println(b3);
	}
}

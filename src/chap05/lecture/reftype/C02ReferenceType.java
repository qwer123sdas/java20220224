package chap05.lecture.reftype;

public class C02ReferenceType {
	public static void main(String[] args) {
		String s1 = "hello";
		
		//heap영역에 공간을 마련하라는 명령 = new
		String s2 = new String("hello");
		//String은 자주사용하여서 문법적 편의를 준 것. 그래서 원래 new를 쓰는 것이 맞음.
		System.out.println(s1 == s2); // false 왜냐하면 각각의 참조변수인 s1, s2의 주소값이 다르니까
		
		
		
		int i1 =3;
		int i2 =5;
		System.out.println(i1 == i2);
		
		
	}
}

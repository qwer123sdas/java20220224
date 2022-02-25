package chap03.lecture.binary;

public class C03Arthmetic {
	public static void main(String[] args) {
		//실수 연산시 주의해야 할 점
		double n1 = 0.1;
		double n2 = 0.2;
		
		//근사치 연산
		double n3 = n1 + n2;
		System.out.println(n3);
		//0.30000000000000004 뜨는 이유는 컴퓨터가 2진법을 사용해서 생기는 문제
		//무한한 수 로 2진법의 소수값이 반복됨. ex) 0.1은 0.0011_0011_0011_0011이라서 0.1999969482421875뜬다.
		
		// 무한대 Infinity
		double n4 = 3.14;
		double n5 = 0.0;
		double n6 = n4 / n5;
		System.out.println(n6);  // Infinity가 뜨면서 무한대임을 말함
		System.out.println(-n6); // -Infinity
		
		double n7 = n4%0; // Not A Number = NAN
		System.out.println(n7); // NAN
		
		//정수를 0으로 나누는 것이 불가능 : EXception 발생
		int n8 = 3;
		int n9 = 0;
		
		int n10 = n8/n9;  //여기서 exception이 발생함과 동시에 프로그램 종료
		System.out.println("실행이 이어짐");
	}
}

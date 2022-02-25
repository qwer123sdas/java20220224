package chap03.lecture.binary;

public class C05Comparison {
	public static void main(String[] args) {
		//비교연산자
		//>, >=, <, <=< ==, !=
		//결과 타입 : boolean
		
		int i1 = 3, i2 =5;
		System.out.println(i1 == i2); // 같으면 true, 아니면 false
		System.out.println(i1 != i2); // 같으면 false, 아니면 false
		System.out.println(i1>i2); // 왼쪽 같이 크면 true, 아니면 false
		System.out.println(i1 >= i2); // 왼쪽같이 크거나 같으면 true, 아니면 false
		System.out.println(i1< i2);  // 왼쪽같이 크거나 같으면 true, 아니면 false
		System.out.println(i1 <= i2); //왼쪽 값이 작거나 같으면 true, 아니면 false
		
		//피연산자는 정수 실수 char도 가능
		System.out.println(3.14<=9.9);
		System.out.println('A'<='B'); //유니코드로 비교
		System.out.println('A'+0);
		System.out.println('a'+0);
		
		
		//실수끼리 비교할 때 주의
		double v4 = 0.1;
		float v5 = 0.1F;
		
		System.out.println(v4==v5); //false
		
	}
}

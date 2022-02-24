package chap02.lectur;

public class C03LiteralValue {
	public static void main(String[] args) {
		// 정수형 Literal
		System.out.println(10);

		// 실수형 Literal
		System.out.println(3.14);
		System.out.println(0.1);
		System.out.println(1.137285);

		// 문자 Literal(하나의 문자)
		System.out.println('a');
		System.out.println('b');
		System.out.println('A');
//		System.out.println('AB'); // x
//		System.out.println(''); // x   없는 건 존재하지 않음
		System.out.println(' '); // o space라는 문자 1개
		System.out.println('가');
		System.out.println('0'); // 0이라는 문자
		System.out.println();
		System.out.println('나');

		// 문자열 Literal (0개 이상의 문자 나열)
		System.out.println("ab");
		System.out.println("");
		System.out.println("A");
		System.out.println("가나다");
		System.out.println("🐱‍🐉 "); // 이모티콘 : window키 + .키
		System.out.println("Hellow World!#$#@#");
		System.out.println("Hello\tWorld"); // \t 탭
		System.out.println("Hello\nWorld");// \ㅜ 다음줄
		System.out.println("I'm ironman");
//		System.out.println("I am "ironman"");   // x
		System.out.println("I am \"ironman\""); // ok 큰 다옴표 안에 큰 다옴표 사용하는 법 \""\
		System.out.println("backslash \\");  //역슬래쉬 나타나게 하는 법 : \\
		
		
		
		// 논리(boolean) Literal : true, false라는 2개의 값을 가짐
		System.out.println(true);
		System.out.println(false);
	}
}
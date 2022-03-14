package chap06.lecture.p07package;

// import 키워드 : 파일 내에서 사용할 클래스를 작성하면 full name 중 package 생략가능
import chap06.lecture.p03constructor.Computer;
// import 키워드 작성할 때, *를 사용해서 패키지 내의 모든 클래스 작성가능
import chap06.lecture.p03constructor.*;

public class App02 {
	public static void main(String[] args) {
		chap06.lecture.p03constructor.Computer com1;
		// import작성하고 위에 있는 걸 아래처럼 작성 가능
		Computer com2;
		Desk d1;
	}
}

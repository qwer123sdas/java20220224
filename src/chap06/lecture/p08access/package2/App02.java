package chap06.lecture.p08access.package2;

import chap06.lecture.p08access.package1.Computer;

public class App02 {
	public static void main(String[] args) {
		Computer com1 = new Computer(); // import해야 사용가능
		com1.str1 ="spring"; // 서로다른 패키지이고 default인 멤버라서 에러발생
		com1.str3 = "react"; // public이라서 모두 접근 가능하므로 사용가능.
	}
}

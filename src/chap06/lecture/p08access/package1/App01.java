package chap06.lecture.p08access.package1;

public class App01 {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.str1 = "java";
		com1.str2 = "sql"; // private에 관여하는 멤버라서 다른 클래스에서 접근 불가능
		com1.str3 = "abc";
		
		System.out.println(com1.str1);
		
		// access modifier : 접근제한자, 접근 지정자
		// class, 생성자, 필드, 메소드의 이 4가지의 접근이 어디까지 허용할 것이지 결정해주는 키워드
		
		// 총 4가지 : public, protected, default, private
		
		//public : 모두 접근 가능
		// protected : 같은 패키지 접근 가능 + 다른 패키지에 있지만 상속받은 클래스 내에서만 접근 가능
		// default(package private) : 같은 패키지 내에서만 접근 가능
		// private : 클래스 내에서만 접근 가능
	}
}

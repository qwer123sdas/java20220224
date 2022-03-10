package chap06.book.exercise.p14;

class MemberDate {
	// 작성위치
	String name;
	String id;
	String password;
	int age;
	
	// 생성자
	MemberDate(String name, String id){
		this.name = name;
		this.id = id;
	}
	// source -> Generate Constructor using Fields 누르면 쉽게 만들기 가능
	public MemberDate(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
}

public class Member{
	public static void main(String[] args) {
		MemberDate user1 = new MemberDate("홍길동", "hong");
		MemberDate user2 = new MemberDate("강자바", "gang");
		
		System.out.println("멤버 1의 이름 : " + user1.name);
		System.out.println("멤버 1의 아이디 : " + user1.id);
		System.out.println();
		
		System.out.println("멤버 2의 이름 : " + user2.name);
		System.out.println("멤버 2의 아이디 : " + user2.id);
		
	}
}
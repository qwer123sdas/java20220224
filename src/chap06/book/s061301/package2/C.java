package chap06.book.s061301.package2;

public class C {
	A a; //오류, 이유 : package private제어자이므로 다른 패키지 접근 불가능
	B b; // 가능, 이유 : public제어자를 통해서 모두 접근 가능
}

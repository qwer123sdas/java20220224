package chap08.lecture.p01interface;

public interface MyInterface2 {
	// 인터페이스에 작성되는 필드는 모두, public static final 필드이다.
	int FIELD1 = 3; // static final 이 생략되어있음
	public static final int FIELD2 = 9; // 생략하든 안하든?
	
	// 개념일 뿐이라서 인스턴스르 만들 수 없다.
//	MyInterface2 o1 = new MyInterface2(); 불가능, 클래스 맴버만 사요가능(static멤버)
	
	
	
	};
}

package chap06.lecture.p10singleton;

public class App01 {
	public static void main(String[] args) {
//		Manager m1 = new Manager();
//		Manager m2 = new Manager();
		
		Manager m1 = Manager.getInstance();
		Manager m2 = Manager.getInstance();
		
		// 인스턴스를 한개만 있었으면 좋겟다.싶어서
		System.out.println(m1.hashCode()); // 참조값이 결과
		System.out.println(m2.hashCode());
		
		
	}
}

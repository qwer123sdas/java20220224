package chap11.lecture.p01object;

public class App04Equals {
	public static void main(String[] args) {
		Desk d1 = new Desk("a01");
		Desk d2 = new Desk("b01");
		Desk d3 = new Desk("a01");
		
		System.out.println(d1 == d2); // 참조값 비교
		System.out.println(d1 == d3); // 참조값 비교
		System.out.println(d1.equals(d3));
		// 이유 : equals메소드를 재정의 안했어서
		
		System.out.println();
		String s1 = new String("java");
		String s2 = new String("java");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}

class Desk{
	private String model;
	
	public Desk(String model) {
		this.model = model;
	}
	
	@Override
	public boolean equals(Object obj) {
		//obj의 model필드값과
		// this의 model필드값이 같으면 true로만들기
		
		if(obj instanceof Desk) {
			Desk d = (Desk)obj;
			if(d.model.equals(this.model)) {
				return true;
			}
		}
		
		
		return false;
	}
}
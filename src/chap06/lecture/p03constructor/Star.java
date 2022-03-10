package chap06.lecture.p03constructor;

public class Star {
	String stars;
	
	Star(int number){
		/*
		String init = "";
		for(int i=0; i<number; i++) {
			init += "*";
		}
		
		this.stars = init;
		*/
		this("*", number); // 다른 생성자를 호출하는 방법
	}
	
	Star(String shape, int number){
		String init = "";
		for(int i=0; i<number; i++) {
			init +=shape;
		}
		this.stars = init;
	}
}

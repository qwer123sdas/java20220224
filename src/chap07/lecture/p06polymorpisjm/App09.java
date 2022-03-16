package chap07.lecture.p06polymorpisjm;

import chap07.lecture.p99polymorpism_class.Animal;
import chap07.lecture.p99polymorpism_class.Chihuahua;
import chap07.lecture.p99polymorpism_class.StreetCat;

public class App09 {
	public static void main(String[] args) {
		Animal animal = new StreetCat();
		animal.breathe();
		animal.cry();
		
		// angry 메소드 실행하고 싶다.
		// 길고양이는 치와와다.xxx
		Chihuahua chihuahua = (Chihuahua)animal; // ClassCastException 발생
		chihuahua.angry();
		
		// 주의 : 강제형변환은 매우 주의해서 작성해야함.
		
		System.out.println("명령문 진행 계속....");
	}
}

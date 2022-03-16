package chap07.lecture.p06polymorpisjm;

import chap07.lecture.p99polymorpism_class.Animal;
import chap07.lecture.p99polymorpism_class.Chihuahua;

public class App08 {
	public static void main(String[] args) {
		Animal animal = new Chihuahua();
		animal.breathe();
		animal.cry();
		
		// angry메소드를 실행하고 싶다.
		//Chihuahua chihuahua = animal;를 하면 안됨.
		//그래서 강제 형변환을 시켜주어야 한다.
		Chihuahua chihuahua = (Chihuahua)animal;
		chihuahua.angry();
	}
}

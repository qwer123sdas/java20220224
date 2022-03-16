package chap07.lecture.p06polymorpisjm;

import chap07.lecture.p99polymorpism_class.Chihuahua;
import chap07.lecture.p99polymorpism_class.StreetCat;

public class App01 {
	public static void main(String[] args) {
		Chihuahua chinuanua = new Chihuahua();
		chinuanua.breathe();
		
		StreetCat streetCat = new StreetCat();
		streetCat.breathe();
		
		chinuanua.cry();
		streetCat.cry();
	}
}

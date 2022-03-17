package chap08.lecture.p02polymrphism;

import chap08.lecture.p01interface.example_class.*;

public class App07 {
	public static void main(String[] args) {
		Pet pet = new Chihuahua();
		pet.roll();
		
//		Helper helper = (Helper)pet; // 강제형변환에 따른 오류 : ClassCastException
		
	}
}

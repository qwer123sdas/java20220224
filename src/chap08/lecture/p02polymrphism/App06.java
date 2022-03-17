package chap08.lecture.p02polymrphism;

import chap08.lecture.p01interface.example_class.*;

public class App06 {
	public static void main(String[] args) {
		Helper helper = new Retriever();
		helper.help();
		
//		helper.roll(); // 헬퍼니까 help메소드만 가지므로 roll 안됨
		// 만약 roll메소드를 실행시키고 싶다면
		Pet pet = (Pet)helper;
		pet.roll();
	}
}

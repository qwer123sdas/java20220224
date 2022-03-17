package chap08.lecture.p02polymrphism;

import chap08.lecture.p01interface.example_class.*;

public class App08 {
	public static void main(String[] args) {
		//instance
		Retriever animal1 = new Retriever();
		
		System.out.println(animal1 instanceof Retriever);
		System.out.println(animal1 instanceof Animal);
		System.out.println(animal1 instanceof Canine);
		System.out.println(animal1 instanceof Pet);
		System.out.println(animal1 instanceof Helper);
		
		if(animal1 instanceof Helper) {
			Helper helper = (Helper)animal1;
			helper.help();
		}
		
	}
}

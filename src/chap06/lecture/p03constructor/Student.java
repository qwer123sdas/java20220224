package chap06.lecture.p03constructor;

public class Student {
	String name;
	int number;
	
	// 기본 생성자
	Student(){
	}
	
	//
	Student(String name, int number){
		this.name = name;
		this.number = number;
	}
}

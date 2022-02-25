package chap03.book.exercise;

public class Exercize04 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// 학생 한명이 가지는 연필 수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		//ctrl + space 힌트나 오류 해결
		//ctrl + 1 : 어디있든 동일한 변수명을 한번에 변경 가능
		
		// 남은 연필 수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
	}
}

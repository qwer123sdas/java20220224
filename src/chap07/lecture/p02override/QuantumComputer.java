package chap07.lecture.p02override;

public class QuantumComputer extends Computer {
	
	//  상속받은 메소드를 (마음에 안들어서) 다시 정의하는 것
	// 원본 메소드와 메소드명이 같아야하고, 파라미터(갯수 , 순서)도 같아야 한다.
	public void execute() {
		System.out.println("더 빠른 연산을 합니다.");
	}
	
	public void otherExecute() {
		System.out.println("다른 연산을 합니다.");
	}
}

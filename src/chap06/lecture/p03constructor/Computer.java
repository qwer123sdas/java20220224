package chap06.lecture.p03constructor;

public class Computer {
	String cpu;
	String ram;
	String ssd;

	Computer() {
	}

	Computer(String cpu, String ram) {
		this.cpu = cpu;
		this.ram = ram;
	}

	Computer(String cpu, String ram, String ssd) {
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
	}

//	// 생성자는 여러개 작성가능하지만, 생성자의 파라미터의 수, 타입, 순서가 달라야함.
//	Computer(String ram, String ssd){ // 오류
//		this.ram = ram;
//		this.ssd = ssd;
//	}

	Computer(String cpu) {
		this.cpu = cpu;
	}

	Computer(int price) {

	}

	Computer(String cpu, int price) {
	}
	Computer(int price, String cpu){
	}
}

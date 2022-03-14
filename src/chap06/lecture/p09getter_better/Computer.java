package chap06.lecture.p09getter_better;

public class Computer {
	//  특별한 이유가 없다면 필드는 private로 작성하고
	// public get set메서드로 필드값을 변경하거나 읽도록 해야 한다.
	
	
	private int ssd; // 읽기 전용
	private int ram; // 같은 클래스 내에서만 접근 가능하므로 App01오류

	public void setRam(int ram) { // 메소드로 필드의 값을 초기화하도록 만듬.
		System.out.println("ram을 변경합니다.");
		if (ram < 0) {
			this.ram = 4;
		} else {
			this.ram = ram;
		}
	}

	public int getRam() { // ram은 다른 클래스에서 직접 접근 못하므로
		// 이렇게 메소드 만들어서 읽을 수 있게 만들어야함.
		System.out.println("ram을 읽습니다.");
		return this.ram;
	}
// -----------------------------------------------------------
	public Computer() {
		ssd = 1000;// 왜 this 안씀?
	}

	public int getSsd() {
		return this.ssd;
	}
}

package chap07.lecture.p07abstract;

public abstract class Canine { // 추상 클래스
	//개과
	
	// 논다는 개념만 있고 본문은 없도록 하고 싶을 때 ㅣ 추상메서드
	// 본문(코드블럭)이 없는 메소드는 추상메소드
	// abstract키워드 작성해야함
	public abstract void play();
	
	// 추상메소드를 갖는 클래스는 꼭 추상클래스여야한다.!
	
	public void bark() {
		System.out.println("멍멍!");
	}
}

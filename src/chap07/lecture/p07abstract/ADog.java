package chap07.lecture.p07abstract;

public abstract class ADog extends Canine{
	// 상속받은 클래스안의 메소드중에, 부모의 추상메소드를 재정의 하지 않으면, 추상클래스로 정의해야함
	// 왜냐하면 안보이지만 추상메소드가 있기 때문이다.아까 추상메소드가 있으면 무조건 추상클래스여야했다는 부분을 잊지말자.
	// 그래서 추상클래스임을 제거하려면 오버라이딩하여 완전한 메서드로 만들면 된다.
}
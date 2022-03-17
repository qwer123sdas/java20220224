package chap08.book.exercise.p08025;

public interface RemoteControl {
	// 상수필드 선언
	public int MAX_VOLUM = 10;
	public int MIN_VOLUM = 0;
	public static final int A = 67;
	// 이름관습 : 대문자 + 언더바_
	
	
	// 추상메소드 선언
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//정적메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	// 디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음해제합니다.");
		}
	}
	
}

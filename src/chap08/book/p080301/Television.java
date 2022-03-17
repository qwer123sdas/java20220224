package chap08.book.p080301;

import chap08.book.exercise.p08025.*;

public class Television implements RemoteControl{
	// 필드
	private int volume;
	
	//turnOn() 추상메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUM) {
			this.volume = RemoteControl.MAX_VOLUM;
		}else {
	}
	
}

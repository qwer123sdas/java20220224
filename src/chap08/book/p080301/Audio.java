package chap08.book.p080301;

import chap08.book.exercise.p08025.RemoteControl;

public class Audio implements RemoteControl{
	// 필드
	private int volume;

	// 추상메소드의 실체 클래스
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUM) {
			this.volume = RemoteControl.MAX_VOLUM;
		}else if(volume < RemoteControl.MIN_VOLUM) {
			this.volume = RemoteControl.MIN_VOLUM;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨 :" + this.volume);
	}
	
	
}

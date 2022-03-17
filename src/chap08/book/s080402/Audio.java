package chap08.book.s080402;

import chap08.book.exercise.p08025.RemoteControl;

public class Audio implements RemoteControl{
	// 필드
	private int volume;
	private boolean mute;
	
	
	// 추상메소드 실체메소드로 오버로딩하여 바꾸기
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
		System.out.println("현재 오디오 볼륨 : "+ this.volume);
	}
	
	// 디폴트 재정의
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("오디오 무음처리합니다.");
		}else {
			System.out.println("오디오 무음 해제합니다.");
		}
	}
	
}

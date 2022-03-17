package chap08.book.s080402;

import chap08.book.exercise.p08025.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
		// 정적 메소드 사용
		RemoteControl.changeBattery();
	}
}

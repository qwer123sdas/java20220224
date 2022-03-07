package chap99.codingbat.namGungEx;

class Tv{
	boolean power;
	int channel;
	
	void power() {
		power != power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {   // 캡션 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}
public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;  // 조상클래스로부터 상속받은 멤버 변수
		ctv.channelUp();   // 조상클래스로부터 상속받은 멤버 메소드
		
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World 1");
		ctv.caption = true;  // 캡션 on
		ctv.displayCaption("Hello, World 2"); // 캡션을 화면에 보여줌
		
	}
}

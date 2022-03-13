package chap99.codingbat.namGungEx;

class Time{
	private int hour; // 0 ~ 23 사이의 값을 가져야함
	private int minute;
	private int second;
	

	public void setHour(int hour) {
		if(isNotValidHour(hour)) {
			return;
		}
		
		this.hour = hour;
	}
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메소드
	// ctrl + shift + m 단축키
	private boolean isNotValidHour(int hour) { // 이 클래스 안에서만 사용하게 수정.
		                   // 이렇게 하면 수정해야할 범위가 줄어들게 된다는 장점.
		return hour<0 || hour>23;
	}
	
	
	
	public int getHour() { // hour변수가 private이기 때문에 직접접근하여 읽을 수 없으므로
		           // hour의 값을 읽어주기 위한 메서드가 필요.
		return hour;
	}
	
}

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 100;
		t.setHour(21); // hour의 값을 21로 변경
		System.out.println(t.getHour());
		
		t.setHour(100); // hour의 값을 100으로 변경하려고 하지만, if때문에 바로 메서드가 종료되서
		           //값이 변한지 않는다.
	}
}

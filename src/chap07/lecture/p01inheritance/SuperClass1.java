package chap07.lecture.p01inheritance;

public class SuperClass1 {
	private String field;
	
	// private한 필드의 get, set 메소드
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	
	// 메소드
	public void someMethod() {
		System.out.println("어떤 메소드");
	}
}

package chap07.book.exercise.p5;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
//		this.name = name; 위 메소드와 똑같은 일을 하므로 없어도 된다.
		this.studentNo = studentNo;
	}
	
	
	// get & set
	public int getStudentNo() {
		return studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
}

package chap07.book.exercise.p6;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parnet() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parnet(String nation) call");
	}
}

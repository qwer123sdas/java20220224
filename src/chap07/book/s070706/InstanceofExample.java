package chap07.book.s070706;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent; // 강제형변환
			System.out.println("메소드1 - child로 변환성공");
		}else {
			System.out.println("메소드1 - child로 변환되지 않음");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		
	}
}

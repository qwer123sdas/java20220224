package chap07.lecture.p05promotion;

public class App05 {
	public static void main(String[] args) {
		MyClass5 o1 = new MyClass5();
		o1.field = new SuperClass1();
		o1.field = new SubClass1();
		
		o1.setField2(new SuperClass1());
		o1.setField2(new SubClass1()); //  자동타입변환, 북금곰은 곰이다. o
		
		SuperClass1 s1 = o1.getField2();
		
//		SubClass1 s2 = o1.getField2(); // 자동타입변환 xx 곰은 북금곰이다 x
		SubClass1 s2 = o1.getField3();
		SubClass1 s3 = o1.getField3();
		SuperClass1 s4 = o1.getField3(); // 자동타입변환
	
	}
}

class MyClass5{
	public SuperClass1 field; // 참조형 필드
	
	
	//
	private SuperClass1 field2;
	public SuperClass1 getField2() {
		return field2;
	}
	public void setField2(SuperClass1 field2) {
		this.field2 = field2;
	}
	
	//
	private SubClass1 field3;
	public SubClass1 getField3() {
		return field3;
	}
	
}

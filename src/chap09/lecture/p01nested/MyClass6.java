package chap09.lecture.p01nested;

public class MyClass6 {
	int outField1;
	void outMethod1() {}
	
	
	
	void method1() {
		// local class
		class LocalClass{
			int outField1;
			void outMethod1() {
				
			}
			
			
			void method1() {
				outField1 = 3; // 바깥의 클래스의 필드
				this.outField1 = 4;  // 바깥의 클래스의 필드
				
				
				
				MyClass6.this.outField1 = 5; // 로컬 클래스의 메소드
				
				
				this.outMethod1();  // 바깥의 클래스의 메소드
				
				
				MyClass6.this.outMethod1(); // 로컬 크래스의 메소드
			}
		}
	}
}

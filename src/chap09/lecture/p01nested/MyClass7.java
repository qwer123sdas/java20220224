package chap09.lecture.p01nested;

public class MyClass7 {
	void method1(int param) {
		// 지역 클래스에서 지역변수(파라미터) 사용시 주의해야 할 점
		// 지역변수(파라미터)는 final이어야 함.
//		int i = 3; // 되긴한다.  단 값이 변경되지 않았으니까  가능한것
		// 즉 값이 변경되지 않으면 fianl 생략가능(effectively final)
		final int i = 3;
		
		class LocalClass1{
			void method2() {
				System.out.println(i);
			}
			
			void method4() {
				System.out.println(param);
//				param = 4; // 바깥 메소드의 파라미터값도 변경 불가능.
				// 그래서 바깥 메소드의 파라미터를 final로 선언하던가 final처럼 사용해야한다.
			}

			
		}
		
		
		
	}
}

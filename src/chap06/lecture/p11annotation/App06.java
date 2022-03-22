package chap06.lecture.p11annotation;

public class App06 {
	@MyAnnotation6(value = "spring")
	void method() {
		
	}
	
	@MyAnnotation6("java")  // value만 사용하는 경우 value는 생략 가능. 
	void method2() {
		
	}
}

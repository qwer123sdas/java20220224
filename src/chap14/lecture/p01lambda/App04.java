package chap14.lecture.p01lambda;

public class App04 {

}
// functional interface : 추상메소드가 1개인 인터페이스
@FunctionalInterface    // 이는  인터페이스에 추상메소드가 1개인지 아닌지를 검증하는 것
interface MyInterface41{
	void method1();
}

@FunctionalInterface 
interface MyInterface42{
	void method2();
	void method3();
}

@FunctionalInterface 
interface MyInterface43{
	
}
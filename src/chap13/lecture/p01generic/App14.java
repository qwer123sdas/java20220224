package chap13.lecture.p01generic;

public class App14 {
	public static void main(String[] args) {
		// generic method 호출하는 방법
		App14.<String>method("java"); //
		method("java");
		
		String s1 = App14.<String>method2();
		String s2 = method2();  // type parameter값을 추론해서 사용하게됨.
		
		String s3 = App14.<String>method3("java");
		String s4 = method3("java");
	}
	// generic method 생성
	// method에 type parameter추가
	// type parameter을 리턴타입 전에 추가
	public static <T> void method(T param) {
		
	}
	
	public static <T> T method2() {
		return null;
	}
	
	// 또는 리턴타입에도 추가 가능
	public static <T> T method3(T param) {
		return null;
	}
}

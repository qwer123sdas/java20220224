package chap08.lecture.p02polymrphism;

public class App01 {
	public static void main(String[] args) {
		// 자동형변환
		
		// 지역변수
		MyClass1 o1 = new MyClass1();
		MyInterface1 i1 = o1; // 상속처럼 자동으로 형변환 됨.
		System.out.println(o1 == i1);
		
		MyInterface1 i2 = new MyClass1(); // 자동형변환 
		
		// 메소드 파라미터
		method1(o1); // 자동으로 형변환니까 가능
		method1(i1);
		method1(new MyClass1()); // 자동형변환
		method1(i2);
		
		// 배열
		MyInterface1[] arr1 = new MyInterface1[3];
		arr1[0] = new MyClass1(); // 자동형변환되니까
		arr1[1] = i1;
		arr1[2] = o1; // 자동형변환 이루어짐
		
		
	}
	//참조변수
	public static void method1(MyInterface1 param) {
		
	}
	//참조리턴
	public static MyInterface1 method1() {
		MyClass1 o1 = new MyClass1();;
		return o1; // 자동형변환
	}
}

interface MyInterface1{
	
}

class MyClass1 implements MyInterface1{
	
}

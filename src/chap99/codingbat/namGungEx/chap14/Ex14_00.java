package chap99.codingbat.namGungEx.chap14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_00 {
	public static void main(String[] args) {
//		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
////		Function<String, Integer> f = 클래스이름::메서드이름;
//		Function<String, Integer> f = Integer::parseInt;
//		System.out.println(f.apply("100") + 200); // 300
		
		//Supplier는 입력x, 출력o
		// 기본생성자 
//		Supplier<MyClass> s = () -> new MyClass();
		Supplier<MyClass> s = MyClass::new;
		System.out.println(s.get()); // 객체를 만들어주고 이를 출력
		
		MyClass mc = s.get(); // MyClass객체의 주소를 반환
		System.out.println(mc);
		
		System.out.println(s.get()); // 또다른 객체가 만들어짐.
		
		// 매개변수가 있는 생성자
//		Function<Integer, MyClass> s1 = (i) -> new MyClass(i);
		Function<Integer, MyClass> s1 = MyClass::new;
		MyClass mc1 = s1.apply(100);
		System.out.println(mc1.iv);
		
		System.out.println(s1.apply(200).iv);
		
		// 배열 생성자
//		Function<Integer, int[]> f2 = (i) -> new int[i];
		Function<Integer, int[]> f2 = int[]::new;
		int[] arr = f2.apply(100); // 길이가 100인 배열
		System.out.println("배열의 길이 = " + arr.length);
		
	}
}

class MyClass{
	int iv;
	
	MyClass(){}
	
	MyClass(int iv){
		this.iv = iv;
	}
}

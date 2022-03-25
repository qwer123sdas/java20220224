package chap14.lecture.p01lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class App08 {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("java");
		list1.add("spring");
		list1.add("hello");
		list1.add("jsp");
		list1.add("friday");

		list1.forEach(e -> System.out.println(e));
		list1.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		

		// 절반의 문자열 출력
		list1.forEach(e -> {
//			for (String e : list1) {
				System.out.println(e.substring(0, e.length() / 2));
//			}
		});
		
		
		//
	}
}

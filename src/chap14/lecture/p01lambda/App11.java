package chap14.lecture.p01lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class App11 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("java");
		list1.add("spring");
		list1.add("hello");
		list1.add("jsp");
		list1.add("friday");
		
//		list1.removeIf((e) -> true);
//		System.out.println(list1.size()); // 0
		
		
//		list1.removeIf((e) -> false);
//		System.out.println(list1.size()); // 5, 그대로 보존
		
//		list1.removeIf((e) -> e.startsWith("j"));
		
		list1.removeIf( (e){
			return e.startWith("j");
		});
		
		list1.removeIf(a);
		Predicate<String> a = new Predicate<String>() {
			private void startWith() {
				
			}
		}
		System.out.println(list1);
		
	}
}	

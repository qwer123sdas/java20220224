package chap13.lecture.p01generic;

import java.util.ArrayList;
import java.util.List;

public class App13 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Object> list2 = new ArrayList<Object>();
		
		list1.add("java");
		list2.add(new Object());
		
		List<Object> list3 = list1;
		// 된다면
		list3.add(new Object());//도 되어야 하는데 일어나면 안된다.
		//대우가 거짓이어서 원 명제도 된다.
		
		
	}
}

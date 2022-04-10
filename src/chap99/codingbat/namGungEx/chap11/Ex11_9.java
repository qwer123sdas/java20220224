package chap99.codingbat.namGungEx.chap11;

import java.util.*;

public class Ex11_9 {
	public static void main(String[] args) {
		Object[] obj = {"1", new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		for(int i=0; i<obj.length; i++) {
			System.out.println(set.add(obj[i]));
		}
		
		System.out.println(set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

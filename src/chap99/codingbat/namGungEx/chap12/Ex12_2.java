package chap99.codingbat.namGungEx.chap12;

import java.util.*;


public class Ex12_2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바왕", 1, 2));
		list.add(new Student("홍길동", 2, 1));
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
//			Student s= it.next();
//			System.out.println(s.name);
			System.out.println(it.next().name); // 이렇게 줄일 수 있음
			
			// 강제 형변환 해야 했을 때,
//			Student s = (Student)it.next();
//			System.out.println(s.name);
//			System.out.println((Student)it.next().name);// 이렇게 줄일 수 있음
			
		}
		
		HashMap<String, Student>map = new HashMap<>();
		map.put("자바왕", new Student("자바왕", 1, 1, 100, 100,100));
		
		Student s = map.get("자바왕");
		
		System.out.println(map);
		
		
		
	}
}

class Student{
	String name = "";
	int ban=0;
	int no=0;
	int kor;
	int eng;
	int math; 
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;

	}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}

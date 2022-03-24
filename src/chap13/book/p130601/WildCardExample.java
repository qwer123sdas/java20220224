package chap13.book.p130601;

import java.util.Arrays;



public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? extends Worker> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		
		Course<Worker> studentCourse = new Course<>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> hightStudentCourse = new Course<>("고등학생과정", 5);
		hightStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(hightStudentCourse);
		System.out.println();
		
		registerCourse(studentCourse);
		registerCourse(hightStudentCourse);
		System.out.println();
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
	}
}

class Person {
	public String name;
	public Person(String name) {
		this.name = name;
	}
}

class Worker extends Person {
	public Worker(String name) {
		super(name);
	}

}

class Student extends Person {
	public Student(String name) {
		super(name);
	}
}

class HighStudent extends Student {
	public HighStudent(String name) {
		super(name);
	}
}

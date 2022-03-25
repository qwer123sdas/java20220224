package chap14.book.exercise.p6;

import java.util.function.ToIntFunction;

public class LambdaExample {
	private static Student[] student = { new Student("홍길동", 90, 96), new Student("신용권", 95, 93) };

	//avg() 메소드 작성
	public static double avg(ToIntFunction<Student> f) {
		double avg =  0.0;
		
		for(Student s : student) {
			avg += f.applyAsInt(s);
		}
		
		return avg /= student.length;
	}
	

	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);

//		double mathAvg = avg(s -> s.getMathScore());
//--------------------------------------------------------------------------------		
//		ToIntFunction<Student> a = new ToIntFunction<Student>() {
//			@Override
//			public int applyAsInt(Student value) {
//				return value.getMathScore();
//			}
//		};
		
		ToIntFunction<Student> a = (value) -> { return value.getMathScore(); };
		double mathAvg = avg(a);
		
		System.out.println("수학 평균 점수 : " + mathAvg);

	}
	
	//내부 클래스
	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;

		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}
	}

}

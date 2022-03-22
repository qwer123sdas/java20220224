package chap11.book.exercise.p3;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((studentNum == null) ? 0 : studentNum.hashCode());
//		return result;
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (studentNum == null) {
//			if (other.studentNum != null)
//				return false;
//		} else if (!studentNum.equals(other.studentNum))
//			return false;
//		return true;
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			if(this.studentNum == stu.studentNum) {
				return true;
			}
		
		}
		return false;
	}
	
	
}

package chap99.codingbat.namGungEx.chap08;

public class Ex8_6 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생");
			throw e; // 예외를 던짐
			//위의 두줄을 한줄로 쓸 수 있음
			// throw new Exception("고의로 발생");
			
		}catch(Exception e) { // 예외를 받음
			
			System.out.println("에러메시지 : " +  e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상종료");
	}
}

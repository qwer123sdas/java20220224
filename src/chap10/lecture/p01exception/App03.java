package chap10.lecture.p01exception;

public class App03 {
	public static void main(String[] args) {
		// NumberFormatException
		
		String s = "100";
		String t = "3.14";
		
		// static메서드
		int i1 = Integer.parseInt(s);
		System.out.println(i1 * 2);
		
		double d1 = Double.parseDouble(t);
		System.out.println(d1 * 3);
		
		// 넘버로 변경할 수 없는 포맷인 경우 에러 발생
		String u = "1 00";
		String v = "3,14";
		/* 에러 발생
		Integer.parseInt(u);
		Double.parseDouble(v);
		*/
		
	}
}

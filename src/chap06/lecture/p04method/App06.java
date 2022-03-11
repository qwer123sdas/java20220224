package chap06.lecture.p04method;

public class App06 {
	public static void main(String[] args) {
		Calculator2 c = new Calculator2();
		c.sum();
		c.sum(1);
		c.sum(10,20);
		int sum = c.sum(33, 44, 55, 66, 77);
		System.out.println(sum);
		
		
		// 여러개의 String 매개값을 받는 contact메소드작성
		// 매개 값으로 받은 스트링을 연결해서 출력
		c.concat("java", "spring", "sql");
		c.concat("a", "b");
		c.concat("mysql");
		
		
	}
}

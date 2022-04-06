package chap99.codingbat.namGungEx;

import java.util.Calendar;

class Product{
	static int count = 0; // 클래스 변수 생성 및 초기화(단순 초기화)
	int serialNo;  // 인스턴스 변수 생성, 인스턴스 고유의 번호?
	
	{
		//Product인스턴스가 생성될 떄 마다 count의 값을 1씩 증가시켜서 serialNo에 저장한다.
		count++;
		serialNo = count;
	}
	
	public Product() {} // 생성자 생성
}
public class ProductTest {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serial no)는" + p1.serialNo);
		System.out.println("p2의 제품번호는" + p2.serialNo);
		System.out.println("p3의 제품번호는" + p3.serialNo);
		System.out.println("생성된 제품의 수는 모두" + Product.count + "개입니다.");
	}  //
}

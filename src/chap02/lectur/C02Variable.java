package chap02.lectur;

public class C02Variable {
	public static void main(String[] args) {
		//변수의 사용 범위(=scope) : 선언된 블럭{} 안
		
		boolean b = true;
//		int a = 4;
		if(b) {
			int a = 3;// int a = 4;가 있으면 오류
			System.out.println(a);
		}
		
//		System.out.println(a);  // int a = 4;가 없으면 오류
	}
}

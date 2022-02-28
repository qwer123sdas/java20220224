package chap04.lecture.ifelse;

public class C04Random {
	public static void main(String[] args) {
		double n1 = Math.random(); // 0.0<= n1 < 1.0
		System.out.println(n1);
		
		double n2 = n1*10;
		System.out.println(n2);
		
		int n3 = (int)n2;
		System.out.println(n3);
		
		int n4 = n3 +1;
		System.out.println(n4); // 1~10 임의의 자연수 나옴
		
		//주사위
		int nn22 = (int)((Math.random() * 6) + 1);
		System.out.println(nn22);
		
		//로또 (1~45)번호
		int rotoNum = (int)(n1*45) + 1;
		System.out.println(rotoNum);
	}
}

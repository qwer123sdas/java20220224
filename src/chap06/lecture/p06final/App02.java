package chap06.lecture.p06final;

public class App02 {
	int i =3; // 인스턴스 변수
	final int j = 5;
	final int k;
	
	App02(){
		k =30;
	}
	
	/* 클래스 맴버*/
	static int l = 30;
	
	public static void main(String[] args) {
		App02 o1 = new App02();
		System.out.println(o1.i);
		o1.i = 4;
		System.out.println(o1.i);
		
//		o1.j=6;// 에러 발생
//		o1.i k = 60; // 에러 발생.
		
		
		App02.l = 50;
	}
}

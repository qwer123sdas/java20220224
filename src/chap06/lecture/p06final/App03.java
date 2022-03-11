package chap06.lecture.p06final;

public class App03 {
	static int i = 3;
	static final int j = 5;
	static final int k;

	final static int l;  // final static 위치 바껴도 상관 x

	static {
		k = 99;
		l = 33;
	}

	public static void main(String[] args) {
		i = 4;
		//		j=6;
		//		k=100;
	}
	
	// 변하지 않는 값을 공통적으로 사용할 때 사용
	static final double PI = 3.14;
	// static final의 변수명은 항상 대문자로 작성해주어야 한다. 그리고 단어 사이는 언더스코어'_'로 구분
	static final int STUDENT_NUMBER = 30;
	
	void sum(String s, String...str) {
        for(String a:str)
            System.out.print(a+s);
    }
    void sum(String...str) {
        for(String a:str)
            System.out.print(a);
    }

}

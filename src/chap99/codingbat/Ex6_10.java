package chap99.codingbat;

public class Ex6_10 {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과:"+ mm.add(3, 3));
		System.out.println("mm.add(3L, 3) 결과:" + mm.add(3L, 3));
		System.out.println("mm.add(3, 3L) 결과:" + mm.add(3, 3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과 :" + mm.add(a));
	}
}

class MyMath3 {
	// 메서드의 이름이 같다 = 하는 작업이 같다.
	// 모두 매개변수를 서로 더하는 결과값을 가짐.
	int add(int a, int b) {
		System.out.println("int add(int a, int b) -");
		return a + b;
	}

	long add(long a, long b) {
		System.out.println("long add(long a, long b -");
		return a + b;
	}

	int add(int[] a) {
		System.out.println("int add(int[] a) -");
		int result = 0;
		for(int i=0; i<a.length; i++)
			result += a[i];
		
		return result;
	}

}



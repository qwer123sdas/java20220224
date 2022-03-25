package chap14.lecture.p01lambda;

public class App05 {
	public static void main(String[] args) {
		MyInterface5 o1 = (int a, int b)->{
			return a + b;
		};
		
		// 1. parameter type 생략 가능
		MyInterface5 o2 = (d, e) ->{
			return d*e;
		};
		
		// 2. 명령문  하나일 떄, 중괄호 생략 가능
		// 그 명령문이 return 명령문일 때는, return키워드도 생략가능
//		MyInterface5 o3 = (d,e) ->{ return d - e; };
		MyInterface5 o3 = (d,e) -> d - e;
		
		
		// 2. 명령문 하나일 때 중괄호 생략 가능
		/*MyInterface51 o4 = (x) -> {
			System.out.println(x);
		};*/
		MyInterface51 o4 = (x) -> System.out.println(x);
		
		// 3. 파라미터가 1개일 때, 둥근괄호 생략 가능
		MyInterface51 o5 = x -> System.out.println(x);
		o5.method(3);
		
		
	}
}


@FunctionalInterface
interface MyInterface5{
	int method(int x, int y);
}

interface MyInterface51{
	void method(int x);
}

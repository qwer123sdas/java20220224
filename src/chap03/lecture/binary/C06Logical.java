package chap03.lecture.binary;

public class C06Logical {
	public static void main(String[] args) {
		// 논리연산자
		// &&(AND short circuit), ||(OR short circuit), 
		// &(AND), |(OR), ^(XOR)
		// 피연산자 : boolean
		// 연산결과 : boolean
		
		// AND && : 양변이 모두 true일 때만 true, 나머지는 false.
		System.out.println(true&&true);  // ture
		System.out.println(true&&false); // false
		System.out.println(false&&true); // false
		System.out.println(false&&false); // false
		
		//OR ||
		//양변 모두 false일 때만, false, 나머지 모두 true
		System.out.println(true||true);  //true
		System.out.println(true||false); //true
		System.out.println(false||true); //true
		System.out.println(false||false);  //false
		
		//short circuit  : 연산을 다 안하고 쉬운 짧은 길로 간다는 의미 
		int i = 3;
		System.out.println((i > 0) && (i++ > 0)); // true
		System.out.println(i);  //4
		
		System.out.println((i < 0) && (i++ < 0));
		System.out.println(i); //4임. &&뒤를 연산하지 않은 것임. 왜냐하면 ,&&의 앞에가 false이므로 &&뒷 부분을 연산하지않아도 이미false이므로 &&앞만 연산하고  바로 끝냄
		
		System.out.println((i<0)||(i++<0));
		System.out.println(i); // 5
		
		System.out.println((i > 0) || (i++ > 0)); // short circuit
		System.out.println(i);  // 5임. || 앞이 true이므로 전체가 이미 true여서 ||뒤를 연산하지 않음. 그래서 i++가 적용안됨.
		
		// 반대로 & | 은 양쪽을 꼭 다 연산함
		System.out.println((i > 0) & (i++ > 0)); 
		System.out.println(i);  //6
		
		System.out.println((i < 0) & (i++ < 0)); //short circuit이 아님
		System.out.println(i);  //7
		
		//^(XOR)
		// 양변이 다를 때만 true, 양변이 같으면 false
		System.out.println(true^true);  //false
		System.out.println(true^false); //true
		System.out.println(false^true); // true
		System.out.println(false ^ false); //false
		

		
		
	}
}

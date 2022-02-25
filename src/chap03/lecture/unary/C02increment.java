package chap03.lecture.unary;

public class C02increment {
	public static void main(String[] args) {
		// 증감연산자
		// 증가 : increment  ++ 
		// 감소 : decrement  --
		// 기본 값 : 다옴???????
		int i = 7;
		i++; // i가 원래 가지고 있는 값에 1을 더하는 것과 같다. i= i+1;
		System.out.println(i); //8
		
		i++;
		System.out.println(i);// 9
		
		i--; // 원래 가지고 있는 i값에서 1을 빼는 것과 같다. i=i-1;
		System.out.println(i); // 8
		i--;
		System.out.println(i); // 7
		
		//증감 연산자 위치는 : 피연산자 앞에 있어도 되고 뒤에 있어도 된다.
		++i; // i = i+1;
		System.out.println(i); // 8
		--i; // i =i-1;
		System.out.println(i); //7
		
		// ++i 다른 연산을 수행하기 전에 피연산자의 값인 i을 1 증가시킴
		// i++  다른 연산을 수행한 후에 피연산자인 i의 값을 1 증가시킴
		System.out.println(i);   // 7
		System.out.println(i++); // 7 , i를 먼저 인식하고 1을 더함
		System.out.println(i);   // 8
		
		System.out.println(i--); // 8
		System.out.println(i);   // 7
		
		System.out.println(++i); // 8
		System.out.println(i);   // 8
		
		System.out.println(--i); // 7
		System.out.println(i);   // 7
		
		
		int j = i++;  // 7
		int k = ++i;  // 9
		
		System.out.println(j);
		System.out.println(k);
		
		int l =i;  // 9
		i++;
		i++;
		int m = i; // 11
				
		
		
	}
}

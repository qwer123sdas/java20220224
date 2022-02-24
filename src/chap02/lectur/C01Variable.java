package chap02.lectur;

public class C01Variable {
	public static void main(String[] args) {
		// 변수 선언하는 방법
		// 타입 변수명;
		int name;

		// 변수명 : lowerCamelCase
		// 영문대소문자, 숫자, $, _
		// 숫자로 시작할 수 었음
		// 자바의 예약어(=keyword = reserved word)사용하지 못함
		// int int; 안됨
		// int 3name; 안됨
		// int my_nume; 되지만 관습상 사용하지 않음

		// 변수명 작성관습은 lowerCamelCase
		// int myName; ok
		
		// 변수에 저장된 값을 다른 명령문에서 사용가능함
		// 변수에 값 저장(할당, 대입)
		int var2;
		var2 =3; //할당(대입) 연산자 사용
		
		System.out.println(var2);
		
		var2 =5;  // 값 변경 가능
		System.out.println(var2);
		
		//변수 선언과 값 할당을 한번에 가능
		int var3 = 10;
		System.out.println(var3);
		
		var3 = 11;
		System.out.println(var3);
		
		//또 변수를 한번에 여러개 선언 가능
		int var4, var5, var6;
		var4 = 99;
		var5 = 10;
		var6 = 11;
		
		//변수 여러개 선언, 값 할당 가능
		int var7=11, var8=12, var9=13;
		
		//주의점 : 변수 선언 후, 값 할당하지 않고 사용하는 것은 불가능
		int var10;
		var10=99;
		System.out.println(var10);
		
		int var11;
		var11 = var10 +3;
		System.out.println(var11);
		
		
		
		
 
	}

}

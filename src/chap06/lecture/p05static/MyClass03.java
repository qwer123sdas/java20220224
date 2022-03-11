package chap06.lecture.p05static;

public class MyClass03 {
	int field1;
	MyClass03(){
		field1 = 10;
	}
	
	
	/*<<----------------------------------------------------------->>*/
	
	static int field2;
	static {      // 정적 초기화 블럭(멈춰있는 블럭이다)
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum +=i;
		}
		field2 = sum;
	}
}

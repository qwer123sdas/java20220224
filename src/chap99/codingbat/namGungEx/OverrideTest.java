package chap99.codingbat.namGungEx;

class MyPoint extends Object{
	int x;
	int y;
	
	String getLoctation() {
		return "x: " + x + ", y: " + y;
	}
	
	// Object클래스의 toString()을 오버라이딩 한 것.
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
}


class MyPoint3D extends MyPoint{
	int z;
	
	// 조상의 메소드를 오버라이딩
	String getLoctation() {
		return "x: " + x + ", y: " + y + ", z: " + z;
	}
}

public class OverrideTest {
	public static void main(String[] args) {
		MyPoint3D p1 = new MyPoint3D();
		p1.x = 3;
		p1.y = 5;
		p1.z = 7;
		System.out.println(p1.getLoctation()); // 오버라이딩된 것을 호출
		//상속을 받긴 받는데, 조상꺼는 안쓰고 자손것을 쓴다.
		//자세한건 나중에 공부
		
		MyPoint p2 = new MyPoint();
		p2.x = 3; 
		p2.y = 5;
		System.out.println(p2);  // 왜??
		
		System.out.println(p2.toString());
	}
}

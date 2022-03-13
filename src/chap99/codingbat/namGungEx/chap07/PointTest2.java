package chap99.codingbat.namGungEx.chap07;

public class PointTest2 {
	public static void main(String[] args) {
		MyPoint3D p3 = new MyPoint3D();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	} 
}

class MyPoint{
	int x = 10;
	int y = 20;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class MyPoint3D extends MyPoint{
	int z =30;
	
	MyPoint3D(){
		this(100, 200, 300);
	}
	MyPoint3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
}
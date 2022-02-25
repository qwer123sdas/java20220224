package chap03.book.exercise;

public class Exersize02 {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=(++x) + (y--);
		System.out.println(z); //11 + 20
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((double)(lengthTop) + lengthBottom)*height/2;
		System.out.println(area);
		

	}
}

package chap01;

class Card {

	String kind;
	int number;

	static int width = 200;
	static int height = 250;
}

public class randomJava {

	public static void main(String[] args) {
		System.out.println("Card.width =" + Card.width);
		System.out.println("Card.height =" + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Space";
		c2.number = 4;

		System.out.println("c1은" + c1.kind + "," + c1.number);
		System.out.println("c2은" + c2.kind + "," + c2.number);

		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1과 c2의 width와 height는" + c1.width + c1.height + c2.width+c2.height +"으로 변경됨" );
	}

}

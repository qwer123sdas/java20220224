package chap99.codingbat.namGungEx.chap07;

class Card{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card(){
		this("HEART", 1); // Card(String kind, int num)생성자를 가리킴.
	}
	
	public String toString() {
		return "" + KIND + "" + NUMBER;
	}
	
}

public class FinalCardTest {
	public static void main(String[] args) {
		Card c = new Card("HEART", 10);
//		c.NUMBER = 5; //오류, 왜냐하면 final키워드가 있어서
		
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
	}
}

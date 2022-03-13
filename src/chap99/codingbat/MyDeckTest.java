package chap99.codingbat;



// 카드
class Card {
	static final int KIND_MAX = 4; // 카드 무늬의 수
	static final int NUM_MAX = 13; // 무늬별 카드 수

	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind;
	int number;

	Card() {
		this(SPADE, 1);
	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String kind = "";
		String number = "";

		switch (this.kind) {
		case 4:
			kind = "SPADE";
			break;
		case 3:
			kind = "DIAMOND";
			break;
		case 2:
			kind = "HEART";
			break;
		case 1:
			kind = "CLOVER";
			break;
		default:
		}

		switch (this.number) {
		case 13:
			number = "K";
			break;
		case 12:
			number = "Q";
			break;
		case 11:
			number = "J";
			break;
		default:
			number = this.number + "";
		}
		return "kind : " + kind + ", number : " + number;
	}
}

// 카드 댁 구성하기
class Deck {
	final static int CARD_NUM = 52;
	Card[] cardDeck = new Card[CARD_NUM]; // Card 객체 배열 생성 ??

	// Deck의 카드를 초기화한다.
	Deck() {
		int i=0;
		
		for(int k= Card.KIND_MAX; k>0; k--) {
			for(int n=1; n<=Card.NUM_MAX; n++) {
				cardDeck[i++] = new Card(k, n);  // Card(int kind, int number)메소드 호출
			}
		}
	}
	// Deck에서 카드 하나를 선택한다.
	Card pick() {
		int select = (int)(Math.random()*CARD_NUM); // 왜 1 안더함???????????????? ==> cardDeck 배열이 0부터 시작하니까
		return pick(select);
	}

	// 지정된 위치(index)에 있는 카드 하나를 선택한다.
	Card pick(int index) {
		return cardDeck[index % CARD_NUM];
	}

	// 카드 섞기
	void shuffle() {
		// 카드의 순서를 섞는다?
		for(int n=0; n<1000; n++) {
			int i = (int)(Math.random()*CARD_NUM);
			
			Card temp = cardDeck[0];   // 여기서 타입이 왜 Card?????????????
			cardDeck[0] = cardDeck[i];
			cardDeck[i] = temp;
		}
		
	}

}

// 메인
public class MyDeckTest {
	public static void main(String[] args) {
		// 카드 한 벌(Deck)을 만든다.
		Deck d = new Deck(); 
		
		// 처음에 가장 위에 있는 카드를 뽑는다.
		Card c = d.pick(0); // Card()메소드 호출
		System.out.println(c);
		
		System.out.println("모든 카드 호출 : ");
		for(int i=0; i<=Deck.CARD_NUM; i++) {
			System.out.println(d.pick(i));
		}
		
		// 카드를 섞는다.
		d.shuffle();
		// 섞은 다음 맨 위에 있는 것 뽑는다.
//		Card c1 = new d.pick();
		Card c1 = d.pick(0);
		System.out.println("섞은 후에 맨 위의 카드 뽑기 :");
		System.out.println(c1);

	}
}

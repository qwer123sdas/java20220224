package chap99.codingbat;

// 주사위 돌리기
class DiceDeck {
	static int DICE_NUM = (int) (Math.random() * 6) + 1;

}

// 주사위 뽑기
public class MyDice {
	public static void main(String[] args) {
		System.out.println(DiceDeck.DICE_NUM);
	}
}

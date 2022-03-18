package chap99.codingbat.namGungEx.chap07;

public class Ex7_10 {
	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new Dropship() };
		
		group[0].move(100,200);
		group[1].move(100,200);
		group[2].move(100,200);
	}
}


abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() { 
		// 현재위치 지정
	}
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("마린은"+ x +"," + y );
	}
	void stimPack() {
		System.out.println("스팀팩을 사용한다.");
	}
}
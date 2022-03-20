package chap99.codingbat.namGungEx.chap07;

public class FighterTest02 {
	public static void main(String[] args) {
		Fighter2 f = new Fighter2();
		
		if(f instanceof Unit) {
			System.out.println("f는 유닛클래스의 자손입니다.");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable인테피이스를 구현합니다.");
		}
		if(f instanceof Movable) {
			System.out.println("f는 movealbe인터페이스를 구현했습니다.");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		}
	}
}

class Unit2{
	int currentHp;
	int x;
	int y;
}

interface Fightable2 extends Movable, Attackable{}
interface Movable{ void move(int x, int y); }
interface Attackable{ void attack1(Unit2 u); }

class Fighter2 extends Unit2 implements Fightable2{
	public void move(int x, int y) {}
	@Override
	public void attack1(Unit2 u) {}
	
}
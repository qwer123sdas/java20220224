package chap99.codingbat.namGungEx.chap07;

public class RepairTest {
	public static void main(String[] args) {
		Tank t = new Tank();
	}
}

interface Repairable{}

class Unit01{
	int hitPoint;
	final int MAX_HP;
	Unit01(int hp){
		MAX_HP = hp;
	}
}

class AirUnit01 extends Unit01{
	AirUnit01(int hp){
		super(hp);
	}
}

class GroundUnit extends Unit01{
	GroundUnit(int hp){
		super(hp);
	}
	
	public String toString() {
		return "Tank";
	}
}

class Tank01 extends GroundUnit implements Repairable{
	Tank01(){
		super(150);
		hitPoint = MAX_HP;
	}
}

class Dropship extends AirUnit01 implements Repairable{
	Dropship(){
		super(125);
	}
	public String toStrign() {
		return "DropShip";
	}
}

class Marine01 extends GroundUnit{
	Marine01(){
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV01 extends GroundUnit implements Repairable{
	SCV01(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if (r instanceof Unit01) {
			Unit01 u = (Unit01)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println("수리 완료");
		}
	}
}

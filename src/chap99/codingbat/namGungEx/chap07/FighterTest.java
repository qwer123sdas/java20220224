package chap99.codingbat.namGungEx.chap07;

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춥니다.");
	}
}

interface Fightable{ // 인터페이스의 모든 메서드는 public abstract이다. 예외없이!
	void move(int x, int y);
	void attack(Fightable f);
}

class Fighter extends Unit implements Fightable{
	
	// 오버라이딩 규칙 : 조상보다 접근제어자가 좁으면 안된다.
	// 그래서 pulbic보다 좁으면 안됨. 즉 default나 protected도 안됨.
	public void move(int x, int y) {
		System.out.println("[" + x + ", " + y + "]로 이동");
	}
	
	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}
	
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
	}
}



public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter());
		
		Fighter f2 = new Fighter();
		f.attack(f2);
		
		
		Fightable f3 = f.getFightable();
		
		
	}
}

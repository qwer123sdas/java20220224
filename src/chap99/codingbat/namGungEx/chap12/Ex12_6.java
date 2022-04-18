package chap99.codingbat.namGungEx.chap12;

enum Direction2{
	// 밑에는 모두 생성자 호출이다.
	EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");
	// 배열
	private static final Direction2[] DIR_ARR = Direction2.values();
	// 생성자를 위한 상수들
	private final int value;
	private final String symbol;
	
	Direction2(int value, String symbol){
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() {
		return value;
	}
	public String getSymbol() {
		return symbol;
	}
	
	// of 메소드 : 상수들 중의 하나를 얻어 오기 위해 사용
	public static Direction2 of(int dir) {
		if(dir < 1 || dir > 4) {
			// 0~3범위 벗어나면 예외 발생
			throw new IllegalArgumentException("Invalid value : " + dir);
		}
		
		return DIR_ARR[dir - 1];
	}
	
	public Direction2 rotate(int num) {
		num = num % 4;
		if(num < 0) { num += 4; } // 음수일 땐 시계 반대 방향으로 회전
		return DIR_ARR[(value - 1 + num) % 4]; 
	}
}

public class Ex12_6 {
	public static void main(String[] args) {
		for(Direction2 d : Direction2.values()) {
			System.out.printf("%s = %d%n", d.name(), d.getValue());
			System.out.print("(ordinal)");
			System.out.printf("%s = %d%n", d.name(), d.ordinal());
		}
		Direction2 d1 = Direction2.EAST;
		Direction2 d2 = Direction2.of(1);
		
		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d1=%s, %d%n", d2.name(), d2.getValue());
		System.out.println(Direction2.EAST.rotate(1));
		System.out.println(Direction2.EAST.rotate(2));
		System.out.println(Direction2.EAST.rotate(-1));
		System.out.println(Direction2.EAST.rotate(-2));
	}
}

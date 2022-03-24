package chap13.book.p130201;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("홍길동");
		String name = box.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(3);
		
	}
}

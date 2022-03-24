package chap13.book.p130301;



public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setMode("스마트티비");
		Tv tv = product1.getKind();
		String tvModel =product1.getMode();
	}
}

class Tv{
	
}

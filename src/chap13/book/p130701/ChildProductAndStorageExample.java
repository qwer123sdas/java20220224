package chap13.book.p130701;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String>product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("Smart tv");
		product.setCompany("samsung");
		
		Stroage<Tv> storage = new StorageImpl<>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}
}

class Tv{
	
}
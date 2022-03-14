package chap06.book.exercise.p18;

public class ShopService {
	private static ShopService shopService = null;
	
	private ShopService() {
		
	}
	
	public static ShopService getInstace() {
		if(shopService == null) {
			shopService = new ShopService();
		}
		return shopService;
	}
}

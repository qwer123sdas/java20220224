package chap06.book.exercise.p18;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstace();
		ShopService obj2 = ShopService.getInstace();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체입니닫.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
	}
}

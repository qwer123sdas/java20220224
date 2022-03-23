package chap11.book.p111204;

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("[-128~127 초과값인 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("obj1==obj2 : " + (obj1==obj2));
		System.out.println("언박식한 결과 : " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals 결과 : " + obj1.equals(obj2));
		
		System.out.println("[-128~127 범위인 경우]");
		Integer obj3 = 100;
		Integer obj4 = 100;
		System.out.println("obj3==obj4 : " + (obj3==obj4));
		System.out.println("언박식한 결과 : " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals 결과 : " + obj3.equals(obj4));
	}
}

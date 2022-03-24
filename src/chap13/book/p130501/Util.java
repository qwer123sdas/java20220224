package chap13.book.p130501;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue(); // 자동박싱
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}

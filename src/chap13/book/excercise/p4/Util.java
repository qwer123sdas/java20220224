package chap13.book.excercise.p4;

public class Util {
//	public static Integer getValue(Pair pair, String str) {
//		if(pair.getKey() == str) {
//			return (Integer) pair.getValue();
//		}
//		return null;
//	}
	
	public static <T extends Pair<?, Integer>> Integer getValue(T pair, String str) {
		Object key = pair.getKey();
		if(key.equals(str)) {
			return pair.getValue();
		}
		return null;
	}
}

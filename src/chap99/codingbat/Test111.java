package chap99.codingbat;

public class Test111 {
	
	public static void main(String[] args) {
		jjjoin(new MyString());
	}
	
	static void jjjoin(CharSequence param) {
		
		param.length();
		param.charAt(3);
		param.subSequence(0, 0);
		
//		param.mmm
	}
}


class MyString implements CharSequence {
	
	public int mmmmethod() {
		return 0;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

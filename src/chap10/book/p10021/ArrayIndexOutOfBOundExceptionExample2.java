package chap10.book.p10021;

public class ArrayIndexOutOfBOundExceptionExample2 {
	public static void main(String[] args) {
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println(data1);
			System.out.println(data2);
		}else {
			System.out.println("실행방법");
			System.out.println("java ArrayIndexOfBoundException");
			System.out.println("값 1 ㄱ밧 2");
		}
	}
}

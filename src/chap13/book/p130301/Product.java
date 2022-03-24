package chap13.book.p130301;

public class Product<T, M> {
	private T kind;
	private M mode;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public M getMode() {
		return mode;
	}
	public void setMode(M mode){
		this.mode = mode;
	}
}

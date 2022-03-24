package chap13.book.p130701;

public interface Stroage<T> {
	public void add(T item, int index);
	public T get(int dex);
}

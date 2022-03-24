package chap13.book.p130701;

public class StorageImpl<T> implements Stroage<T>{
	private T[] array;
	
	public StorageImpl(int capacity) {
		this.array = (T[])(new Object[capacity]);
	}
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}
	@Override
	public T get(int index) {
		return array[index];
	}

}

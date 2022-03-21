package chap10.book.p100702;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money)throws BalanceInsufficientException{
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족 : " + (money - balance) + " 모자람");
		}
		balance -= +money;
	}
}

class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}

package chap06.book.exercise.p20;

public class Account {
	// 필드
	private String ano;
	private String owner;
	private int balance;
	
	// 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	
	
	// ano
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	// owner
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	// balance
	public int getBalance() {
		return balance;
	}
	public void setBalanace(int balance) {
		this.balance = balance;
	}

}

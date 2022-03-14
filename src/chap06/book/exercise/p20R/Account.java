package chap06.book.exercise.p20R;

public class Account {
	//필드
	private String ano; // 계좌번호
	private String owner; // 계좌 주인
	private int balance; // 금액
	
	// 생성자
	Account(String ano, String owner, int balance){
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// 계좌번호
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	// 계좌 주인
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	// 금액
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

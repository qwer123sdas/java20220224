package chap06.book.exercise.p20R;

import java.util.Scanner;

import chap06.book.exercise.p20.Account;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("-------");
				System.out.println("계좌생성");
				System.out.println("-------");

				createAccount();

			} else if (selectNo == 2) {
				System.out.println("-------");
				System.out.println("계좌목록");
				System.out.println("-------");

				accountList();
			} else if (selectNo == 3) {
				System.out.println("-------");
				System.out.println("예금");
				System.out.println("-------");

				deposit();
			} else if (selectNo == 4) {
				System.out.println("-------");
				System.out.println("출금");
				System.out.println("-------");

				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println(" 프로그램 종료");
		// 스캐너 닫기
		scanner.close();
	}

// 계좌 입력--------------------------------------------------
	private static void createAccount() {
		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		System.out.print("이름 : ");
		String owner = scanner.next();
		
		System.out.print("금액 : ");
		int balance = scanner.nextInt();

		Account newAccount = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				break;
			}
		}
		System.out.println("등록되었습니다.");
	}

// 계좌 확인--------------------------------------------------
	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.print(accountArray[i].getAno() + "\t");
				System.out.print(accountArray[i].getOwner() + "\t");
				System.out.println(accountArray[i].getBalance() + "\t");
			}
		}

	}

	private static void withdraw() {
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		System.out.print("예금액 : ");
		int inputNum = scanner.nextInt();
		
		// 계좌 찾기
		Account a = findAccount(ano);
		
		// 정산
		a.setBalanace(a.getBalance() + inputNum);
		

	}

	private static void deposit() {
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		System.out.print("출금액 : ");
		int outNum = scanner.nextInt();
		
		// 계좌 찾기
		Account a = findAccount(ano);
		
		// 정산
		a.setBalanace(a.getBalance() - outNum);

	}
	
	// 계좌 찾기
	private static Account findAccount(String ano) {
		Account newAccount = null;
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String accountNum = accountArray[i].getAno();
				if(accountNum.equals(ano)) {
					newAccount = accountArray[i];
					break;
				}
			}
			
		}
		return newAccount;
	}
	
}

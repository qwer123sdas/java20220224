package chap06.book.exercise.p20;

import java.util.Scanner;

public class BankApplication {
	// 생성자 호출 ? 없는데 왜 만들기 가능???
	// Account객체를 100개 담을 수 있는 배열이니까 상관없음.!!!!!!!!!!!!!!
	// 메인 메소드에서 사용할 수 있게 static 붙인것.
	private static Account[] accountArray = new Account[100];

	// 스캐너 생성자 호출
	// 메인 메소드에서 사용할 수 있게 static 붙인것.
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

	// 메소드
	// 계좌 생성하기------------------------------------------------
	private static void createAccount() {
		System.out.print("계좌번호 : ");
		String accountNum = scanner.next();

		System.out.print("계좌주 : ");
		String accountOwner = scanner.next();

		System.out.print("초기입금액 : ");
		int accountBal = scanner.nextInt();

		// 내가 놓친 부분 : 생성자 호출
		Account newAccount = new Account(accountNum, accountOwner, accountBal);
		// 당연한 거였다
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount; // 객체 주소를 넣은것.
				break;
			}
		}
		System.out.println("결과 : 계좌가 생성되었습니다.");

	}

	// 계좌 목록보기-----------------------------------------------------
	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.print(accountArray[i].getAno() + "\t");
				System.out.print(accountArray[i].getOwner() + "\t");
				System.out.println(accountArray[i].getBalance());
			}
		}
	}

	// 예금하기-----------------------------------------------------------
	private static void deposit() {
		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		System.out.print("예금액 : ");
		int inputM = scanner.nextInt();

		// 계좌번호 찾기
		Account a = findAccount(ano);

		// 예금액 정산
		int accountNum = a.getBalance() + inputM;
		a.setBalanace(accountNum);

		System.out.println("결과 : 예금이 성공되었습니다.");

	}

	// 출금하기------------------------------------------------------------------
	private static void withdraw() {
		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		System.out.print("출금액 : ");
		int outM = scanner.nextInt();

		// 계좌번호 찾기 : 생성자 생성
		Account a = findAccount(ano);

		// 출금액 정산
		int accountNum = a.getBalance() - outM;
		a.setBalanace(accountNum);

		System.out.println("결과 : 출금이 성공되었습니다.");
	}

	// Account 배열에서 ano 와 동일한 Account 객체 찾기?
	// Account 의 메소드가 아님. 그럼 머임 객체 주소임? ㅇㅇ 리턴값임.
	private static Account findAccount(String ano) {
		Account account = null;

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String accountNum = accountArray[i].getAno();
				if (accountNum.equals(ano)) {
					account = accountArray[i];
					break;
				}else {
					System.out.println("다시 입력해 주세요.");
					break;
				}
			}
		}
		return account; // 놓침
	}

}

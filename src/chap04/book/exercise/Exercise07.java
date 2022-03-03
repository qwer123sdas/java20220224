package chap04.book.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int menu = 0;

		Scanner scanner = new Scanner(System.in);
		while (run) {

			if (menu != 4) {
				System.out.println("-----------------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("-----------------------------------");
				System.out.print("선택> ");
			}
			menu = scanner.nextInt();

//			if (menu == 1) {
//				System.out.println("예금액> 10000");
//			} else if (menu == 2) {
//				System.out.println("출금액> 20000");
//			} else if (menu == 3) {
//				System.out.println("잔고> 8000");
//			} else {
//				System.out.println("프로그램 종료");
//				run = false;
//			}

			switch (menu) {
			case 1:
				System.out.print("예금액>");
				balance += scanner.nextInt();
				break;

			case 2:
				System.out.print("출금액>");
				balance -= scanner.nextInt();
				break;

			case 3:
				System.out.println("잔고> " + balance);

				break;

			case 4:
				System.out.print("종료");
				run = false;
				System.out.println("프로그램 종료");
				break;
			}

		}
		scanner.close();
	}
}

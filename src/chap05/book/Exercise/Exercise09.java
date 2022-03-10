package chap05.book.Exercise;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int selectNo =0;

		while (run) {
//			studentNum =0;
			
			
			if (selectNo != 5) {
				System.out.println("------------------------------------------------------");
				System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
				System.out.println("----------------------------------------------------");
				System.out.print("선택> ");
			}
			selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; // ★★★★★★★★★★★★★★★★ 
				

			} else if (selectNo == 2) {
				
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
					
				}
			

			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
				

			} else if (selectNo == 4) {
				//최고 점수
				int firstNum =0;
				for (int i = 0; i < studentNum - 1; i++) {
					if (scores[i] > scores[i + 1]) {
						firstNum = scores[i];
					} else {
						firstNum = scores[i+1];
					}
				}
				// for(int score : scores){
				//   firstNum = (score > firstNum) ? score : firstNum;
				System.out.println("최고점수 : " + firstNum);

				//평균
				int sum = 0;
				for (int i = 0; i < studentNum; i++) {
					sum += scores[i];
				}
				System.out.println("평균 점수 : " + sum / (double)studentNum);
				

			} else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}

		}
		// 스캐너 닫기
		scanner.close();
	}
}

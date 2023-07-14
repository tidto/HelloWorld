package co.yedam.reference;

import java.util.Scanner;

public class ArrayPracticeExe {
	
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; //학생수.
		int[] scores = null; //학생점수를 저장하기 위한 배열.
		Scanner scn = new Scanner(System.in);
		int maxScores = 0;
		int sum = 0;
		int avg = 0;
		
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택>> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			if(selectNo == 1) {
				System.out.println("학생수>> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int [studentNum];
			}else if(selectNo == 2) {
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores[" + i + "] = ");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
			}else if(selectNo == 3) {
				for(int i=0; i<studentNum; i++) {
					System.out.println("scores[" + i + "] = " + scores[i]);
				}
				
			}else if(selectNo == 4) {
				
				
			}else if(selectNo == 5){
				run = false;
			}
			
		}
		System.out.println("end of prog");
	}
	
}

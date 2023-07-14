package co.yedam;

import java.util.Scanner;

public class WhileLoopExe {
	static Scanner scn = new Scanner(System.in);
	static int balance =0;
	public static void main(String[] args) {
		boolean run = true;
		// 은행 : 1.입금 2.출금 3.잔액 4.종료
		// 입금액 100,000이상 못받음, 50,000받고 52,000은 못받음
		// 마이너스 X : 잔액 40,000에서 그 아래로 출금X
		
		while(run) {
			System.out.println("은행 : 1.입금 2.출금 3.잔액 4.종료");
			System.out.println("선택>>  ");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1:
				inner();
				break;
			case 2:
				outter();
				break;
			case 3:
				check();
				break;
			case 4:
				run = false; 
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
		System.out.println("end of prog.");
		
	}//end of main()
	
	public static void inner() {
		System.out.printf("입금액을 입력>> ");
		int inner = balance + Integer.parseInt(scn.nextLine());
		if((inner + balance) > 100000) {
			System.out.printf("100,000만원이 넘어 입금이 불가능합니다.\n");
			return; //continue;
		}else {
			balance = inner + balance;
		}
		//break;
	}//end of inner()
	public static void outter() {
		System.out.printf("출금액을 입력>> ");
		int outter = balance - Integer.parseInt(scn.nextLine());
		if((outter - balance) < 0) {
			System.out.printf("잔액은 0원까지 가능합니다.\n");
			return; //continue;
		}else {
			balance = balance - outter;
		}
		//break;
	}//end of outter()
	public static void check() {
		System.out.printf("현재 잔액은 %d 입니다.\n", balance);
		//break;
	}//out of check()
	
	
}

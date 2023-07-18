package co.yedam.bank;

import java.util.Scanner;

// 사용자 화면
public class BankAppExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	
		BankApp app = new BankApp();
		Account[] accounts = new Account[10];
		
		boolean run = true;
		while(run) {
			System.out.println("1.등록, 2.입금, 3.출금, 4.잔액조회, 5.계좌목록");
			System.out.print("작업하실 기능을 선택하세요> ");
			int choice = Integer.parseInt(scn.nextLine());
//1.등록: 계좌번호, 예금주, 입금액
			if(choice == 1) {
				System.out.println("계좌를 등록합니다.");
				System.out.print("계좌번호> ");
				int acc = Integer.parseInt(scn.nextLine()); 
				System.out.print("예금주> ");
				String take = scn.nextLine();
				System.out.print("입금액> ");
				int inMo = Integer.parseInt(scn.nextLine()); 
		
				app.registerAccount(new Account(acc, take, inMo));
		
//2.입금: 계좌번호 -> 입금
			}else if(choice ==2 ) {
				System.out.println("입금_기능입니다.");
				System.out.print("입금하실 계좌번호를 작성해주세요> ");
				int acc = Integer.parseInt(scn.nextLine()); 
				System.out.print("입금하실 금액을 작성해주세요>> ");
				int pls = Integer.parseInt(scn.nextLine());
				app.deposit();
				
//3.출금: 계좌번호 -> 출금액
			}else if(choice ==3 ) {
				System.out.println("출금_기능입니다.");
				System.out.print("출금하실 계좌번호를 작성해주세요> ");
				int acc = Integer.parseInt(scn.nextLine()); 
				System.out.print("출금하실 금액을 작성해주세요>> ");
				int mns = Integer.parseInt(scn.nextLine());
				app.withdraw();
				
		
//4.잔액조회: 계좌번호 -> 잔액
			}else if(choice ==4 ) {
				System.out.println("잔액조회_기능입니다.");
				System.out.print("잔액조회할 계좌번호를 작성해주세요> ");
				int acc = Integer.parseInt(scn.nextLine());
				app.checkBalance();
				
//5.계좌목록: (바로출력)
			}else if(choice ==5 ) {
	
			}
		}	
	}
}
	

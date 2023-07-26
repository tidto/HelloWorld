package co.yedam.boardpkg;

import java.util.Scanner;

interface Menu {
	int ADD = 1, EDIT = 2, DEL = 3, LIST = 4, INFO = 5, EXIT = 6;
}

public class MainExe {
	public static void menuPrint() {
		System.out.println("1.등록 2.수정 3.삭제 4.목록 5.개인정보 6.종료");
		System.out.print("선택>> ");
	}

	public static void main(String[] args) {

		BoardService svc = new BoardApp(); // BoardDAO

		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.print("ID>> ");
			String id = scn.nextLine();
			System.out.print("PW>> ");
			String pw = scn.nextLine();
			if (svc.login(id, pw)) {// 로그인 후 다음 while
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패");
				continue;
			}
		}
		
		while(run) {
			menuPrint();
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case Menu.ADD:
				System.out.println("============ADD============");
				System.out.print("넘버> ");
				int num = Integer.parseInt(scn.nextLine());
				System.out.print("제목> ");
				String tit = scn.nextLine();
				System.out.print("내용> ");
				String con = scn.nextLine();
				System.out.print("저자> ");
				String wrt = scn.nextLine();
				System.out.print("등록날짜> ");
				String wrd = scn.nextLine();
				
				Board plus = new Board(num, tit, con, wrt, wrd);
				if(svc.addBoard(plus)) {
					System.out.println("Add Succeed...");
					break;
				}else {
					System.out.println("error");
					continue;
				}
				
			case Menu.EDIT:
				System.out.println("========ADJUSTMENT=========");
				System.out.print("수정할 글넘버>> ");
				int num2 = Integer.parseInt(scn.nextLine());
				System.out.print("제목> ");
				String tle = scn.nextLine();
				System.out.print("내용> ");
				String ten = scn.nextLine();
				System.out.print("등록날짜> ");
				String day = scn.nextLine();
				Board change = new Board(num2, tle, ten, day);	
				
				if(svc.editBoard(change)) {
					System.out.println("Adjustment Succeed...");					
					break;
				}else {
					System.out.println("error");
					continue;
				}
			case Menu.DEL:
				System.out.println("============DELETE==========");
				System.out.println("삭제할 넘버>> ");
				int num3 = Integer.parseInt(scn.nextLine());
				
				if(svc.delBoard(num3)) {
					System.out.println("Delete Succeed...");
					break;
				}else {
					System.out.println("error");
					continue;
				}
				
			case Menu.LIST:
				System.out.println("============LIST============");
				for (Board brd : svc.boardList()) {
					System.out.println(brd);
				}
				break;
			case Menu.INFO:
				System.out.println("==========PW_CHANGE==========");
				System.out.print("ID>> ");
				String id = scn.nextLine();
				System.out.print("현 PW>> ");
				String nowpw = scn.nextLine();
				System.out.print("NEW PW>> ");
				String newpw = scn.nextLine();
				
				User passCh = new User(id, nowpw, newpw);
				
				if(svc.modInfo(passCh)) {
					System.out.println("PW Ch Succeed...");
					break;
				}else {
					System.out.println("error");
					continue;
				}
				
			case Menu.EXIT:
				System.out.println("종료");
				run = false;
				break;
			}
		}
		System.out.println("end of prog.");
		scn.close();
	}
}

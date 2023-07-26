package co.yedam.test;

import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardApp app = new BoardApp();
		boolean run = true;

		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.목록조회 5.전체조회 6.저장 및 종료");
			System.out.print("선택>> ");
			int click = Integer.parseInt(sc.nextLine());

			if (click == 1) {
				System.out.println("====REGISTER====");
				System.out.print("넘버>> ");
				int no = Integer.parseInt(sc.nextLine());
				System.out.print("제목>> ");
				String til = sc.nextLine();
				System.out.print("내용>> ");
				String inn = sc.nextLine();
				System.out.print("작성자>> ");
				String wrt = sc.nextLine();
				System.out.print("작성일자>> ");
				String date = sc.nextLine();

				Board info = new Board(no, til, inn, wrt, date);
				if (app.register(info)) {
					System.out.println("Register Succeed...");
				} else {
					System.out.println("error");
					continue;
				}
			} else if (click == 2) {
				System.out.println("====MODIFY====");
				System.out.print("수정넘버>> ");
				int num = Integer.parseInt(sc.nextLine());
				System.out.print("제목> ");
				String tit = sc.nextLine();
				System.out.print("내용> ");
				String inn = sc.nextLine();
				Board change = new Board(num, tit, inn);
				if (app.modify(change)) {
					System.out.println("Modify Succeed...");
				} else {
					System.out.println("error");
					continue;
				}
				
			} else if (click == 3) {
				System.out.println("====SEARCH====");
				System.out.print("검색넘버>> ");
				int num = Integer.parseInt(sc.nextLine());
				app.search(num);
				
			} else if (click == 4) {
				System.out.println("====REMOVE====");
				System.out.print("삭제넘버>> ");
				int num = Integer.parseInt(sc.nextLine());
				app.remove(num);
				
			} else if (click == 5) {
				System.out.println("====LIST====");
				for (Board brd : app.list()) {
					System.out.println(brd);
				}
			} else if (click == 6) {
				System.out.println("저장 후 종료...");
				app.saveFile();
				run = false;
				break;
			}
		}
		System.out.println("end of prog");
	}
}

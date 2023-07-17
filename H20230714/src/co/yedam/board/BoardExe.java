package co.yedam.board;

import java.util.Scanner;

public class BoardExe {

	// 초기값 받기
	static Board[] boards = new Board[15];
	static Scanner scn = new Scanner(System.in);

	private static void init() {
		Board bookf = new Board(445, "poem", "chicken", "poemer");
		Board books = new Board(656, "SNS", "coffee", "socialer");
		boards[0] = bookf;
		boards[1] = books;
	}

	private static void addBoard() {
		System.out.println("글등록 기능");
		System.out.print("글_번호 등록>");
		int boNo = Integer.parseInt(scn.nextLine());
		System.out.print("글_제목 등록>");
		String boName = scn.nextLine();
		System.out.print("글_내용 등록>");
		String boIn = scn.nextLine();
		System.out.print("글_번호 등록>");
		String wri = scn.nextLine();

		Board board = new Board(boNo, boName, boIn, wri); // 인스턴스

		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}

	private static void list() {
		System.out.println("목록 확인");
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				System.out.println(boards[i].boSet());
			}
		}

	}

	private static void editBoard() {
		System.out.println("수정 기능");
		System.out.print("글_번호 입력> ");
		int bno = Integer.parseInt(scn.nextLine());
		System.out.print("수정할 내용 입력>> ");
		String inner = scn.nextLine();

		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBookNo() == bno) {
				boards[i].setBookIn(inner);
			}
		}
	}

	private static void delBoard() {
		System.out.println("삭제 기능");
		System.out.print("삭제할 글_번호 입력> ");
		int bno = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBookNo() == bno) {
				boards[i] = null;
				System.out.println("삭제완료");
				break;
			}
		}

	}

	private static void getBoard() {
		System.out.println("상세보기 기능");
		System.out.print("확인할 글_번호 입력> ");
		int bno = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBookNo() == bno) {
				System.out.println(boards[i].boFull());
			}
		}

	}

	public static void main(String[] args) {
		boolean run = true;

		init();

		while (run) {
			System.out.println("1.글등록 2.목록 3.수정 4.삭제 5.상세보기 6.종료");
			System.out.print("선택>> ");

			int select = Integer.parseInt(scn.nextLine());

			if (select == 1) {
				addBoard();
			} else if (select == 2) {
				list();
			} else if (select == 3) {
				editBoard();
			} else if (select == 4) {
				delBoard();
			} else if (select == 5) {
				getBoard();
			} else if (select == 6) {
				run = false;
				System.out.println("종료합니다.");
			}
		}

	}
}

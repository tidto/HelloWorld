package co.yedam.collect.board;

import java.util.List;
import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		String logId = "";
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		UserApp log = new UserApp();
		BoardApp brd = new BoardApp();
		
		// 로그인 처리 => 기능이용		
		while(run) {
			System.out.println("로그인 하세요");
			System.out.print("ID>> ");
			String id = scn.nextLine();
			System.out.print("PW>> ");
			String pw = scn.nextLine();
			
			if(log.users.containsKey(id)){
				if(log.users.get(id).equals(pw)) {
					System.out.println("Complete..");
					//run = false;
					break;
				}else {
					System.out.println("PW error");
				}
			}else {
				System.out.println("retry");
				continue;
			}

		}
		
		// 1.등록 2.목록 3.단건조회 4.삭제 9.종료
		while(run) {
			System.out.println("1.등록 2.목록 3.단건조회 4.삭제 9.종료");
			
			System.out.print(">> ");
			int check = Integer.parseInt(scn.nextLine());
			
			if(check == 1 ) {
				System.out.println("등록메뉴");
				System.out.print("boardNo> ");
				int bNo = Integer.parseInt(scn.nextLine());
				System.out.print("title> ");
				String title = scn.nextLine();
				System.out.print("content> ");
				String content = scn.nextLine();
				System.out.print("writer> ");
				String writer = scn.nextLine();
				
				brd.boards.add(new Board(bNo, title, content, writer));
				
			}else if(check == 2 ) {//★★★★★★★★
				System.out.println("목록확인");
				List<Board> list = brd.boardList();
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i).toString());
				}
				
			}else if(check == 3 ) {
				System.out.println("단건조회기능");
				System.out.print("check want No> ");
				int bNo = Integer.parseInt(scn.nextLine());	
				Board bd = brd.getBoard(bNo);
				if( bd == null) {
					System.out.println("조회결과가 없습니다.");
				}else {
					System.out.println(bd.toString());
				}
				
			}else if(check == 4 ) {
				System.out.println("삭제기능");
				System.out.print("del want No> ");
				int bNo = Integer.parseInt(scn.nextLine());	
				brd.delBoard(bNo);
				System.out.println("삭제완료");
				
			}else if(check == 9 ) {
				run = false;
				System.out.println("종료");
				break;
			}
		}
	}
}

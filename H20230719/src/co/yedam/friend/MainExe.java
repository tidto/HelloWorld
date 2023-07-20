package co.yedam.friend;

import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Friend friend = new Friend();
		AddressApp app = new AddressApp();
		boolean result = app.addFriend(null);
		boolean run = true;
		//등록 > 1학교, 2회사, 3친구
		
		int menu;
		
		while( run ) {
			try {
				menu = Integer.parseInt(scn.nextLine());				
			}catch(NumberFormatException e) {
				System.out.println("메뉴를 잘못 선택");
				//menu =2 ;
				continue;
			}
			System.out.println("1.등록 2.목록 3.수정 4.삭제 5.단건조회 6.종료");
			System.out.print("선택> ");
			
			if(menu == INIT_MENU.ADD) {
				System.out.println("1.학교 2.회사 3.친구");
				System.out.print("선택> ");
				int cho = Integer.parseInt(scn.nextLine());
				if(cho == 1) {
					System.out.println("학교 등록");
					System.out.print("학교> ");
					String univ = scn.nextLine();
					System.out.print("전공> ");
					String maj = scn.nextLine();
					
					friend = new UnivFriend(name, phone, univ, maj);
				}else if(cho == 2) {
					System.out.println("회사 등록");
					System.out.print("회사> ");
					String comp = scn.nextLine();
					System.out.print("부서> ");
					String dept = scn.nextLine();
					
					app.addComp(comp, dept);
				}else if(cho == 3) {
					System.out.println("친구 등록");
					System.out.print("이름> ");
					String name = scn.nextLine();
					System.out.print("연락처> ");
					String tel = scn.nextLine();
					
					app.addFrd(name, tel);
				}else {
					System.out.println("실패");
					break;
				}
				
			}else if(menu == 2) {
				System.out.println("목록");
				app.friendList();
				
				
			}else if(menu == 3) {
				System.out.println("수정");

			}else if(menu == 4) {
				System.out.println("삭제");
				
			}else if(menu == 5) {
				System.out.println("단건조회");

			}else if(menu == 6) {
				run = false;
				System.out.println("종료");
				break;
			}
		}
		
		if (result) {
			
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
//		//Friend <- CompFriend, UnivFriend
//		Friend[] friends = new Friend[10];
//		
//		//friends 배열에 Friend 클래스의 인스턴스 대입
//		friends[0] = new Friend("홍길동", "010-1111");
//		friends[1] = new CompFriend("김길동", "010-2222", "네이버", "db관리자");
//		friends[2] = new UnivFriend("이길동", "010-3333", "학교", "컴공");
//		
//		for(int i=0; i<3; i++) {
//			System.err.println(friends[i].showInfo()); //매소드 재 정의를 위한 
//		}
	
}

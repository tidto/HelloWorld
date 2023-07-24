package co.yedam.io;

import java.util.List;
import java.util.Scanner;

public class MemberManageExe {
	// 이름, 주소, 연락처 => 시작(초기값) 추가 수정 삭제 목록 저장 후 종료
	public static void main(String[] args) {
		MemberManage manager = new MemberManage();
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("1.추가 2.수정 3.삭제 4.목록 5.저장 후 종료");
			System.out.print("선택>> ");
			int check = Integer.parseInt(scn.nextLine());
			
			if(check == 1) {
				String [] data = null;
					System.out.println("이름 주소 연락처 작성...");
					String str = scn.nextLine();
					data = str.split(" ");
					// 등록값이 3개가 아닐때 재 입력
					if(data.length !=3) {
						System.out.println("재입력");
						continue;
					}
					Member member = new Member(data[0], data[1], data[2]);
					if(manager.addMember(member)) {
						System.out.println("등록");
					}else {
						System.out.println("실패");
					}
				
			}else if (check == 2) {
				System.out.println("이름 연락처 작성...");
				String str = scn.nextLine();
				String[] data = str.split(" ");
				Member member = new Member(data[0], "", data[1]);
				if(manager.editMember(member)) {
					System.out.println("변경");
				}else {
					System.out.println("실패");
				}
				
			}else if (check == 3) {
				System.out.println("이름 작성...");
				String str = scn.nextLine();
				if(manager.delMember(str)) {
					System.out.println("삭제");
				}else {
					System.out.println("실패");
				}
				
			}else if (check == 4) {
				List<Member> list = manager.list();
				for(Member member : list) { //확장코어
					System.out.println(member.toString());
				}
				
			}else if (check == 5) {
				System.out.println("저장 후 종료");
				manager.save1();
				run = false;
				
			}
			
		}
		System.out.println("end of prog");
		scn.close();
		
	}
}

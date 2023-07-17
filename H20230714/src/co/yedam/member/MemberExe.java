package co.yedam.member;

import java.util.Scanner;

public class MemberExe {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Member[] members = new Member[10]; // 저장가능 인스턴스 갯수
		//초기데이터 삽입
		Member m1 = new Member();
		m1.setMemberNo(1001);
		m1.setMemberName("닭");
		m1.setPhone("010-1111");
		m1.setGender(Gender.MEN);
		m1.setAddress("daegu");
		Member m2 = new Member();
		m2.setMemberNo(1002);
		m2.setMemberName("돼지");
		m2.setPhone("010-2222");
		m2.setGender(Gender.WOMEN);
		m2.setAddress("daegu");
		Member m3 = new Member();
		m3.setMemberNo(1003);
		m3.setMemberName("소");
		m3.setPhone("010-3333");
		m3.setGender(Gender.MEN);
		m3.setAddress("daegu");
		
		members[0] = m1; // 등록 : 배열의 위치에 변수를 대입.
		members[1] = m2; // 삭제 : 배열의 위치에서 null 값을 대입.
		members[2] = m3;
		
		Member m4 = new Member();
		members[3] = m4;
		
		Member m5 = new Member(3001, "콩","010-9999", Gender.WOMEN, "daegu");
		members[4] = m5;
		
		while(run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제 5.상세조회 6.성별 7.종료");
			System.out.print("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			
			if(menu == 1) {
				System.out.println("등록기능.");
				System.out.println("회원번호입력> ");
				int mNo = Integer.parseInt(scn.nextLine());
				System.out.println("회원이름입력> ");
				String mName = scn.nextLine();
				System.out.println("회원연락처입력> ");
				String phone = scn.nextLine();
				System.out.println("회원성별입력> ");
				System.out.println("회원주소입력> ");
				String addr = scn.nextLine();
				
				//남, 남자 startsWith()
				
				Gender gender = null;
				String temp = scn.nextLine();
				if(temp.startsWith("남")) {
					gender = Gender.MEN;
				}else if(temp.startsWith("여")) {
					gender = Gender.WOMEN;
				}
				
				Member member = new Member(); //인스턴스.
				member.setMemberNo(mNo);
				member.setMemberName(mName);
				member.setPhone(phone);
				member.setGender(gender);
				member.setAddress(addr);
				
				// members 멤버인스턴트 10개 저장
				for (int i=0; i<members.length; i++) {
					if(members[i] == null) {
						members[i] = member; // 배열의 빈값에 저장
						break; // 10자리 중 1자리만 적용한 후 반복문 종료
						}
				}

			//
			}else if(menu == 2) {
				System.out.println("목록기능.");
				for (int i=0; i<members.length; i++) {
					if(members[i] != null) {
						System.out.println(members[i].showInfo());
					}
				}
			//
			}else if(menu == 3) {
				System.out.println("수정기능.");
				
				System.out.print("회원번호입력> ");
				int no =Integer.parseInt(scn.nextLine());
				System.out.print("연락처입력>> ");
				String tel = scn.nextLine();
				
				for(int i=0; i<members.length; i++) {
					if(members[i] != null && members[i].getMemberNo() == no) {
						members[i].setPhone(tel);
					}
					}
					//System.out.println("찾는 회원이 없습니다.");
			
				
			//	
			}else if(menu == 4) {
				System.out.println("삭제기능.");
				System.out.print("회원번호입력>> ");
				int no = Integer.parseInt(scn.nextLine());
				
				for(int i=0; i<members.length; i++) {
					//배열의 값 중 null 확인
					if(members[i] != null && members[i].getMemberNo() == no) {
						//널이되면 삭제됨
						members[i] = null;
						System.out.println("삭제되었습니다.");
						//변경 후 반복문 종료
						break;
					}
				}
			//	
			}else if(menu == 5) {
				System.out.println("상세조회기능.");
				System.out.print("회원번호입력>> ");
				int no = Integer.parseInt(scn.nextLine());
				
				boolean isExist = false; //조회결과 존재 여부 체크
				
				for(int i=0; i<members.length; i++) {
					// 배열의 값중에서 null유무확인
					if(members[i] != null && members[i].getMemberNo() == no) {
						System.out.println(members[i].allInfo());
						isExist =true;
					}
				}
				if (isExist == false) {
					System.out.println("찾는 회원이 없습니다.");
				}
				
			//	
			}else if(menu == 6){
				for(int i=0; i<members.length; i++) {
					if(members[i] != null && members[i].getGender() == Gender.MEN) {
						System.out.println(members[i].showInfo());
					}
				}
			}else if(menu == 7) {
				System.out.println("종료.");
				run = false;
			}
		}
		System.out.println("end of prog");
	}
}

package co.yedam;

import java.util.Scanner;

public class Ex05 {
	private static final int NAME = 0;
	private static final int PHONE = 1;
	private static final int BIRTH = 2;
	private static final int HEIGHT = 3;

	private static final int maxFriend = 10;

	private static Scanner scn = new Scanner(System.in);
	private static Friend[] friends = new Friend[maxFriend];

	public static void main(String[] args) {
		boolean isLoop = true;
		while (isLoop) {
			System.out.println("1.등록 2.목록 3.전화번호수정 4.삭제 5.종료");
			int menu = Integer.parseInt(scn.nextLine());
			if (menu == 1) {
				System.out.println("입력(이름 전화번호 생년월일 키)>>");
				String str = scn.nextLine();
				String[] data = str.split(" ");

				boolean isRegister = register(new Friend(data[NAME], data[PHONE], data[BIRTH], data[HEIGHT]));

				if (isRegister) {
					System.out.println("**등록완료**");
				} else {
					System.out.println("**등록실패**");
				}
			} else if (menu == 2) {
				list();
			} else if (menu == 3) {
				System.out.println("입력(이름 전화번호)>>");
				String str = scn.nextLine();
				String[] data = str.split(" ");

				if (modify(data[NAME], data[PHONE])) {
					System.out.println("**수정완료**");
				} else {
					System.out.println("**수정실패**");
				}
			} else if (menu == 4) {
				System.out.println("입력(이름)>>");
				String name = scn.nextLine();

				if (remove(name)) {
					System.out.println("**삭제완료**");
				} else {
					System.out.println("**삭제실패**");
				}
			} else if (menu == 5) {
				isLoop = false;
			}
		}
		System.out.println("end of prog");
	} // end of main

	public static boolean register(Friend friend) {
		for (int i = 0; i < friends.length; ++i) {
			if (friends[i] == null) {
				friends[i] = friend;
				return true;
			}
		}
		return false;
	}

	public static void list() {
		for (int i = 0; i < friends.length; ++i) {
			if (friends[i] != null) {
				System.out.println(friends[i]);
			}
		}
	}

	public static boolean modify(String name, String phone) {
		for (int i = 0; i < friends.length; ++i) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i].setPhone(phone);
				return true;
			}
		}
		return false;
	}

	public static boolean remove(String name) {
		for (int i = 0; i < friends.length; ++i) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				return true;
			}
		}
		return false;
	}
}

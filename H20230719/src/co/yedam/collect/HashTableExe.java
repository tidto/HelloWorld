package co.yedam.collect;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExe {
	public static void main(String[] args) {
		Map<String, String> users //
			= new Hashtable<String, String>();
		
		users.put("Spring", "12");
		users.put("Summer", "34");
		users.put("Fall", "56");
		users.put("Winter", "78");
		
		Scanner scn = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("아이디와 비밀번호를 입력>>> ");
			System.out.print("ID>> ");
			String id = scn.nextLine();
			System.out.print("PW>> ");
			String pw = scn.nextLine();
			
			if(users.containsKey(id)) {
				if(users.get(id).equals(pw)) {
					System.out.println("Complete..");
					run = false;
				}else {
					System.out.println("비밀번호가 다릅니다.");
				}
			}else {
				System.out.println("아이디가 존재x");
			}
		}//while
		
		System.out.println("프로그램 시작");
	}//prog
}

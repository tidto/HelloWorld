package co.yedam.exceptions;

import java.util.Scanner;

public class ExceptionExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		
		System.out.println("이름>> ");
		String name = scn.nextLine();
		
		int age;
		while(run) {
			try {
				System.out.println("나이>> ");
				age = Integer.parseInt(scn.nextLine());
				break;
			} catch(NumberFormatException e){
				System.out.println("번호를 입력해주세요");
				continue;
			}
		}
			
			System.out.println("주소>> ");
			String addr = scn.nextLine();
			
		while(run) {
			try {
				age = Integer.parseInt(scn.nextLine());
				name = scn.nextLine();
				addr = scn.nextLine();
	 		System.out.printf("이름은 %s, 나이는 %d, 주소는 %s", //
							  name, age, addr);
			} catch(NullPointerException | NumberFormatException b) {
				System.out.println("정보가 없습니다.");
				continue;
			}
		}
	}
}

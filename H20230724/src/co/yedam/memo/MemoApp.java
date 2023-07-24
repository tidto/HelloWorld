package co.yedam.memo;

import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		MemoManager manager = new MemoManager();
		
		int menu = -1;
		
		while (true) {
			manager.printMemu();
			menu = Integer.parseInt(scn.nextLine());
			
			if(menu == 1) {
				manager.inpoutDate();
				
			}else if(menu == 2) {
				manager.searchData();
				
			}else if(menu == 3) {
				manager.deleteData();
				
			}else if(menu == 4) {
				System.out.println("종료");
				break;
			}
		}
		System.out.println("end of prog");
		scn.close();
	}
}

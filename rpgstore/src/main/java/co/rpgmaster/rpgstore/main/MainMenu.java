package co.rpgmaster.rpgstore.main;

import java.util.Scanner;

import co.rpgmaster.rpgstore.item.handle.ItemHandle;
import co.rpgmaster.rpgstore.item.handle.ItemVO;
import co.rpgmaster.rpgstore.item.handleImpl.ItemHandleImpl;

public class MainMenu {
	private Scanner sc = new Scanner(System.in);
	private ItemHandle ih = new ItemHandleImpl();// DB

	private void mainInventory() {
		System.out.println("=========== 창고 관리 ===========");
		System.out.println(" ㄴ>  1. 새로운 아이템을 추가한다.    ");
		System.out.println(" ㄴ>  2. 아이템 가격을 수정한다.	  ");
		System.out.println(" ㄴ>  3. 아이템을 삭제한다.		  ");
		System.out.println(" ㄴ>  4. 아이템 입고지를 작성한다.	  ");
		System.out.println(" ㄴ>  5. 아이템 출고지를 작성한다. 	  ");
		System.out.println(" ㄴ>  6. 아이템 출고지를 작성한다. 	  ");
		System.out.println("==============================");


	}

	public void inventoryManagement() {
		boolean run = false;
		do {
			mainInventory();
			sc.nextLine();
			int key = sc.nextInt();
			switch (key) {
			case 1:
				itemAdd();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				System.out.println("==========창고관리 마무리==========");
				run = true;
				break;
			}
		} while (!run);
	}

	//////////////////CURD

	private void itemAdd() {
		ItemVO item = new ItemVO();
		System.out.println("===새로 들일 아이템 입력===");
		System.out.print(">> ");
		System.out.print(">> ");
		System.out.print(">> ");
		System.out.print(">> ");
		System.out.print(">> ");
		String id = sc.nextLine();
		
		
	}
}

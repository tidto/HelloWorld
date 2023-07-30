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
		System.out.println(" ㄴ>  6. 창고 관리를 마무리한다. 	  ");
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
		System.out.println("======= 새로 들일 아이템 입력 =======");

		System.out.print("아이템 넘버>> ");
		System.out.print("아이템 이름>> ");
		System.out.print("아이템 종류>> ");
		System.out.print("가격>> ");
		System.out.print("들일 수량>> ");
		String id = sc.nextLine();
		
		
	}
}



///////// 'o o o 아이템이 추가 되었다.' 옵션 입력 후 시간 텀 주기
//try {
//    System.out.println("Start..." + new Date());
//    // delay 0.5 second
//    //TimeUnit.MICROSECONDS.sleep(500);
//    System.out.println("End..." + new Date());
//
//	
//} catch (InterruptedException e) {
//    System.err.format("IOException: %s%n", e);
//}
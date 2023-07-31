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
		System.out.println(" ㄴ>  4. 아이템 재고를 확인한다.	  ");
		System.out.println(" ㄴ>  5. 아이템 입고지를 작성한다.	  ");
		System.out.println(" ㄴ>  6. 아이템 출고지를 작성한다. 	  ");
		// 출입고 히스토리 조회
		System.out.println(" ㄴ>  7. 창고 관리를 마무리한다. 	  ");
		System.out.println("==============================");
		System.out.print(" 어떤 작업을 할까... ");

	}

	public void inventoryManagement() {
		boolean run = false;
		do {
			mainInventory();
			
			int key = sc.nextInt();
			switch (key) {
			case 1:
				itemClassAdd();
				break;
			case 2:
				itemEscalation();
				break;
			case 3:
				itemFree();
				break;
			case 4:
				itemStock();
				break;
			case 5:

				break;
			case 6:

				break;
			case 7:
				System.out.println("========= 창고관리 마무리 =========");
				run = true;
				break;
			}
		} while (!run);
	}

	////////////////// CURD

	private void itemClassAdd() { // 아이템 새로 추가
		System.out.println();
		System.out.println("======== 등록할 아아템 구분 ========");
		System.out.println(" ㄴ> 잡화  ㄴ> 방어구  ㄴ> 무기");
		System.out.print(" 어떤 종류를 추가할까... ");
		String type = null; 
		type = sc.nextLine();
		sc.nextLine();
		ItemVO item = new ItemVO();
		
		if (type.equals("잡화")) { // 잡화

			System.out.println("======= 새로 들일 잡화 입력 =======");

			// 아이템 넘버는 타입에 따라 시작번호 선정
			System.out.print(" 잡화 번호 :: ");
			int no = Integer.parseInt("100") //
					+ Integer.parseInt(sc.nextLine());

			System.out.print(" 잡화 이름 :: ");
			String name = sc.nextLine();

			// 방어구 종류는 분류에서 선택한 type 입력
			
			System.out.print(" 가격 :: ");
			int price = Integer.parseInt(sc.nextLine());

			System.out.print(" 들일 수량 :: ");
			int pieces = Integer.parseInt(sc.nextLine());

			// (no, name, type, price, pieces)
			item.setItemNo(no);
			item.setItemName(name);
			item.setItemType(type);
			item.setItemPrice(price);
			item.setItemPieces(pieces);
			if(ih.itemInventoryAdd(item) != 0 ) {
				System.out.println(" 새로운 잡화를 팔수있게 되었다...\n");
			}else {
				System.out.println(" 제대로 입력되지 않은 걸까? 실패했다...\n");
			}

		} else if (type.equals("방어구")) { // 방어구
			System.out.println("======= 새로 들일 방어구 입력 =======");

			// 아이템 넘버는 타입에 따라 시작번호 선정
			System.out.print(" 방어구 번호 :: ");
			int no = Integer.parseInt("200") //
					+ Integer.parseInt(sc.nextLine());

			System.out.print(" 방어구 이름 :: ");
			String name = sc.nextLine();

			// 방어구 종류는 분류에서 선택한 type 입력

			System.out.print(" 가격 :: ");
			int price = Integer.parseInt(sc.nextLine());

			System.out.print(" 들일 수량 :: ");
			int pieces = Integer.parseInt(sc.nextLine());

			// (no, name, type, price, pieces)
			item.setItemNo(no);
			item.setItemName(name);
			item.setItemType(type);
			item.setItemPrice(price);
			item.setItemPieces(pieces);
			if(ih.itemInventoryAdd(item) != 0 ) {
				System.out.println(" 새로운 방어구를 팔수있게 되었다...\n");
			}else {
				System.out.println(" 제대로 입력되지 않은 걸까? 실패했다...\n");
			}

		} else if (type.equals("무기")) { // 무기
			System.out.println("======= 새로 들일 무기 입력 =======");

			// 아이템 넘버는 타입에 따라 시작번호 선정
			System.out.print(" 무기 번호 :: ");
			int no = Integer.parseInt("300") //
					+ Integer.parseInt(sc.nextLine());

			System.out.print(" 무기 이름 :: ");
			String name = sc.nextLine();

			// 방어구 종류는 분류에서 선택한 type 입력

			System.out.print(" 가격 :: ");
			int price = Integer.parseInt(sc.nextLine());

			System.out.print(" 들일 수량 :: ");
			int pieces = Integer.parseInt(sc.nextLine());

			// (no, name, type, price, pieces)
			item.setItemNo(no);
			item.setItemName(name);
			item.setItemType(type);
			item.setItemPrice(price);
			item.setItemPieces(pieces);
			if(ih.itemInventoryAdd(item) != 0 ) {
				System.out.println(" 새로운 무기를 팔수있게 되었다...\n");
			}else {
				System.out.println(" 제대로 입력되지 않은 걸까? 실패했다...\n");
			}

		} else {
			System.out.println("\n 잘못 입력된거 같군...\n");
		}
	}

	private void itemEscalation() { // 아이템 물가변동 가격수정
		ItemVO item = new ItemVO();
		System.out.println();
		System.out.println("========  아이템 가격 변경  ========");
		System.out.print(" 가격을 변경할 아이템의 번호를 고르자...");
		int no =sc.nextInt();
		System.out.print(" 가격 조정을 얼마로 할까?...");
		int flation =sc.nextInt();
		
		item.setItemNo(no);
		item.setItemPrice(flation);
		if(ih.itemEscalation(item) != 0) { 
			System.out.println(" 아이템 가격을 변경했다... \n");
		}else {
			System.out.println(" 번호를 잘못 적은 걸까? 실패했다...");
		}
	}

	private void itemFree() { // 아이템 단종
		ItemVO item = new ItemVO();
		System.out.println();
		System.out.println("=========== 아이템 처분 ===========");
		System.out.print(" 처분할 아이템의 번호를 고르자...");
		int free =sc.nextInt();
		
		item.setItemNo(free);
		if(ih.itemFree(item) != 0) {
			System.out.println(" 아이템이 처분되었다... \n");
		}else {
			System.out.println(" 번호를 잘못 적은 걸까? 실패했다...");
		}
	}

	private void itemStock() { // 아이템 타입별 재고확인
		ItemVO item = new ItemVO();
		System.out.println();
		System.out.println("======== 타입별 아이템 조회 ========");
		System.out.println(" ㄴ> 잡화  ㄴ> 방어구  ㄴ> 무기");
		System.out.print(" 어떤 종류를 조회할까... ");
		String stock = sc.nextLine();
		sc.nextLine();
		
		item.setItemType(stock);
		item = ih.itemStock(item);
		System.out.println(item.toString());
		System.out.println("\n");
	}
}

///////// 'o o o 아이템이 추가 되었다.' 옵션 입력 후 시간 텀 주기
//try {
//    System.out.println(". " + new Date());
//    // delay 0.5 second
//   	TimeUnit.MICROSECONDS.sleep(200);
//		System.out.println(". " + new Date());
//		TimeUnit.MICROSECONDS.sleep(200);
//		System.out.println(". " + new Date());
//		TimeUnit.MICROSECONDS.sleep(200);
//    
//
//	
//} catch (InterruptedException e) {
//    System.err.format("IOException: %s%n", e);
//}
package co.rpgmaster.rpgstore.main;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import co.rpgmaster.rpgstore.item.handle.ItemHandle;
import co.rpgmaster.rpgstore.item.handle.ItemVO;
import co.rpgmaster.rpgstore.item.handleImpl.ItemHandleImpl;
import co.rpgmaster.rpgstore.order.shipment.OrderShipment;
import co.rpgmaster.rpgstore.order.shipment.OrderVO;
import co.rpgmaster.rpgstore.order.shipmentImpl.OrderShipmentImpl;

public class MainMenu {
	private Scanner sc = new Scanner(System.in);
	private ItemHandle ih = new ItemHandleImpl(); // DB
	private OrderShipment osm = new OrderShipmentImpl(); // DB2

	private void mainInventory() {
		System.out.println("=========== 창고 관리 ===========");
		System.out.println(" ㄴ>  1. 새로운 아이템을 추가한다.    ");
		System.out.println(" ㄴ>  2. 아이템 가격을 수정한다.	  "); // 1골드당 100원.
		System.out.println(" ㄴ>  3. 아이템을 삭제한다.		  ");
		System.out.println(" ㄴ>  4. 아이템 재고를 확인한다.	  ");
		System.out.println(" ㄴ>  5. 아이템 입고일지를 작성한다.	  ");
		System.out.println(" ㄴ>  6. 아이템 판매일지를 작성한다.   ");
		System.out.println(" ㄴ>  7. 입출고 히스토리를 확인한다.	  "); // 출입고 히스토리 조회
		System.out.println(" ㄴ>  8. 창고 관리를 마무리한다. 	  ");
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
				inboundSetup();
				break;
			case 6:
				outboundSetup();
				break;
			case 7:
				orderHistory();
				break;
			case 8:
				System.out.println(" ...창고관리를 마무리 하자.");
				run = true;
				break;
			}
		} while (!run);
	}

	////////////////// CURD

	private void itemClassAdd() { // 아이템 새로 추가
		ItemVO item = new ItemVO();

		System.out.println("\n======== 등록할 아아템 구분 ========");
		System.out.println(" ㄴ> 잡화  ㄴ> 방어구  ㄴ> 무기");
		System.out.print(" 어떤 종류를 추가할까... ");

		while (true) {
			String type = null;
			type = sc.nextLine();

			if (type.equals("잡화")) { // 잡화

				System.out.println("======= 새로 내놓을 잡화 입력 =======");

				// 아이템 넘버는 타입에 따라 시작번호 선정
				System.out.print(" 잡화 번호 :: ");
				int no = Integer.parseInt("1000") //
						+ Integer.parseInt(sc.nextLine());

				System.out.print(" 잡화 이름 :: ");
				String name = sc.nextLine();

				// 방어구 종류는 분류에서 선택한 type 입력

				System.out.print(" 가격 :: ");
				int price = Integer.parseInt(sc.nextLine());
				int pieces = 0;

				// (no, name, type, price, pieces)
				item.setItemNo(no);
				item.setItemName(name);
				item.setItemType(type);
				item.setItemPrice(price);
				item.setItemPieces(pieces);
				if (ih.itemInventoryAdd(item) != 0) {
					System.out.println(" 새로운 잡화를 팔수있게 되었다...\n");
					term();
					break;
				} else {
					System.out.println(" 제대로 입력되지 않은 걸까? 실패했다...\n");
					term();
					break;
				}

			} else if (type.equals("방어구")) { // 방어구
				System.out.println("======= 새로 내놓을 방어구 입력 =======");

				// 아이템 넘버는 타입에 따라 시작번호 선정
				System.out.print(" 방어구 번호 :: ");
				int no = Integer.parseInt("2000") //
						+ Integer.parseInt(sc.nextLine());

				System.out.print(" 방어구 이름 :: ");
				String name = sc.nextLine();

				// 방어구 종류는 분류에서 선택한 type 입력

				System.out.print(" 가격 :: ");
				int price = Integer.parseInt(sc.nextLine());
				int pieces = 0;

				// (no, name, type, price, pieces)
				item.setItemNo(no);
				item.setItemName(name);
				item.setItemType(type);
				item.setItemPrice(price);
				item.setItemPieces(pieces);
				if (ih.itemInventoryAdd(item) != 0) {
					System.out.println(" 새로운 방어구를 팔수있게 되었다...\n");
					term();
					break;
				} else {
					System.out.println(" 제대로 입력되지 않은 걸까? 실패했다...\n");
					term();
					break;
				}

			} else if (type.equals("무기")) { // 무기
				System.out.println("======= 새로 내놓을 무기 입력 =======");

				// 아이템 넘버는 타입에 따라 시작번호 선정
				System.out.print(" 무기 번호 :: ");
				int no = Integer.parseInt("3000") //
						+ Integer.parseInt(sc.nextLine());

				System.out.print(" 무기 이름 :: ");
				String name = sc.nextLine();

				// 방어구 종류는 분류에서 선택한 type 입력

				System.out.print(" 가격 :: ");
				int price = Integer.parseInt(sc.nextLine());
				int pieces = 0;

				// (no, name, type, price, pieces)
				item.setItemNo(no);
				item.setItemName(name);
				item.setItemType(type);
				item.setItemPrice(price);
				item.setItemPieces(pieces);
				if (ih.itemInventoryAdd(item) != 0) {
					System.out.println(" 새로운 무기를 팔수있게 되었다...\n");
					term();
					break;
				} else {
					System.out.println(" 제대로 입력되지 않은 걸까? 실패했다...\n");
					term();
					break;
				}
			}
		} // end of while
	}

	private void itemEscalation() { // 아이템 물가변동 가격수정
		ItemVO item = new ItemVO();
		System.out.println();
		System.out.println("========  아이템 가격 변경  ========");
		System.out.print(" 가격을 변경할 아이템의 번호를 고르자...");
		int no = sc.nextInt();
		System.out.print(" 가격 조정을 얼마로 할까?...");
		int flation = sc.nextInt();

		item.setItemNo(no);
		item.setItemPrice(flation);
		if (ih.itemEscalation(item) != 0) {
			System.out.println(" 아이템 가격을 변경했다... \n");
			term();
		} else {
			System.out.println(" 번호를 잘못 적은 걸까? 실패했다...\n");
			term();
		}
	}

	private void itemFree() { // 아이템 단종
		ItemVO item = new ItemVO();
		System.out.println("\n=========== 아이템 처분 ===========");
		System.out.print(" 처분할 아이템의 번호를 고르자...");
		int free = sc.nextInt();

		item.setItemNo(free);
		if (ih.itemFree(item) != 0) {
			System.out.println(" 아이템이 처분되었다... \n");
			term();
		} else {
			System.out.println(" 번호를 잘못 적은 걸까? 실패했다...\n");
			term();
		}
	}

	private void itemStock() { // 아이템 타입별 재고확인
		ItemVO item = new ItemVO();
		System.out.println("\n======== 타입별 아이템 조회 ========");
		System.out.println(" ㄴ> 잡화  ㄴ> 방어구  ㄴ> 무기");
		System.out.print(" 어떤 종류를 조회할까... ");
		String stock = sc.nextLine();
		sc.nextLine();

		item.setItemType(stock);
		item = ih.itemStock(item);
		
		if(item.getItemNo() != 0) {
			System.out.println(item.toString() + "\n");
		}else {
			System.out.println(" 재고가 떨어졌나? 나중에 추가하도록 하자...\n");
		}
	}

	private void inboundSetup() { // 입고내역
		
		ItemVO item = new ItemVO();
		OrderVO order = new OrderVO();
		System.out.println("\n======= 아이템 입고내역 작성 =======");

		System.out.print(" 아이템 이름 :: ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print(" 입고 개수 :: ");
		int inbound = sc.nextInt();
		
		item.setItemName(name);
		item.setItemPieces(inbound);

		if (ih.itemPiecesUp(item) != 0) {
			int no = osm.autoOrderNo();
			System.out.print(" 입고 날짜(yy MM dd) :: ");
			String date = sc.next();
			java.sql.Date day = java.sql.Date.valueOf(date);
			// 네임에 맞춰 갯수 추가메소드
			order.setOrderNo(no);
			order.setItemName(name);
			order.setOrderEach(inbound);
			order.setOrderDate(day);
			if (osm.itemInbound(order) != 0) {
				System.out.println(" 창고에 물자를 들여뒀다...\n");
			} else if (osm.itemInbound(order) != 0 && inbound > 15) {
				System.out.println(" 들인 물자가 많아서 그런가 몸이 뻐근하다...\n");
			} else {
				System.out.println(" 잘못 수기한듯 하니 다시 확인해보자... \n");
			}
		} else {
			System.out.println(" 잘못 적은듯하다. 정신 차리고 다시 작성해보자...\n");
		}

	}

	private void outboundSetup() { // 판매내역
		
		ItemVO item = new ItemVO();
		OrderVO order = new OrderVO();
		System.out.println("\n======= 아이템 판매내역 작성 =======");
		
		int no = osm.autoOrderNo();
		System.out.print(" 아이템 이름 :: ");
		String name = sc.nextLine();
		System.out.print(" 판매 개수 :: ");
		int outbound = sc.nextInt();
		System.out.print(" 판매 날짜(yyMMdd) :: ");
		String date = sc.next();
		java.sql.Date day = java.sql.Date.valueOf(date);
		order.setOrderNo(no);
		order.setItemName(name);
		order.setOrderEach(outbound);
		order.setOrderDate(day);

		if (osm.itemInbound(order) != 0) {
			// 네임에 맞춰 갯수 추가메소드
			item.setItemPieces(outbound);
			item.setItemName(name);
			if (ih.itemPiecesUp(item) != 0) {
				System.out.println("\n 꽤나 물건이 나간듯 하다...");
			} else if (ih.itemPiecesUp(item) != 0 && outbound > 15) {
				System.out.println("\n 오늘은 수입이 짭짤하게 벌였네...");
			} else {
				System.out.println("\n 재고 수량을 다시 확인해보자...");
			}
		} else {
			System.out.println(" 잘못 적은듯하다. 정신 차리고 다시 작성해보자...\n");
		}
	}

	private void orderHistory() { // 입출고 히스토리 조회
		List<OrderVO> orders = osm.orderList();
		if (!orders.isEmpty()) {
			System.out.println(" 들인 날 순으로 훑어보자...");
			term();
			for (OrderVO od : orders) {
				od.toString();
			}
		} else {
			System.out.println(" 아무것도 없다네...\n");
		}
	}

	private void term() { // 약간의 텀 break;
		try {
			System.out.println();
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
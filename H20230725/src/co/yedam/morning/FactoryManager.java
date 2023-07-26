package co.yedam.morning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactoryManager {
	Scanner scn = new Scanner(System.in);
	List<Factory> factorys = new ArrayList<>();
	List<Storage> storages = new ArrayList<>();
	Factory fact = new Factory();

	public FactoryManager() {
		readFromFile();
	}

	// 제품관리 프로그램 띄우기
	public void menu() {
		System.out.println("1.상품등록 2.판매관리 3.구매관리 4.현재재고 5.종료");
		System.out.print("선택>> ");

	}

	private int nextNoA() {
		int no = 1000;
		for (int i = 0; i < factorys.size(); i++) {
			if (factorys.get(i).getoCode() > no) {
				no = factorys.get(i).getoCode();
			}
		}
		return no + 1;
	}// 생필품은 1000번대

	private int nextNoB() {
		int no = 2000;
		for (int i = 0; i < factorys.size(); i++) {
			if (factorys.get(i).getoCode() > no) {
				no = factorys.get(i).getoCode();
			}
		}
		return no + 1;

	}// 공구는 2000번대

	// 상품등록
	public void addObject() {
		System.out.println("카테고리 선택 후 추가");
		System.out.println("1.생필품 2.공구");
		System.out.print("선택>> ");
		int check = 0;
		check = Integer.parseInt(scn.nextLine());

		if (check == 1) {
			int no = nextNoA();
			System.out.print("제품> ");
			String name = scn.nextLine();
			System.out.print("가격> ");
			String price = scn.nextLine();
			System.out.print("수량> ");
			int count = Integer.parseInt(scn.nextLine());
			Factory plus = null;
			
			plus = new Factory(no, name, price, check, count);
			factorys.add(plus);
			

		} else if (check == 2) {
			int no = nextNoB();
			System.out.print("제품> ");
			String name = scn.nextLine();
			System.out.print("가격> ");
			String price = scn.nextLine();
			System.out.print("수량> ");
			int count = Integer.parseInt(scn.nextLine());
			Factory plus = null;
			plus = new Factory(no, name, price, check, count);

			factorys.add(plus);

		} else {
			System.out.println("error");
		}

	}

	// 판매관리
	public void sellManage() {
		System.out.println("판매관리 메뉴...");
		System.out.print("판매된 상품코드>> ");
		int code = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < factorys.size(); i++) {
			if (code == factorys.get(i).getoCode()) {
				System.out.println(factorys.get(i).getoCode() //
						+ "판매수량: " + storages.get(i).getSellNo() //
						+ "판매일: " + storages.get(i).getSellIn());
			} else {
				System.out.println("조회할 수 없습니다.");
			}
		}
	}

	// 구매관리
	public void saleManage() {
		System.out.println("구매관리 메뉴...");
		System.out.print("구매한 상품코드>> ");
		int code = Integer.parseInt(scn.nextLine());
		System.out.print("구매한 상품수량>> ");
		int plus = Integer.parseInt(scn.nextLine());
		System.out.print("구매한 날짜>> ");
		String day = scn.nextLine();
		
		for (int i = 0; i < factorys.size(); i++) {
			if (code == factorys.get(i).getoCode()) {
				System.out.println(factorys.get(i).getoCode() //
						+ "구매수량: " + storages.get(i).getSaleNo() //
						+ "구매일: " + storages.get(i).getSaleIn());
			} else {
				System.out.println("조회할 수 없습니다.");
			}
		}
	}

	// 현재재고
	public void inInventory() {
		System.out.println("카테고리 선택 후 확인");
		System.out.println("1.생필품 2.공구");
		System.out.print("선택>> ");
		int check = 0;
		check = Integer.parseInt(scn.nextLine());
		if (check == 1) {
			System.out.print("확인할 상품코드>> ");
			int code = Integer.parseInt(scn.nextLine());
			for (int i = 0; i < factorys.size(); i++) {
				if (code == factorys.get(i).getoCode() //
						&& check == factorys.get(i).getCategory()) {
					System.out.println("생필품...\n" + "코드 [" + factorys.get(i).getoCode() //
							+ "] 재고수량 [" + factorys.get(i).getCount() + "]");
				}
			}
		} else if (check == 2) {
			System.out.print("확인할 상품코드>> ");
			int code = Integer.parseInt(scn.nextLine());
			for (int j = 0; j < factorys.size(); j++) {
				if (code == factorys.get(j).getoCode()//
						&& check == factorys.get(j).getCategory()) {
					System.out.println("공구...\n" + "코드 [" + factorys.get(j).getoCode() //
							+ "] 재고수량 [" + factorys.get(j).getCount() + "]");
				}
			}
		} else {
			System.out.println("error");
		}
	}

	public void stareToFile() {
		// 출력스트림 객체
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("c:/Temp/inventory.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			fos.flush();
			fos.close();
			oos.flush();
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readFromFile() {
		// 입력스트림.
		FileInputStream fis;
		try {
			fis = new FileInputStream("c:/Temp/inventory.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Factory factory = (Factory) ois.readObject();

			ois.close();
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
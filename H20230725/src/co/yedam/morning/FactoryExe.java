package co.yedam.morning;

import java.util.Scanner;

public class FactoryExe {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		FactoryManager manager = new FactoryManager();
		
		int useNo = -1;
		
		while( true ) {
			manager.menu();
			useNo = Integer.parseInt(scn.nextLine());
			
			if( useNo == 1) {
				manager.addObject();
			}else if( useNo == 2) {
				manager.sellManage();
			}else if( useNo == 3) {
				manager.saleManage();
			}else if( useNo == 4) {
				manager.inInventory();
			}else if( useNo == 5){
				System.out.println("종료");
				break;
			}
			
		}
		
	}
}

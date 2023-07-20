package co.yedam.exceptions;

public class MenuException extends Exception{
	int choice;
	public MenuException(int choice) {
		this.choice = choice;
	}
	/*
	 ~ menu 선택 외 일때 보내는 것 ~
	 try{
		 if (menu < 1|| menu > 6){
		 	throw new MenuException(menu); 
		 }
	 }catch(MenuException e) {
	 	e.showMessage();
	 	continue;
	 }
	 */
	public void showMessage() {
		System.out.println(choice + "는 잘못된 메뉴입니다.");
	}
}

package co.yedam.inherit;

public class PhoneExe {
	public static void main(String[] args) {
		CellPhone cellPhone = new CellPhone();
		cellPhone.setModel("Galaxy s10");
		cellPhone.setColor("white");
		cellPhone.powerOn();
		cellPhone.sendMessage();
		cellPhone.powerOff();
		System.out.println(cellPhone.showInfo());
		
		System.out.println("--------------------------------------");
		
		//자식클래스틑 부모클래스의 필드 메소드 생성자
		DmbCellPhone dmbPhone = new DmbCellPhone();
		dmbPhone.setModel("Galaxy Dmb 1");
		dmbPhone.setColor("Yellow");
		dmbPhone.powerOn();
		dmbPhone.sendMessage();
		dmbPhone.turnOn();
		dmbPhone.changeChannel(10);
		dmbPhone.turnOff();
		dmbPhone.powerOff();
		System.out.println(dmbPhone.showInfo());
		System.out.println("--------------------------------------");

		//부모클래스의 변수에 자식클래스의 변수 대입.
		CellPhone parent = new DmbCellPhone("DMB S22", "white", 10); // promotion
		//parent.turnOn(); // 자식클래스의 필드/메소드 사용이 불가
		System.out.println(parent.getModel());
		DmbCellPhone child = null;
		
		if(parent instanceof DmbCellPhone) {
			child = (DmbCellPhone) parent;
			child.turnOn();
			}
		
//		DmbCellPhone child = (DmbCellPhone) parent; // casting 강제변환
//		child.turnOn();
//		System.out.println("--------------------------------------");

		//부모클래스의 변수를 자식변수로 casting 할 경우 체크
		if(cellPhone instanceof DmbCellPhone) { //instanceof 연산자를 사용하면 객체가 특정 클래스에 속하는지 아닌지를 확인할 수 있습니다.
		child = (DmbCellPhone) cellPhone;
		child.turnOn();
		}
	}
}

package co.yedam.abstracts;

public class SmartPhone extends phone{
	
	//extends 이 후 생성자 존재하도록 작성
	public SmartPhone(String owner) {
		super(owner);
	}
	
	@Override
	public void powerOn() {
		System.out.println("스마트폰 전원 켬");
	}
	@Override
	public void powerOff() {
		System.out.println("스마트폰 전원 끔");
	}
		
	public void internetSearch() {
		System.out.println("검색기능");
	}
}

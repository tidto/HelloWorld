package co.yedam.interfaces;

//class -> interface 로 변경 
//인터페이스
//생성자(x) 필드(o): 상수로 사용. c
//메소드 : 추상 메소드로 선언
public interface RemoteCon {
	final int CHANNEL = 10;
	
	abstract void turnOn();
	void turnOff();
	
}

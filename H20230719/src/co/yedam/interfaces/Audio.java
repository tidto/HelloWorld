package co.yedam.interfaces;

//RemoteCon 인터페이스 구현하는 클래스
public class Audio implements RemoteCon{

	double freq;
	
	public Audio() {
		
	}
	
	public void setFreq(double freq) {
		this.freq = freq;
	}
	
	//가져오는 부모에서 추상메소드를 정의해줘야함
	@Override
	public void turnOn() {
		System.out.println("Audio 전원 켬");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio 전원 끔");
	}
}

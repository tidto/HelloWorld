package co.yedam.interfaces;

//RemonteCon 인터페이스 구현하는 클래스
public class Television implements RemoteCon{
	int channel;
	
	public Television() {
		
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
	@Override
	public void turnOn() {
		System.out.println("tv 전원 킴");
	}
	@Override
	public void turnOff() {
		System.out.println("tv 전원 끔");
	}
}

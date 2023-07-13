package co.yedam;

//상속(부모 -> 자식) extent 뒤에 부모 super이 가르킴
public class PrintExe extends Object {
	public void showInfo() {
		System.out.println("HELLO.");
		
	}
	@Override
	public String toString() {
		return "PrintExe";
	}
}

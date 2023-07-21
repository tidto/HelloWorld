package co.yedam.thread;

public class MainThread {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 u1 = new User1();
		u1.setCalculator(calculator);
		u1.start();//calculator.memory = 100;
		
		User2 u2 = new User2();
		u2.setCalculator(calculator);
		u2.start();//calculator.memory = 50;
	}
}

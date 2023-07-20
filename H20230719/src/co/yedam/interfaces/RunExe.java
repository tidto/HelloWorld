package co.yedam.interfaces;

class RunClass implements Runnable{
	@Override
	public void run() {
		System.out.println("RunClass 실행");
		
	}
}


public class RunExe {
	public static void main(String[] args) {
		
		RunClass run = new RunClass();
		run.run();
		
		//익명구현객체
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("익명구현객체 실행");
			}
		};
		runnable.run();
		//단축  람다표현식. 먼저 선언된것만
		runnable = () -> System.out.println("익명구현객체 실행2");
		runnable.run();

	}
}

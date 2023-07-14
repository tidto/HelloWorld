package co.yedam;

public class ForAndForExe {
	public static void main(String[] args) {
		practice4();
	}
	
	public static void practice3() {
		for(int i=1; i<3; i++) {
			
		}
	}
	
	public static void practice4 () {
		System.out.println("x => 5, y => 8");
		System.out.println("x => 5, y => 8");
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x + 5*y == 60) {
				System.out.println("4x + 5y = 60" + x + y);
				}
			}
		}
	}
	
public static void forAndFor() {	
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %2d ", i, j, (i * j));				
			}
		}
	
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %d \t", i*2, j, (i*2 * j));
				System.out.printf("%d X %d = %d \n", i*2+1, j+1, ((i*2+1) * (j+1)));
			}
		}
	}
}

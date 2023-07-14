package co.yedam;
//project 20230714
public class ConditionExe {
	public static void main(String[] args) {
		int score = 88;
		
		//90이상이면 A 80 =B 70=C 그 외 D
		if(score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		
		switch(score / 10) {
		case 9 :
		case 10 :
			System.out.println("A");break;
		case 8 :
			System.out.println("B");break;
		case 7 :
			System.out.println("C");break;
		default :
			System.out.println("D");break;
		}
		
	}//end of main()
}

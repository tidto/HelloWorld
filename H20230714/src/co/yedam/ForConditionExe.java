package co.yedam;

public class ForConditionExe {
	public static void main(String[] args) {
		for(int i=1; i<=12; i++) {
			System.out.println();
			System.out.println();
			showCalendar(i);
		}
	}//end of main()	
	
	public static void showCalendar(int month) {
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		for(int i=0; i<days.length; i++) {
			System.out.printf("%4s",days[i]);
		}
		System.out.println();
		
		// 1일 위치 지정.
		int pos = getFirstDay(month);
		for(int i=0; i<pos; i++) {
			System.out.printf("%4s","");
		}
		
		int lastDate = getLastDate(month);
		for(int i=1; i<=lastDate; i++) {
			System.out.printf("%4d",i);
			if ((i+pos) % 7 == 0) {
				System.out.println(); //아무것도 안쓰면 단순 줄바꿈
			
			}
		}
	}//end of main()
	
	
	//월 정보를 입력하면 해당월의 1일의위치 (공란을 반환)
	public static int getFirstDay(int month) {
		int pos =1;
		
		if(month == 8) {
			 pos = 2;
		}else if(month == 3 && month == 9 && month == 12) {
			pos = 5;
		}else if(month == 10) {
			pos = 0;
		}else if(month == 5 && month == 11) {
			pos = 3;
		}else if(month == 1 && month == 4) {
			pos = 1;
		}else if(month == 2) {
			pos = 4;
		}else{
			pos = 6;
		}
		return pos;
	}
	
	//월 정보를 입력하면 해당월의 마지막날을 반환.
	public static int getLastDate(int month) {
		int lastDate = 31;
		if(month == 4 && month == 6 && month == 9 && month == 11) {
			lastDate =30;
		}else if(month == 2) {
			lastDate =28;
		}else{
			lastDate =31;
		}
		return lastDate;
		
	}
}

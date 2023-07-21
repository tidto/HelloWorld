package co.yedam.api;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1);
		System.out.println("년도: " + cal1.get(Calendar.YEAR)); 
		System.out.println("월: " + cal1.get(Calendar.MONTH + 1)); 
		System.out.println("일: " + cal1.get(Calendar.DATE)); 
		System.out.println(cal1.getTimeInMillis()); //1970 01 01 기준
		// 1000 * 60 *60 * 24
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set( 2023, 6, 22);
		long gap = cal2.getTimeInMillis() - cal1.getTimeInMillis(); //time은 long
		//14 * 1000 * 60 * 60
		System.out.println(gap/3600000);
		
		System.out.println(cal2);
		cal2.set(Calendar.YEAR, 2022);
		cal2.set(Calendar.MONTH, 11);
		System.out.println(cal2);

	} 
}

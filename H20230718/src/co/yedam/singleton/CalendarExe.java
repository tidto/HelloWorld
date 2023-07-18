package co.yedam.singleton;

import java.util.Scanner;

public class CalendarExe {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Input>>> ");
		
		String str;
		
		String no = scn.next();
		String name = scn.next();
		String score = scn.next();
		System.out.println("번호: "+ no + ", 이름: " + name + ", 점수: "+ score);
		
		//str = scn.nextLine(); -> 일렬로 불러옴
		while(true) {
			if(scn.hasNext()) {
				str = scn.next();
				System.out.println(str);
				continue;
			}
			break;
		}
		System.out.println("end.");
		scn.close();
//	showCal(2022, 9);
	}
	
	public static void showCal(int year, int month) {
		System.out.println(Calendar.YEAR);
		Calendar cal = Calendar.getInstance();
		cal.set(year, month -1, 1);
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.YEAR) + "년 "+ (cal.get(Calendar.MONTH)+1) + "월 " + cal.get(Calendar.DATE) + "일 ");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일");
		System.out.println("말일: " + cal.getActualMaximum(Calendar.DATE));
}
}

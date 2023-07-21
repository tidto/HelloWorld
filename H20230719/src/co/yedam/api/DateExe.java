package co.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExe {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = //
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		Date today = new Date();
		// Date -> String
		System.out.println(sdf.format(today));
		
		Date tday = new Date();
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			tday = sdf.parse("2023-01-10");
			System.out.println(tday);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		String result = DateUtil.dateToStr(today, "yyyy-MM-dd");
		System.out.println(result);
		
		// 문자열 (2023-03-05) -> Tue Mar 05 00:00:00 KST 2023
		Date dday = DateUtil.strToDate("2023-03-05");
		System.out.println(dday);
		
		
	}// end main
	
	

}

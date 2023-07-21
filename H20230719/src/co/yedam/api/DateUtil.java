package co.yedam.api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	 
	
	public static String dateToStr(Date date) {
		//Date -> String
		SimpleDateFormat sdf = // 
				new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
		
	}
	
	public static String dateToStr(Date date, String pattern) {
		//Date -> String
		SimpleDateFormat sdf = //
			new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date, pattern);
	}
	
	public static int strToDate(String date) {
		//String  -> Date
		SimpleDateFormat sdf = //
			new SimpleDateFormat("yyyy-MM-dd");
		return = null;
		 try {
			result = sdf.parse 
		 }
	}
}

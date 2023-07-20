package co.yedam.api;

import java.util.Scanner;

public class ObjectExe2 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String[] numbers = {"9701031000000", "0208153000000",//
				"000917-4000000","070613-3000000",//
				"951123 2000000","101225 4000000"   };
		
		
		//뒷자리 첫번재 1,3/2,4
		for (String num : numbers) {
			System.out.println(checkGender(num));
		}	
	}
	
	static String checkGender(String no) {
		 // 남 / 여 / 에러
		String genChar = "" + no.charAt(no.length()-7);
		
		if(genChar.length() == 1 || genChar.length() == 3) {
			return "남";
		}else if(genChar.length() == 2 || genChar.length() == 4) {
			return "여";
		}else {
			return "error";
		}
			
		
		
		
	}
}

// length6+length7 
//equals length6+"+"+length7 
//equals length6+" "+length7 
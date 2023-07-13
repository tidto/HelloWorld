package co.yedam;

import java.util.Scanner;

public class PrintStreamExe3 {
	public static void main(String[] args) {
		// 사용자 3개숫자 (정수) 입력
		// max계산, 평균계산 => 최대값은 90이고 평균은 80입니다.
		
		Scanner scn = new Scanner(System.in);
		
		int maxValue = 0, sum = 0;  //정수
		double average = 0; //실수
		
	for(int i=0; i<3; i++) {
		System.out.println("value>>> ");
		String val1 = scn.nextLine();
		int temp = Integer.parseInt(val1);
		
		if(temp > maxValue) {
			maxValue = temp;
		}
		sum += temp;
	}
		
		average = sum/3;
		//합 나누기 3
		
		System.out.printf("최대값은 %d이고 %.1f평균은 입니다.", maxValue, average);
		
	}
}

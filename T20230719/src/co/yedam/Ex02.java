package co.yedam;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("num1>>");
		int num1 = Integer.parseInt(scn.nextLine());
		System.out.println("num2>>");
		int num2 = Integer.parseInt(scn.nextLine());
		
		int sum2 = 0;
		int sum3 = 0;
		
		int first = (num1 < num2) ? num1 : num2;
		int end = (num1 < num2) ? num2 : num1;
		for (int i = first; i <=end; ++i) {
			if (i % 2 == 0) {
				sum2 += i;
			}
			if (i % 3 == 0) {
				sum3 += i;
			}
		}
		
		System.out.printf("sum2: %d, sum3: %d\n",sum2,sum3);//
	}
}

package co.yedam;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("num1>>");
		int num1 = Integer.parseInt(scn.nextLine());
		System.out.println("num2>>");
		int num2 = Integer.parseInt(scn.nextLine());
		int res = (num1 > num2) ? num1: num2;
<<<<<<< HEAD
		//
=======
		
>>>>>>> refs/remotes/origin/master
		System.out.println(res);
	}
}

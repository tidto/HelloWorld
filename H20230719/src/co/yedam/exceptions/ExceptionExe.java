package co.yedam.exceptions;

import java.util.Scanner;

public class ExceptionExe {
	public static void main(String[] args) {
		// NullPointException
		Scanner scn = new Scanner(System.in);
		String str = null;
		str = "홍길동";
		int age = 0;
		
		//try 블럭에서 예외가 발생되면,
		//catch 블럭에서 정의된 코드 실행 
		try {
			System.out.println(str.toString());
			age = Integer.parseInt(scn.nextLine());
			System.out.println("이름은 " + str + ", 나이는 " + age);
		} catch(NullPointerException | NumberFormatException e) { 
			System.out.println("예외가 발생.");
//		} catch(NumberFormatException n) { 
//			System.out.println("Format 예외가 발생");
		} finally {
			scn.close(); //빌린 리소스 반환
		}
		
		try {
			Class cls = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			exceptionMethod();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("end of prog.");
	}
	
	public static void exceptionMethod() throws ClassNotFoundException {
		// 예외처리의 책임을 메소드를 호출한영역으로 떠넘기기
		Class cls = Class.forName("java.lang.String");
	}
}

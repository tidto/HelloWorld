package co.yedam.board;

import co.yedam.member.Member;

public class BoardMain {
	public static void main(String[] args) {
//		message("everyone~");
//		getMax(10,20);
//		getMemberName(new Member(1001, "홍길동"));
		
		int result = sum();
		result = sum(10,20);
		result = sum(new int[] { 10, 20, 30 });
		System.out.println("result is " + result);
	}
	
	// 반환유형
	// 동일한 이름의 메소드 중복정의 : 오버로딩
	public static int sum() {
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		
		return num1 + num2;
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sum(int[] intAry) {
		int sum = 0;
		for(int i=0; i<intAry.length; i++) {
			sum += intAry[i];
		}
		return sum;
	}
	
	// 매개변수
	public static void message(String name) {
		System.out.println("Hi~"+ name);
	}
	
	// 매개변수 정수형 2개 선언
	public static void getMax(int num1, int num2) {
		if(num1 > num2) {
			System.out.println("max " + num1);
		}else {
			System.out.println("max " + num2);
		}
	}
	// 클래스 변수.
	public static void getMemberName(Member member) {
		System.out.println("name is " + member.getMemberName());
	}
}

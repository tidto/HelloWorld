package co.yedam;

public class VariableExe {
	public static void main(String[] args) {
		// 정수형. 데이터파일 다음 변수
		int num1 = 100; // 4byte  보통 사칙연산에 일반적으로 사용
		System.out.println(Integer.MAX_VALUE);
		long num2 = 200; // 8byte
		System.out.println(Long.MAX_VALUE);
		
		byte num3 = 30; // 1byte -128 -> ~ +127(8bit) 사이로만 담을 수 있다. +/-1(128~2) (양수는 0 포함해서 127)
		num3 = 126;
		for(int i=1; i<10; i++) {
			System.out.println("num3: " + num3++);
		}
		short num4 = 3276; // 2byte -> -32768 ~ +32767 / "
		
		System.out.println(Short.MAX_VALUE);
		
		int result = num3 * 3;
		
		char chr = 97; // (2byte) 65536개의 유니코드.
		for(int i=1; i<=26; i++)
		System.out.println(chr++); // 형변환.
	}
}

package co.yedam;

public class LoopExample {
	public static void main(String[] args) {
		//76800원 > 5만원 :1장, 만원 2장, 5천원1장, 천원 1장, 5백원 1개, 백원 3개
		
		int value = ((int) (Math.random() *50000 / 100)) * 100 + 50000;
		int arr[] = {50000, 10000, 5000, 1000, 500, 100};
		String result = value + "원은 ";
		int paperCnt =0, remainAmt = 0;
		
		for (int i = value; i > 0; i++) {
			paperCnt = value /arr[i];
			remainAmt = value - (arr[i] * paperCnt);
			result += arr[i] + "원 " + paperCnt + "장 ";
			value = remainAmt;
		}
		System.out.println(result);

	}
}

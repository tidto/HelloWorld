package co.yedam;

public class Ex03 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 5; ++i) {
			arr[i] = (int)(Math.random()*10 + 1);
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.printf("최소값: %d, 최대값: %d\n",min,max);//
	}
}

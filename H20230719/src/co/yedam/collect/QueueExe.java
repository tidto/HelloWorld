package co.yedam.collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExe {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		que.offer("홍");
		que.offer("박");
		que.offer("김");
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}
}

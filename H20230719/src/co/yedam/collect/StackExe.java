package co.yedam.collect;

import java.util.Stack;

public class StackExe {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>(); 
		stack.push("홍");
		stack.push("박");
		stack.push("김");

		
		while(!stack.isEmpty()) { // !를 사용해 반전 -> 내용이있으면~
			System.out.println(stack.pop());
			
		}
	}
}

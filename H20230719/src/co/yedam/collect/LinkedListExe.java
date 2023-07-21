package co.yedam.collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExe {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();// 중간에 빠지면 뒤에 객체를 당겨옴
		
		List<String> lnk = new LinkedList<>();//      "    link를 끊고 사이의 둘이 연결됨
		
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			list.add(String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList 걸린시간: " + (end - start));
		
		start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			lnk.add(String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList 걸린시간: " + (end - start));
		//***** 뒤에 추가하는 것은 ArrayList 가 빠름
		
		
		 start = System.currentTimeMillis();
		for(int i=0; i<1000; i++) {
			list.add(0, String.valueOf(i));
		}
		 end = System.currentTimeMillis();
		System.out.println("ArrayListIn 걸린시간: " + (end - start));
		
		start = System.currentTimeMillis();
		for(int i=0; i<1000; i++) {
			lnk.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedListIn 걸린시간: " + (end - start));
		//***** 중간에 추가하는 것은 LinkedList 가 빠름

		
		
		
	}
}

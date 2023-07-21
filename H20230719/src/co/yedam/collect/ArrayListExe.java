package co.yedam.collect;

import java.util.ArrayList;
import java.util.List;

//import co.yedam.friend.Friend;

public class ArrayListExe {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();//*****
		list.add("홍길동");
		list.add("김길동");
		list.add("박길동");
		for(int i=0; i<15; i++) {
			list.add(String.valueOf(i));
		}
//	<Integer>일때
//		list.add(10); 
//		list.add(new Friend("김길동", "011-1111"));
//		Integer num = (Integer) list.get(1);
//		System.out.println(obj + " " + num);
		
		String obj = list.get(0);
		list.set(0, "Hong");
		System.out.println("기본 크기 " + list.size());
		list.remove(0); // list[] = "Hong";
		System.out.println("수정 크기 " + list.size());
		obj = list.get(0); // 기본 0번자리를 지우고 다음 리스트가 0이 된다
		System.out.println(obj);
		
		list.clear();
		System.out.println("크기 " + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d의 위치값 %s\n", i, list.get(i));
		}
	
		
	}
}

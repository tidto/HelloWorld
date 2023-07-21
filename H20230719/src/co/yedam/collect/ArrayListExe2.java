package co.yedam.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import co.yedam.friend.Friend;

public class ArrayListExe2 {
	public static void main(String[] args) {
		List<Friend> friends = new ArrayList<Friend>(); //ArrayList는 멀티쓰레드에 접합하지않음
		friends.add(new Friend("홍", "1111"));
		Friend friend = new Friend("박", "2222"); // 메소드로 불러서 추가 .add
		friends.add(friend);
		//friends.remove(friend);
		
		
		System.out.println(friends.iterator());
		
		List<String> list = new Vector<>(); // ArrayList 클래스
		list.add("홍");
		list.add("김");
		list.remove(0);
		
		
	}
}

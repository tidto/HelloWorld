package co.yedam.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExe {
	public static void main(String[] args) {
		 Map<String, Integer> map // 
		 	= new HashMap<String, Integer>();
		 
		 map.put("홍", 90);
		 map.put("김", 80);
		 map.put("백", 70);
		 map.put("홍", 80);
		 
		 map.remove("홍");

		 if(map.containsKey("백")) {
			 Integer result = map.get("백");
			 System.out.println("백의 점수 " + result);
		 }
		 
		 // 반복된 요소 출력
		 Set<String> keys = map.keySet(); // 키값만 set 컬렉션에 저장
		 for(String key : keys) {
			 Integer val = map.get(key);
			 System.out.printf("key: %s, val: %d\n", key, val);
		 }
		 
		 Set<Entry<String, Integer>> entrySet = map.entrySet(); //K, V => {K,V}
		 for(Entry<String, Integer> entry : entrySet) {
			 String key = entry.getKey();
			 Integer val = entry.getValue();
			 System.out.printf("key : %s, val : %d\n",key, val);
		 }
		 
		 
		 System.out.println("end of prog");
	}
}

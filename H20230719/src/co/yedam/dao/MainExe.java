package co.yedam.dao;

import java.util.Map;

public class MainExe {

	public static void main(String[] args) {
//		MySqlDao dao = new MySqlDao();   Dao로 연결을 안했을때
//		OracleDao dao = new OracleDao();        "
		
		//Dao dao = new MySqlDao();  // Dao 연결 후 new ~~()으로 수동적 연동
		Dao dao = new OracleDao();

		
		dao.insert();
		
		dao.modify();
		
		dao.remove();
		
		dao.search();

		
		//중첩 클래스
//		Map<String, String> map = new HashMap<>();
//		map.put("1", "김");
//		map.put("2", "박");
//		
//		Set<String> set = map.keySet();
//		for(String str : set) {
//			System.out.println("키: " + str);
//		}
//		Set<Map.Entry<String, String>> entSet = map.entrySet();
//		
//		System.out.println(map.get("1"));
	}
}

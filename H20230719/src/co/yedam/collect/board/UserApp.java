package co.yedam.collect.board;//

import java.util.Hashtable;
import java.util.Map;

public class UserApp {
	Map<String, String> users //
		= new Hashtable<String, String>();
	
	UserApp(){
		users.put("user1" , "1111");
		users.put("user2" , "2222");
		users.put("admin" , "3333");
	}
	
	boolean login(String id, String pw) {
		
		return false;
	}
}

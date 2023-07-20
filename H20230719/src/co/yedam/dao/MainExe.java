package co.yedam.dao;

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
		
	}
}

package co.yedam.hr;

import java.util.List;

//  참고 https://dyjung.tistory.com/50
public class JdbcExe {
	public static void main(String[] args) {
		EmpVO emp = new EmpVO(1006, "황", "hwang123@mail.com", "대전123", 1300);
		
		EmpDAO dao = new EmpDAO();
		if(dao.delEmp()) {
			System.out.println("삭제ㅇ");
		}else {
			System.out.println("삭제x");
		}
		
		System.out.println("end of prog");
	}
}
			
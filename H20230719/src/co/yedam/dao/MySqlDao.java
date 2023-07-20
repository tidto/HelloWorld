package co.yedam.dao;

public class MySqlDao implements Dao{
	//add 		modify 		del  	find
	public void insert() {
		System.out.println("MySql 등록");
	}
	public void modify() {
		System.out.println("MySql 수정");
	}
	public void remove() {
		System.out.println("MySql 삭제");
	}
	public void search() {
		System.out.println("MySql 조회");
	}
}

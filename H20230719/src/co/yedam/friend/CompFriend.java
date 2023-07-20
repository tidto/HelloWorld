package co.yedam.friend;

public class CompFriend extends Friend{
	private String company;
	private String dept;
	
	public CompFriend() {
		super();
	}
	
	public CompFriend(String name, String phone, String company, String dept) {
		super(name, phone);
		this.company = company;
		this.dept = dept;
	}

	@Override
	public String showInfo() {
		return super.showInfo() + ", 회사명: " + company + ", 부서: " + dept;
	}
}

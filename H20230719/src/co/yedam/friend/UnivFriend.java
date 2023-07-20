package co.yedam.friend;

public class UnivFriend extends Friend{
	private String univ;
	private String major;
	
	public UnivFriend(){
		super();
	}
	public UnivFriend (String name, String phone, String univ, String major){
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}
		
	@Override
	public String showInfo() {
		return "이름: " + getName() + ", 연락처: " + getPhone() + ", 대학교: " + univ + ", 전공: " + major;
	}
}

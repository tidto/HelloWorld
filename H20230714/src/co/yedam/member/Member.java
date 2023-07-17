package co.yedam.member;

public class Member {
	// (회원번호, 이름, 연락처, 성별, 주소)
	private int memberNo;
	private String memberName;
	private String phone;
	private Gender gender;
	private String address;
	
	//생성자- 필드의 초기값을 지정
	//기본생성자 생성
	public Member() {
		this.memberNo = 2001;
		this.memberName = "오리";
		this.phone = "010-7777";
	}
	
	//using field
	public Member(int memberNo, String memberName, String phone, Gender gender, String address) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
	}

	//메소드 getter/setter
	//고객넘버
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	
	//고객명
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	//연락처
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	//성별
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	//주소
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// 회원의 간략한 정보를 출력
	public String showInfo() {
		return "회원번호: " + memberNo + ", 회원명: " + memberName + ", 연락처: " + phone;
	}
	
	public String allInfo() {
		String result = showInfo();
		result +=", 성별: " + gender + ", 주소: " + address;
		return result;
	}
	
	
}

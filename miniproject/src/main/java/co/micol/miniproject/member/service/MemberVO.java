package co.micol.miniproject.member.service;

import lombok.Data;

@Data
public class MemberVO {//카멜케이스
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String memberGender;
	private String memberTel;
	private String memberAddress;
	
	@Override
	public String toString() {
		System.out.print(getMemberId() + " ");
		System.out.print(getMemberName() + " ");
//		if(memberPw != null) {
//			System.out.println(memberPw);
//		}
		System.out.print(getMemberAge() + " ");
		System.out.print(getMemberGender() + " ");
		System.out.print(getMemberTel() + " ");
		System.out.println(getMemberAddress());
		return null;
	}
}

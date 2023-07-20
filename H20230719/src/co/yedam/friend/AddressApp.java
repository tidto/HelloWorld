package co.yedam.friend;
// 친구의 연락처 관리 app.
// 회사의 정보(회사, 부서), 
// 학교의 정보(학교,전공),
// 일반적인 정보: 이름, 연락처.
// System.out.println() : 콘솔 X
public class AddressApp {
	
	Friend[] friends = new Friend[10]; //저장공간

	// 추가. addFriend()
	public boolean addFriend(Friend friend) {
		return false;
	}
	
	
	// 조회. findFriend() : 친구이름중에는 동일한 이름 없음. 
	public Friend findFriend(String name) {
		for(int i=0; i<friends.length; i++) {
			if( friends[i] != null && friends[i].getName()!= null) {
				friends[i] = null;
			}
		}
		return null;
	}
	
	//수정. editFriend() : 친구의 연락처 수정
	public boolean editFriend(String name, String phone) {
		for(int i=0; i<friends.length; i++) {
			if( friends[i] != null && friends[i].getName()!= null) {
				friends[i] = null;
			}
		}
		return false;
	}
	
	//삭제. delFriend() : 정보삭제
	public boolean delFriend(String name) {
		for(int i=0; i<friends.length; i++) {
			if( friends[i] != null && friends[i].getName()!= null) {
				friends[i] = null;
			}
		}
		return false;
	}
	
	//목록. friendList()
	public Friend[] friendList() {
		return null;
	}
	
}

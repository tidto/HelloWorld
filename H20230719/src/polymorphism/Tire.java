package polymorphism;


//상복관계 : Tire <- HankookTirem, KumhoTire
public class Tire {
	// 필드
	int maxRotation; // 최대 사용가능한 회전수
	int accumulatedRotation; // 사용한 회전수
	String location; // 타이어 앞 뒤 위치
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	public boolean roll() {  //boolean-true/false
		accumulatedRotation++;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "Tire 수명: " + 
							  (maxRotation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
	
}

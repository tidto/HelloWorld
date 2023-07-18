package co.yedam.student;

public class Student {
	// 필드
	String stdNo; // 
	String stdName;//
	int score;
	double height;
	
	// 생성자
	// 생성자 오버로딩 : 여러개의 생성자를 만들어 적용하는 것.
	Student(){ //기본생성자 
		
	}
	Student(String stdNo) {
		this.stdNo = stdNo; //필드의 초기값 지정.
		
	}
	
	Student(String stdNo, int score){
		//this.stdNo = stdNo;
		this(stdNo); //자기자신을 호출 this(@) / this 클래스에서 자기자신의 필드, 생성자, 메소드
		this.score = score;
	}
	
	public Student(String stdNo, String stdName, int score, double height) {
		super(); //부모클래스 불러옴
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.score = score;
		this.height = height;
	}//오버로딩
	public Student(String stdNo, String stdName, double height, int score) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.score = score;
		this.height = height;
	}
	//메소드.
	public String  showInfo() {
		return "학생번호: " + stdNo + ", 학생이름: " + stdName; 
	}
}

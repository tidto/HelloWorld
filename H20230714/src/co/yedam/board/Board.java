package co.yedam.board;

public class Board {
	private int bookNo;
	private String bookName;
	private String bookIn;
	private String writer;
	
	//입력문
	public Board(int bookNo, String bookName, String bookIn, String writer) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookIn = bookIn;
		this.writer = writer;
	}
	
	//글번호
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	//글제목
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	//글내용
	public String getBookIn() {
		return bookIn;
	}
	public void setBookIn(String bookIn) {
		this.bookIn = bookIn;
	}
	//작성자
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	public String boSet() {
		return "글번호: " + bookNo +", 글제목: " + bookName + ", 작성자: " + writer;
	}
	
	public String boFull() {
		String sun = boSet();
		sun += ", 글내용: " + bookIn;		
		return sun;
	}
	
	
}


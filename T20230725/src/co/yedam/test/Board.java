package co.yedam.test;

public class Board {
	private int brdNo;
	private String title;
	private String contents;
	private String writer;
	private String date;
	//
	
	public Board() {
		
	}
	
	public Board(int brdNo, String title, String contents, String writer, String date) {
		super();
		this.brdNo = brdNo;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.date = date;
	}
	
	public Board(int brdNo, String title, String contents) {
		super();
		this.brdNo = brdNo;
		this.title = title;
		this.contents = contents;
	}
	public Board(int brdNo) {
		super();
		this.brdNo = brdNo;
		
	}
	//
	@Override
	public String toString() {
		return "Board [brdNo=" + brdNo + ", title=" + title + ", contents=" + contents + ", writer=" + writer
				+ ", date=" + date + "]";
	}
	//
	public int getBrdNo() {
		return brdNo;
	}
	public void setBrdNo(int brdNo) {
		this.brdNo = brdNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}

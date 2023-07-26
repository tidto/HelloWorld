package co.yedam.morning;

import java.util.Objects;

public class Factory {
	// 상품번호 상품명 가격
	// 카테고리
	private int oCode;
	private String oName;
	private String price;
	private int category;
	private int count;
	
	
	
	public Factory(int oCode, String oName, String price, int category, int count) {
		super();
		this.oCode = oCode;
		this.oName = oName;
		this.price = price;
		this.category = category;
		this.count = count;
	}
	
	public Factory() {

	}
	public int getoCode() {
		return oCode;
	}
	public void setoCode(int oCode) {
		this.oCode = oCode;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}

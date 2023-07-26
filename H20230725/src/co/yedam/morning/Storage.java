package co.yedam.morning;

import java.text.SimpleDateFormat;

public class Storage {
	// 판매/구매수량 판매/구매일

	private int sellNo;
	private int saleNo;
	private String sellIn;
	private String saleIn;
	
	public Storage(int sellNo, int saleNo, String sellIn, String saleIn) {
		super();
		this.sellNo = sellNo;
		this.saleNo = saleNo;
		this.sellIn = sellIn;
		this.saleIn = saleIn;
	}
	public int getSellNo() {
		return sellNo;
	}
	public void setSellNo(int sellNo) {
		this.sellNo = sellNo;
	}
	public int getSaleNo() {
		return saleNo;
	}
	public void setSaleNo(int saleNo) {
		this.saleNo = saleNo;
	}
	public String getSellIn() {
		SimpleDateFormat format=new SimpleDateFormat("yy-MM-dd");
		return format.format(sellIn);
		
	}
	public void setSellIn(String sellIn) {
		this.sellIn = sellIn;
	}
	public String getSaleIn() {
		SimpleDateFormat format=new SimpleDateFormat("yy-MM-dd");
		return format.format(saleIn);	
	}
	public void setSaleIn(String saleIn) {
		this.saleIn = saleIn;
	}
	
	
}

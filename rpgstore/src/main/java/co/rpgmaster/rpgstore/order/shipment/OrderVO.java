package co.rpgmaster.rpgstore.order.shipment;

import java.time.LocalDate;

import lombok.Data;

@Data
public class OrderVO {
	private int orderNo;
	private String shipping;
	private String itemName;
	private int orderEach;
	private LocalDate orderDate;

//	
//	public OrderVO() {
//
//	}
//
//	public OrderVO(int orderNo, String shipping, String itemName, int orderEach, LocalDate orderDate) {
//		super();
//		this.orderNo = orderNo;
//		this.shipping = shipping;
//		this.itemName = itemName;
//		this.orderEach = orderEach;
//		this.orderDate = orderDate;
//	}

//	
	@Override
	public String toString() {
		System.out.print( " Order No[" + orderNo //
				+ "]    < " + shipping //
				+ " > Item No[" + itemName //
				+ "] Each[" + orderEach //
				+ " OrderDate[" + orderDate + "]\n");
		return null;
	}
////	
//
//	public int getOrderNo() {
//		return orderNo;
//	}
//
//	public void setOrderNo(int orderNo) {
//		this.orderNo = orderNo;
//	}
//
//	public String getShipping() {
//		return shipping;
//	}
//
//	public void setShipping(String shipping) {
//		this.shipping = shipping;
//	}
//
//	public String getItemName() {
//		return itemName;
//	}
//
//	public void setItemName(String itemName) {
//		this.itemName = itemName;
//	}
//
//	public int getOrderEach() {
//		return orderEach;
//	}
//
//	public void setOrderEach(int orderEach) {
//		this.orderEach = orderEach;
//	}
//
//	public LocalDate getOrderDate() {
//		return orderDate;
//	}
//
//	public void setOrderDate(LocalDate orderDate) {
//		this.orderDate = orderDate;
//	}
}

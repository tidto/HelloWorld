package co.rpgmaster.rpgstore.order.shipment;


import java.sql.Date;

import lombok.Data;

@Data
public class OrderVO {
	private int orderNo;
	private String shipping;
	private String itemName;
	private int orderEach;
	private Date orderDate;

//	
	public OrderVO() {

	}

	public OrderVO(int orderNo, String shipping, String itemName, int orderEach, Date orderDate) {
		super();
		this.orderNo = orderNo;
		this.shipping = shipping;
		this.itemName = itemName;
		this.orderEach = orderEach;
		this.orderDate = orderDate;
	}

//	
	@Override
	public String toString() {
		return "Order No[" + orderNo //
				+ "]  < " + shipping //
				+ " >  Item No[" + itemName //
				+ "] Each[" + orderEach //
				+ "] OrderDate[" + orderDate + "]";
	}
//	

	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getShipping() {
		return shipping;
	}
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getOrderEach() {
		return orderEach;
	}
	public void setOrderEach(int orderEach) {
		this.orderEach = orderEach;
	}

	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
}

package co.rpgmaster.rpgstore.order.shipment;

import java.sql.Date;

import lombok.Data;

@Data
public class OrderVO {
	private int orderNo;
	private String shipping;
	private int itemNo;
	private int orderEach;
	private Date orderDate;
	
	@Override
	public String toString() {
		System.out.print(orderNo + " ");
		System.out.print(shipping + " ");
		System.out.print(itemNo + " ");
		System.out.print(orderEach + " ");
		System.out.print(orderDate + " ");
		
		return null;
	}
}

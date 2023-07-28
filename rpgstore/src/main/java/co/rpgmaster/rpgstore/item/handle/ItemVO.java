package co.rpgmaster.rpgstore.item.handle;

import lombok.Data;

@Data
public class ItemVO {
	private int itemNo;
	private String itemName;
	private String itemType;
	private int itemPrice;
	private int itemPieces;
	
	@Override
	public String toString() {
		System.out.print(itemNo + " ");
		System.out.print(itemName + " ");
		System.out.print(itemType + " ");
		System.out.print(itemPrice + " ");
		System.out.print(itemPieces + " ");
		return null;
	}
}

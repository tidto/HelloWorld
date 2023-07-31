package co.rpgmaster.rpgstore.item.handle;

import lombok.Data;

@Data
public class ItemVO {
	private int itemNo;
	private String itemName;
	private String itemType;
	private int itemPrice;
	private int itemPieces;
//
	public ItemVO() {
		
	}
	
	public ItemVO(int itemNo, String itemName, String itemType, int itemPrice, int itemPieces) {
		super();
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemPrice = itemPrice;
		this.itemPieces = itemPieces;
	}
@Override
	public String toString() {
		return "No[" + itemNo //
				+ "] Name[" + itemName //
				+ "] Type[" + itemType //
				+ "] Price[" + itemPrice + "GOLD"//
				+ "] Pieces[" + itemPieces + "]";
	}
	
	
	public int getItemNo() {
		return itemNo;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemPieces() {
		return itemPieces;
	}

	public void setItemPieces(int itemPieces) {
		this.itemPieces = itemPieces;
	}
	
}

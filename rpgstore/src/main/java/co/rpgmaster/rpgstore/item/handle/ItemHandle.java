package co.rpgmaster.rpgstore.item.handle;

public interface ItemHandle { // CURD
	int itemInventoryAdd(ItemVO ivo);	// 아이템 새로 추가
	int itemEscalation (ItemVO ivo);	// 아이템 물가변동 가격수정
	int itemFree (ItemVO ivo);  		// 아이템 단종 
	ItemVO itemStock (ItemVO ivo);		// 아이템 재고
	int itemInbound (ItemVO ivo); 		// 아이템 입고
	int itemOutbound (ItemVO ivo); 		// 아이템 출고
}

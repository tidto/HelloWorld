package co.rpgmaster.rpgstore.item.handle;

import java.util.List;

public interface ItemHandle { // CURD
	int itemInventoryAdd(ItemVO ivo);	// 아이템 새로 추가
	int itemEscalation (ItemVO ivo);	// 아이템 물가변동 가격수정
	int itemFree (ItemVO ivo);  		// 아이템 단종 
	List<ItemVO> itemStock ();		// 아이템 재고
	int itemPiecesUp (ItemVO ivo); 		// 피스 업
	int itemPiecesDown (ItemVO ivo); 	// 피스 다움
}

package co.rpgmaster.rpgstore.order.shipment;

import java.util.List;

public interface OrderShipment { // CURD
	List<OrderVO> orderList();		 // 출입고 히스토리 조회
	int itemInbound (OrderVO ovo);	 // 입고목록 작석
	int itemOutbound (OrderVO ovo);  // 출고목록 작성
	int autoOrderNo (); 	 // 다음번호 자동매김
}

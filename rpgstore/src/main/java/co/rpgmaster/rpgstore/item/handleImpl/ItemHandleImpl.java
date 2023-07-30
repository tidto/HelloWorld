package co.rpgmaster.rpgstore.item.handleImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.rpgmaster.rpgstore.connect.DataSource;
import co.rpgmaster.rpgstore.item.handle.ItemHandle;
import co.rpgmaster.rpgstore.item.handle.ItemVO;

public class ItemHandleImpl implements ItemHandle {
	private DataSource source = DataSource.getInstance();
	private Connection connect;
	private PreparedStatement psmt;
	private ResultSet rs;

	@Override
	public int itemInventoryAdd(ItemVO ivo) { // 아이템 새로 추가
		int plus = 0;
		String sql = "INSERT INTO ITEM VALUES(?,?,?,?,?)";
		try {
			connect = source.getConnection();
			psmt = connect.prepareStatement(sql);

			psmt.setInt(1, ivo.getItemNo());
			psmt.setString(2, ivo.getItemName());
			psmt.setString(3, ivo.getItemType());
			psmt.setInt(4, ivo.getItemPrice());
			psmt.setInt(5, ivo.getItemPieces());
			plus = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return plus;
	}

	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (connect != null)
				connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//
	@Override
	public int itemEscalation(ItemVO ivo) { // 아이템 물가변동 가격수정
		String sql = "UPDATE ITEM SET ITEM_PRICE = ? WHERE ITEM_NO = ?";
		int flation = 0;
		try {
			connect = source.getConnection();
			psmt = connect.prepareStatement(sql);
			psmt.setInt(1, ivo.getItemPrice());
			psmt.setInt(2, ivo.getItemNo());
			flation = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flation;
	}
	
//		ItemVO itemvo = new ItemVO();
//		if (flation != 0) {
//			itemvo.setItemName(itemvo.getItemName());
//			itemvo.setItemNo(itemvo.getItemNo());
//
//		}

	@Override
	public int itemFree(ItemVO ivo) { // 아이템 단종
		int free = 0;
		String sql = "DELETE FROM ITEM WHERE ITEM_NO = ?";
		try {
			connect = source.getConnection();
			psmt = connect.prepareStatement(sql);
			psmt.setInt(1, ivo.getItemNo());
			free = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return free;
	}

	@Override
	public int itemInbound(ItemVO ivo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int itemOutbound(ItemVO ivo) {
		// TODO Auto-generated method stub
		return 0;
	}

}

//@Override
//public int productStore(ProductVO vo) {
//	int n = 0;
//	String sql = "UPDATE PRODUCT SET PRODUCT_QUANTITY = PRODUCT_QUANTITY+? WHERE PRODUCT_NUMBER=?";
//	connection = dao.getConnection();
//	WarehousingVO warehousingvo = new WarehousingVO();
//	try {
//		preparedStatement = connection.prepareStatement(sql);
//		preparedStatement.setInt(1, vo.getProductQuantity());
//		preparedStatement.setInt(2, vo.getProductNumber());
//
//		n = preparedStatement.executeUpdate();
//	} catch (SQLException e) {
//		e.printStackTrace();
//	} finally {
//		Close();
//	}
//	if (n != 0) {
//		warehousingvo.setWarehousingNumber(getNextWarehousingNumber());
//		warehousingvo.setProductNumber(vo.getProductNumber());
//		warehousingvo.setWarehousingQuatity(vo.getProductQuantity());
//		warehousingInsert(warehousingvo);
//	}
//	return n;
//}
//
//@Override
//public int warehousingInsert(WarehousingVO vo) {
//	int n = 0;
//	String sql = "INSERT INTO WAREHOUSING(WAREHOUSING_NUMBER,PRODUCT_NUMBER,WAREHOUSING_STATUS,WAREHOUSING_QUATITY) VALUES(?,?,?,?)";
//	connection = dao.getConnection();
//	try {
//		preparedStatement = connection.prepareStatement(sql);
//		preparedStatement.setInt(1, vo.getWarehousingNumber());
//		preparedStatement.setInt(2, vo.getProductNumber());
//		preparedStatement.setString(3, "입고");
//		preparedStatement.setInt(4, vo.getWarehousingQuatity());
//		n = preparedStatement.executeUpdate();
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//
//	return n;
//}
//
//@Override
//public int getNextProductNumber() {
//	String sql = "SELECT NVL(MAX(PRODUCT_NUMBER),0) AS NEXT_PRODUCT_NUMBER FROM PRODUCT";
//	int result = 0;
//	connection = dao.getConnection();
//	try {
//		preparedStatement = connection.prepareStatement(sql);
//		resultSet = preparedStatement.executeQuery();
//		while (resultSet.next()) {
//			result = (resultSet.getInt("next_product_number")) + 1;
//
//		}
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//
//	return result;
//}
//
//@Override
//public int getNextWarehousingNumber() {
//	String sql = "SELECT NVL(MAX(WAREHOUSING_NUMBER),0) AS NEXT_WAREHOUSING_NUMBER FROM WAREHOUSING";
//	int result = 0;
//	connection = dao.getConnection();
//	try {
//		preparedStatement = connection.prepareStatement(sql);
//		resultSet = preparedStatement.executeQuery();
//		while (resultSet.next()) {
//			result = (resultSet.getInt("next_warehousing_number")) + 1;
//
//		}
//	} catch (SQLException e) {
//		e.printStackTrace();
//	} finally {
//		Close();
//	}
//
//	return result;
//}
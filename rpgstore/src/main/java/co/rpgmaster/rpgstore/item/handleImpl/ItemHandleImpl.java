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
		String sql = "INSERT INTO INVENTORY VALUES(?, ?, ?, ?, ?)";
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
		String sql = "UPDATE INVENTORY SET ITEM_PRICE = ? WHERE ITEM_NO = ?";
		int flation = 0;
		try {
			connect = source.getConnection();
			psmt = connect.prepareStatement(sql);
			psmt.setInt(1, ivo.getItemPrice());
			psmt.setInt(2, ivo.getItemNo());
			flation = psmt.executeUpdate(); // executeUpate로 인정되면 1값으로 아니면 0
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flation;
	}
	@Override
	public int itemFree(ItemVO ivo) { // 아이템 단종
		int free = 0;
		String sql = "DELETE FROM INVENTORY WHERE ITEM_NO = ?";
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
	public ItemVO itemStock(ItemVO ivo) { // 아이템 타입별 재고확인
		String sql = "SELECT * FROM INVENTORY WHERE ITEM_TYPE = ? ORDER BY ITEM_NO, ITEM_PIECES"; 
		try {
			connect = source.getConnection();
			psmt = connect.prepareStatement(sql);
			psmt.setString(1, ivo.getItemType());
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				ivo.setItemNo(rs.getInt("item_no"));
				ivo.setItemName(rs.getString("item_name"));
				ivo.setItemType(rs.getString("item_type"));
				ivo.setItemPrice(rs.getInt("item_price"));
				ivo.setItemPieces(rs.getInt("item_pieces"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return ivo;
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